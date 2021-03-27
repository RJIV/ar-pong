@Suppress("ClassName", "SpellCheckingInspection")

object Dependencies {
    private const val KOTLIN_VERSION = "1.4.31"

    object Kotlin {
        const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.31"

        object Coroutines {
            private const val VERSION = "1.4.1"

            const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VERSION"
            const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VERSION"
            const val JDK8 = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:$VERSION"
        }
    }

    object Android {
        object Tools {
            object Build {
                const val Gradle = "com.android.tools.build:gradle:4.1.3"
            }
        }
    }

    object Androidx {
        object AppCompat {
            const val APPCOMPAT = "androidx.appcompat:appcompat:1.2.0"
        }

        object Core {
            const val CORE_KTX = "androidx.core:core-ktx:1.3.2"
        }

        object ConstraintLayout {
            const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.4"
        }

        object Lifecycle {
            const val LIFECYLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:2.2.0"
            const val LIFECYCLE_VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.3.1"
        }

        object Legacy {
            const val LEGACY_SUPPORT_V4 = "androidx.legacy:legacy-support-v4:1.0.0"
        }

        object Test {
            const val RUNNER = "androidx.test:runner:1.3.0"

            object Espresso {
                const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.3.0"
            }
        }
    }

    object Google {
        object Android {
            object Material {
                const val MATERIAL = "com.google.android.material:material:1.3.0"
            }
        }

        object AR {
            const val CORE = "com.google.ar:core:1.23.0"

            object Sceneform {
                private const val VERSION = "1.17.1"
                const val PLUGIN = "com.google.ar.sceneform:plugin:$VERSION"

                object UX {
                    const val SCENEFORM_UX = "com.google.ar.sceneform.ux:sceneform-ux:$VERSION"
                }
            }
        }
    }

    object Jetbrains {
        object Kotlin {
            const val KOTLIN_GRADLE_PLUGIN =
                "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
        }
    }

    object JUnit {
        const val JUNIT = "junit:junit:4.13.2"
    }

    object BumpTech {
        object Glide {
            const val GLIDE = "com.github.bumptech.glide:glide:4.12.0"
        }
    }
}

object BuildConfigVersions {
    const val COMPILE_SDK_VERSION = 30
    const val BUILD_TOOLS_VERSION = "30.0.2"
    const val MIN_SDK_VERSION = 26
    const val TARGET_SDK_VERSION = 30
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}