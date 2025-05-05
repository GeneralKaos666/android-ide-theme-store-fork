import org.gradle.api.Project
import org.gradle.api.file.RegularFile
import org.gradle.api.provider.Provider

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin) apply false
    //id("kotlin-parcelize") apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    //kotlin("kapt") version "2.0.20" apply false
    alias(libs.plugins.hiltAndroid) apply false
    alias(libs.plugins.kotlinAndroidKsp) apply false
//    kotlin("jvm") version "2.0.20" apply false
    alias(libs.plugins.version.catalog.update) apply false
}

//apply(rootProject.layout.buildDirectory.file("../buildscripts/toml-updater-config.gradle"))

apply("${project.rootDir}/buildscripts/toml-updater-config.gradle")
