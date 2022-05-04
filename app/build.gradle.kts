plugins {
    id(Plugins.Ids.ANDROID_APPLICATION)
    kotlin(Plugins.Ids.KOTLIN_ANDROID)
    kotlin(Plugins.Ids.KOTLIN_KAPT)
    id(Plugins.Ids.HILT)
}

android {
    compileSdk = App.COMPILE_SDK

    defaultConfig {
        applicationId = App.ID
        minSdk = App.MIN_SDK
        targetSdk = App.TARGET_SDK
        versionCode = App.VERSION_CODE
        versionName = App.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = App.JAVA
        targetCompatibility = App.JAVA
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
        viewBinding = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Libraries.Versions.AndroidX.COMPOSE
    }

    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libraries.Dependencies.AndroidX.ACTIVITY)
    implementation(Libraries.Dependencies.AndroidX.Compose.MATERIAL)
    implementation(Libraries.Dependencies.AndroidX.Compose.UI)
    implementation(Libraries.Dependencies.AndroidX.Compose.UI_TOOLING)
    implementation(Libraries.Dependencies.Google.Hilt.ANDROID)
    kapt(Libraries.Dependencies.Google.Hilt.COMPILER)
    implementation(Libraries.Dependencies.AndroidX.HILT_NAVIGATION)

    implementation(Libraries.Dependencies.Moshi.CORE)
    kapt(Libraries.Dependencies.Moshi.CODEGEN)
    implementation(Libraries.Dependencies.Moshi.RETROFIT_CONVERTER)

    implementation(Libraries.Dependencies.COROUTINES_ANDROID)
    implementation(Libraries.Dependencies.RETROFIT)
    implementation(Libraries.Dependencies.HTTP_LOGGING_INTERCEPTOR)

    testImplementation(Testing.Dependencies.JUnit.CORE)
    androidTestImplementation(Testing.Dependencies.JUnit.EXTENSION)
    androidTestImplementation(Testing.Dependencies.JUnit.COMPOSE)
    androidTestImplementation(Testing.Dependencies.Espresso.CORE)
}