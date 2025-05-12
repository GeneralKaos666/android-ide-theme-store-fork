pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
    resolutionStrategy {
        eachPlugin {
            // Some plugins are not on the Gradle Plugins portal and require trickery to resolve
            // since Maven repos know nothing of plugin IDs.
            when (requested.id.id) {
                "dagger.hilt.android.plugin" -> {
                    useModule("com.google.dagger:hilt-android-gradle-plugin:${requested.version}")
                }
                "com.google.firebase.crashlytics" -> {
                    useModule("com.google.firebase.crashlytics:com.google.firebase.crashlytics.gradle.plugin:${requested.version}")
                }
                "shot" -> {
                    useModule("com.karumi:shot:${requested.version}")
                }
            }
        }
    }
}

/*
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
*/

rootProject.name = "AndroidIDE-Themes"
include(":app")

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
