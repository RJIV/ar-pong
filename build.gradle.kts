// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Dependencies.Android.Tools.Build.Gradle)
        classpath(Dependencies.Jetbrains.Kotlin.KOTLIN_GRADLE_PLUGIN)
        classpath(Dependencies.Google.AR.Sceneform.PLUGIN)
    }
}
allprojects {
    repositories {
        google()
        jcenter()
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
