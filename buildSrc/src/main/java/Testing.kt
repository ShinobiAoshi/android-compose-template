object Testing {

    object Versions {
        const val ESPRESSO = "3.4.0"
        const val JUNIT = "4.13.2"
        const val JUNIT_EXTENSION = "1.1.3"
        const val JUNIT_COMPOSE = Libraries.Versions.AndroidX.COMPOSE
    }

    object Dependencies {
        object JUnit {
            const val CORE = "junit:junit:${Versions.JUNIT}"
            const val EXTENSION = "androidx.test.ext:junit:${Versions.JUNIT_EXTENSION}"
            const val COMPOSE = "androidx.compose.ui:ui-test-junit4:${Versions.JUNIT_COMPOSE}"
        }

        object Espresso {
            const val CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
        }
    }
}
