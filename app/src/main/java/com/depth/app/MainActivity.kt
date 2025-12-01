
package com.depth.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.depth.app.ui.DepthApp

class MainActivity: ComponentActivity(){
 override fun onCreate(b:Bundle?){
   super.onCreate(b)
   setContent{ DepthApp() }
 }
}
