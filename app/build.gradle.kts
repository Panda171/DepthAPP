
plugins {
 id("com.android.application")
 id("org.jetbrains.kotlin.android")
}

android {
 namespace="com.depth.app"
 compileSdk=34
 defaultConfig {
  applicationId="com.depth.app"
  minSdk=24
  targetSdk=34
  versionCode=1
  versionName="1.0"
 }
 buildFeatures { compose=true }
 composeOptions { kotlinCompilerExtensionVersion="1.5.3" }
 compileOptions {
  sourceCompatibility=JavaVersion.VERSION_17
  targetCompatibility=JavaVersion.VERSION_17
 }
 kotlinOptions { jvmTarget="17" }
}

dependencies {
 val composeBom = platform("androidx.compose:compose-bom:2023.10.01")
 implementation(composeBom)
 implementation("androidx.compose.ui:ui")
 implementation("androidx.compose.material3:material3")
 implementation("androidx.compose.ui:ui-tooling-preview")
 debugImplementation("androidx.compose.ui:ui-tooling")
 implementation("androidx.activity:activity-compose:1.9.0")
 implementation("androidx.navigation:navigation-compose:2.7.7")
 implementation("androidx.compose.material:material-icons-extended")
 implementation("org.maplibre.gl:android-sdk:10.2.0")
}
