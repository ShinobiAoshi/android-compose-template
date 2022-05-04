buildscript {

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    dependencies {
        classpath(Plugins.Dependencies.ANDROID_GRADLE)
        classpath(Plugins.Dependencies.KOTLIN)
        classpath(Plugins.Dependencies.HILT)
    }
}

plugins {
    id(Plugins.Ids.GRADLE_VERSIONS) version(Plugins.Versions.GRADLE_VERSIONS)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}