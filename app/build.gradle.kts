plugins {
    alias(libs.plugins.android.application)
}

android {
<<<<<<< HEAD
    namespace = "com.example.location"
=======
    namespace = "com.example.location2"
>>>>>>> 468ead6 (Add Grid View implementation)
    compileSdk {
        version = release(36)
    }

    defaultConfig {
<<<<<<< HEAD
        applicationId = "com.example.location"
=======
        applicationId = "com.example.location2"
>>>>>>> 468ead6 (Add Grid View implementation)
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}