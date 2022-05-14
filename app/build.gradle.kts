/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("org.valdi.kurumichan.java-application-conventions")

    /*
     * Adds tasks to export a runnable jar.
     * In order to create it, launch the "shadowJar" task.
     * The runnable jar will be found in build/libs/projectname-all.jar
     */
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

repositories {
    maven {
        url = uri("https://maven.pkg.github.com/Valdi1111/anime-downloader")
        credentials {
            username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_USERNAME")
            password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    //implementation("org.valdi:animedownloader-api:1.0.0")
}

application {
    // Define the main class for the application.
    mainClass.set("org.valdi.kurumichan.app.App")
}
