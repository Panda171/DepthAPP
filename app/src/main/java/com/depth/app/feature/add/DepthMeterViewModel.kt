package com.depth.app.feature.add

import androidx.lifecycle.ViewModel
import com.depth.app.domain.model.DepthMeterConfig
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * ViewModel для работы с глубиномером (корабликом / эхолотом).
 *
 * Здесь мы храним:
 * - текущую калибровку глубины;
 * - последние "сырые" показания с ESP32;
 * - последние откалиброванные координаты и глубину;
 * - статус подключения к ESP32.
 *
 * В реальном приложении сюда нужно добавить слой BLE, который будет:
 * - находить устройство по BLE;
 * - подписываться на уведомления с измерениями;
 * - отправлять калибровку на ESP32.
 */
@HiltViewModel
class DepthMeterViewModel @Inject constructor() : ViewModel() {

    // Текущие настройки глубиномера (калибровка)
    private val _config = MutableStateFlow(DepthMeterConfig())
    val config: StateFlow<DepthMeterConfig> = _config.asStateFlow()

    // "Сырые" данные с ESP32 (как прислал контроллер, без дополнительной обработки на телефоне)
    private val _rawDepth = MutableStateFlow<Float?>(null)
    val rawDepth: StateFlow<Float?> = _rawDepth.asStateFlow()

    // Последняя глубина с учётом калибровки на стороне приложения
    private val _lastDepthMeters = MutableStateFlow<Float?>(null)
    val lastDepthMeters: StateFlow<Float?> = _lastDepthMeters.asStateFlow()

    // Координаты последнего измерения
    private val _lastLat = MutableStateFlow<Double?>(null)
    val lastLat: StateFlow<Double?> = _lastLat.asStateFlow()

    private val _lastLon = MutableStateFlow<Double?>(null)
    val lastLon: StateFlow<Double?> = _lastLon.asStateFlow()

    // Статус подключения к ESP32 (демо-флаг)
    private val _isConnected = MutableStateFlow(false)
    val isConnected: StateFlow<Boolean> = _isConnected.asStateFlow()

    /**
     * Обновляем флаг подключения.
     * В реальном приложении это должно вызываться из BLE-слоя.
     */
    fun setConnected(connected: Boolean) {
        _isConnected.value = connected
    }

    /**
     * Обновляем калибровку глубины.
     * Это смещение в метрах (положительное или отрицательное).
     *
     * Например:
     *  +0.3  если датчик выше уровня воды на 30 см;
     *  -0.2  если нужно "занижать" показания.
     */
    fun updateCalibration(offsetMeters: Float) {
        _config.value = _config.value.copy(calibrationOffsetMeters = offsetMeters)
        // TODO: здесь нужно отправить offsetMeters на ESP32 по BLE (характеристика калибровки)
    }

    /**
     * Метод вызывается, когда с ESP32 пришли новые данные о глубине и координатах.
     *
     * rawDepthMeters — глубина, уже посчитанная на стороне ESP32
     *                  с учётом скорости звука в воде и фильтрации по времени.
     *
     * На стороне приложения мы только:
     * - сохраняем "сырые" данные;
     * - добавляем свою калибровку (для точной подстройки);
     * - обновляем последние координаты.
     */
    fun onDepthFromSensor(
        rawDepthMeters: Float,
        lat: Double?,
        lon: Double?
    ) {
        // Сохраняем сырые данные для отображения пользователю
        _rawDepth.value = rawDepthMeters

        // Применяем калибровку приложения
        val corrected = rawDepthMeters + _config.value.calibrationOffsetMeters
        _lastDepthMeters.value = corrected

        _lastLat.value = lat
        _lastLon.value = lon
    }
}
