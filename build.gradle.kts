// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin) apply false
    //id("kotlin-parcelize") apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    kotlin("kapt") version "2.0.20" apply false
    id("com.google.dagger.hilt.android") version "2.52" apply false
//    kotlin("jvm") version "2.0.20" apply false
}