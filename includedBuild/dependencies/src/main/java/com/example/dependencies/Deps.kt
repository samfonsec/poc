package com.example.dependencies

object Deps {

    private const val kotlin_version = "1.4.32"
    private const val coroutines_version = "1.3.9"
    private const val app_compat_version = "1.2.0"
    private const val core_version = "1.3.2"
    private const val constraint_version = "1.3.9"
    private const val lifecycle_version = "2.2.0"
    private const val navigation_version = "2.3.5"
    private const val play_core_version = "1.6.4"
    private const val material_version = "1.1.0"
    private const val koin_version = "2.2.2"
    private const val retrofit_version = "2.6.0"
    private const val gson_version = "2.8.6"
    private const val junit_version = "4.12"
    private const val test_version = "1.1.2"
    private const val espresso_version = "3.3.0"

    object Kotlin {
        val stdlib = StdLib()

        class StdLib(
            private val name: String = "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
        ) : CharSequence by name {

            override fun toString(): String = name
        }
    }

    object KotlinX {
        val coroutine = Coroutines

        object Coroutines {
            val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version"
        }

    }

    object Android {
//        const val plugin = ""
        val androidX = AndroidX

        object AndroidX {
            const val appcompat = "androidx.appcompat:appcompat:$app_compat_version"
            const val core = "androidx.core:core-ktx:$core_version"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraint_version"
            const val lifeCycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
            const val lifeCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
            const val navigationLib = "androidx.navigation:navigation-fragment-ktx:$navigation_version"
            const val navigationUI = "androidx.navigation:navigation-ui-ktx:$navigation_version"
            const val dynamicFeature = "androidx.navigation:navigation-dynamic-features-fragment:$navigation_version"

        }
    }

    object Google {
        const val playCore = "com.google.android.play:core:$play_core_version"
        const val material = "com.google.android.material:material:$material_version"
        const val gson = "com.google.code.gson:gson:$gson_version"
    }

    object Koin {
        const val android = "org.koin:koin-android:$koin_version"
        const val viewModel = "org.koin:koin-android-viewmodel:$koin_version"
    }

    object Retrofit {
        const val core = "com.squareup.retrofit2:retrofit:$retrofit_version"
        const val converter = "com.squareup.retrofit2:converter-gson:$retrofit_version"
    }

    object Tests {
        val junit = Junit()
        val androidXTest = AndroidXTest

        class Junit(
            private val name: String = "junit:junit:$junit_version"
        ) : CharSequence by name {
            override fun toString(): String = name
        }

        object AndroidXTest {
            const val core = "androidx.test.ext:junit:$test_version"
            const val espresso = "androidx.test.espresso:espresso-core:$espresso_version"
        }
    }

}