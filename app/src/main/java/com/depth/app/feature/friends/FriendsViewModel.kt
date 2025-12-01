package com.depth.app.feature.friends

import android.content.Context
import android.provider.ContactsContract
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

data class Friend(
    val name: String,
    val avatarUrl: String? = null
)

@HiltViewModel
class FriendsViewModel @Inject constructor() : ViewModel() {

    private val _friends = MutableStateFlow<List<Friend>>(emptyList())
    val friends: StateFlow<List<Friend>> = _friends.asStateFlow()

    private val _filteredFriends = MutableStateFlow<List<Friend>>(emptyList())
    val filteredFriends: StateFlow<List<Friend>> = _filteredFriends.asStateFlow()

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _contactsImported = MutableStateFlow(false)
    val contactsImported: StateFlow<Boolean> = _contactsImported.asStateFlow()

    init {
        val demo = listOf(
            Friend("Иван Петров"),
            Friend("Алексей Рыбаков"),
            Friend("Михаил Дноходов"),
            Friend("Сергей Волна")
        )
        _friends.value = demo
        _filteredFriends.value = demo
    }

    fun updateSearch(query: String) {
        _searchQuery.value = query
        _filteredFriends.value = _friends.value.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }

    fun loadContacts(ctx: Context) {
        viewModelScope.launch {
            val list = mutableListOf<Friend>()
            val cursor = ctx.contentResolver.query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                arrayOf(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME),
                null, null, null
            )
            cursor?.use {
                while (it.moveToNext()) {
                    val name = it.getString(0)
                    list.add(Friend(name))
                }
            }
            if (list.isNotEmpty()) {
                _friends.value = list
                _filteredFriends.value = list
                _contactsImported.value = true
            }
        }
    }
}
