package com.depth.app.feature.add;

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
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/depth/app/feature/add/DepthMeterViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_config", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/depth/app/domain/model/DepthMeterConfig;", "_isConnected", "", "_lastDepthMeters", "", "_lastLat", "", "_lastLon", "_rawDepth", "config", "Lkotlinx/coroutines/flow/StateFlow;", "getConfig", "()Lkotlinx/coroutines/flow/StateFlow;", "isConnected", "lastDepthMeters", "getLastDepthMeters", "lastLat", "getLastLat", "lastLon", "getLastLon", "rawDepth", "getRawDepth", "onDepthFromSensor", "", "rawDepthMeters", "lat", "lon", "(FLjava/lang/Double;Ljava/lang/Double;)V", "setConnected", "connected", "updateCalibration", "offsetMeters", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class DepthMeterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.depth.app.domain.model.DepthMeterConfig> _config = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.depth.app.domain.model.DepthMeterConfig> config = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Float> _rawDepth = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Float> rawDepth = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Float> _lastDepthMeters = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Float> lastDepthMeters = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> _lastLat = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Double> lastLat = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Double> _lastLon = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Double> lastLon = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isConnected = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isConnected = null;
    
    @javax.inject.Inject()
    public DepthMeterViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.depth.app.domain.model.DepthMeterConfig> getConfig() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Float> getRawDepth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Float> getLastDepthMeters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Double> getLastLat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Double> getLastLon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isConnected() {
        return null;
    }
    
    /**
     * Обновляем флаг подключения.
     * В реальном приложении это должно вызываться из BLE-слоя.
     */
    public final void setConnected(boolean connected) {
    }
    
    /**
     * Обновляем калибровку глубины.
     * Это смещение в метрах (положительное или отрицательное).
     *
     * Например:
     * +0.3  если датчик выше уровня воды на 30 см;
     * -0.2  если нужно "занижать" показания.
     */
    public final void updateCalibration(float offsetMeters) {
    }
    
    /**
     * Метод вызывается, когда с ESP32 пришли новые данные о глубине и координатах.
     *
     * rawDepthMeters — глубина, уже посчитанная на стороне ESP32
     *                 с учётом скорости звука в воде и фильтрации по времени.
     *
     * На стороне приложения мы только:
     * - сохраняем "сырые" данные;
     * - добавляем свою калибровку (для точной подстройки);
     * - обновляем последние координаты.
     */
    public final void onDepthFromSensor(float rawDepthMeters, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Double lon) {
    }
}