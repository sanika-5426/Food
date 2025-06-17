pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google() // Ensures access to Google's dependencies
        mavenCentral()
    }
}

rootProject.name = "Foodtrack"
include(":app")
