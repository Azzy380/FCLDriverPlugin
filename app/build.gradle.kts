plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.mio.plugin.renderer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mio.plugin.renderer"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "4.5"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
        }
        configureEach {
            resValue("string", "app_name", "Turnip 710 720 722 v4.5")
            applicationIdSuffix = ".turnip710720722v45"
            manifestPlaceholders["driver"] = "Turnip 710 720 722 v4.5"
            manifestPlaceholders["driverLib"] = "libvulkan_freedreno.so"
            manifestPlaceholders["driverGpu"] = "adreno"
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
}
