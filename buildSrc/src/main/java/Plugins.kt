object Plugins {
    object Versions {
        const val ANDROID_GRADLE = "7.1.3"
        const val KOTLIN = Libraries.Versions.KOTLIN
        const val HILT = Libraries.Versions.Google.HILT
        const val GRADLE_VERSIONS = "0.42.0"
    }

    object Dependencies {
        const val ANDROID_GRADLE = "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE}"
        const val KOTLIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
        const val HILT = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
    }

    object Ids {
        const val ANDROID_APPLICATION = "com.android.application"
        const val KOTLIN_ANDROID = "android"
        const val KOTLIN_KAPT = "kapt"
        const val HILT = "dagger.hilt.android.plugin"
        const val GRADLE_VERSIONS = "com.github.ben-manes.versions"
    }
}