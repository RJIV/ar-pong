plugins {
    id("com.android.application")
    id("com.google.ar.sceneform.plugin")
    kotlin("android")
}

android {
    compileSdkVersion(BuildConfigVersions.COMPILE_SDK_VERSION)
    buildToolsVersion(BuildConfigVersions.BUILD_TOOLS_VERSION)
    defaultConfig {
        applicationId = "com.hamilton.arpong"
        minSdkVersion(BuildConfigVersions.MIN_SDK_VERSION)
        targetSdkVersion(BuildConfigVersions.TARGET_SDK_VERSION)
        versionCode = BuildConfigVersions.VERSION_CODE
        versionName = BuildConfigVersions.VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Kotlin.STDLIB)
    implementation(Dependencies.Androidx.AppCompat.APPCOMPAT)
    implementation(Dependencies.Androidx.Core.CORE_KTX)
    implementation(Dependencies.Androidx.ConstraintLayout.CONSTRAINT_LAYOUT)
    implementation(Dependencies.Androidx.Lifecycle.LIFECYLE_EXTENSIONS)
    implementation(Dependencies.Androidx.Lifecycle.LIFECYCLE_VIEWMODEL_KTX)
    implementation(Dependencies.Androidx.Legacy.LEGACY_SUPPORT_V4)
    androidTestImplementation(Dependencies.Androidx.Test.RUNNER)
    androidTestImplementation(Dependencies.Androidx.Test.Espresso.ESPRESSO_CORE)
    testImplementation(Dependencies.JUnit.JUNIT)

    // Google
    implementation(Dependencies.Google.Android.Material.MATERIAL)
    implementation(Dependencies.Google.AR.CORE)
    implementation(Dependencies.Google.AR.Sceneform.UX.SCENEFORM_UX)

    // Kotlin Coroutines
    implementation(Dependencies.Kotlin.Coroutines.CORE)
    implementation(Dependencies.Kotlin.Coroutines.ANDROID)
    implementation(Dependencies.Kotlin.Coroutines.JDK8)

    //Gif dependency
    implementation(Dependencies.BumpTech.Glide.GLIDE) {
        exclude("com.android.support")
    }
}
