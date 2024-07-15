
// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    extra.apply {
        set("nav_version", "2.6.0")
        set("room_version", "2.5.2")
        set("arch_lifecycle_version", "2.6.1")
    }
}
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false

    id("com.android.library") version "8.1.0" apply false
    id("androidx.navigation.safeargs") version "2.6.0" apply false
}