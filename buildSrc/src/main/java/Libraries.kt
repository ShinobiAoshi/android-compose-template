object Libraries {
    object Versions {
        const val KOTLIN = "1.6.21"
        const val COROUTINES_ANDROID = "1.3.9"
        const val MOSHI = "1.13.0"
        const val RETROFIT = "2.9.0"
        const val HTTP_LOGGING_INTERCEPTOR = "4.9.0"

        object AndroidX {
            const val COMPOSE = "1.1.1"
            const val ACTIVITY_COMPOSE = "1.4.0"
            const val HILT_NAVIGATION = "1.0.0"
            const val LIFECYCLE_VIEWMODEL_COMPOSE = "2.4.1"
        }

        object Google {
            const val HILT = "2.41"
        }
    }

    object Dependencies {

        const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES_ANDROID}"
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val HTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${Versions.HTTP_LOGGING_INTERCEPTOR}"

        object AndroidX {
            const val ACTIVITY = "androidx.activity:activity-compose:${Versions.AndroidX.ACTIVITY_COMPOSE}"
            const val HILT_NAVIGATION = "androidx.hilt:hilt-navigation-compose:${Versions.AndroidX.HILT_NAVIGATION}"
            const val LIFECYCLE_VIEWMODEL_COMPOSE = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.AndroidX.LIFECYCLE_VIEWMODEL_COMPOSE}"

            object Compose {
                const val MATERIAL = "androidx.compose.material:material:${Versions.AndroidX.COMPOSE}"
                const val UI = "androidx.compose.ui:ui:${Versions.AndroidX.COMPOSE}"
                const val UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.AndroidX.COMPOSE}"
            }
        }

        object Google {
            object Hilt {
                const val COMPILER = "com.google.dagger:hilt-compiler:${Versions.Google.HILT}"
                const val ANDROID = "com.google.dagger:hilt-android:${Versions.Google.HILT}"
            }
        }

        object Moshi {
            const val CORE = "com.squareup.moshi:moshi:${Versions.MOSHI}"
            const val CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.MOSHI}"
            const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT}"
        }
    }
}
