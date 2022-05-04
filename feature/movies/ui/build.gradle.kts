plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Versions.COMPILE_SDK
    defaultConfig {
        minSdk = Versions.MIN_SDK
        targetSdk = Versions.TARGET_SDK
    }

    // To avoid the compile error: "Cannot inline bytecode built with JVM target 1.8
    // into bytecode that is being built with JVM target 1.6"
    kotlinOptions {
        val options = this as org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
        options.jvmTarget = "11"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_COMPILER
    }
    namespace = "com.anton111111.anorak.movies.ui"
}

dependencies {
    api(platform(project(":depconstraints")))
    kapt(platform(project(":depconstraints")))
    implementation(project(":shared:theme"))
    implementation(project(":shared:ui"))

    implementation(Libs.CORE_KTX)

    // Compose
    implementCompose()

    // Accompanist
    implementation(Libs.ACCOMPANIST_PLACEHOLDERS_MATERIAL)

    //UI
    implementation(Libs.COMPOSE_COIL)

    // Architecture Components
    implementation(Libs.LIFECYCLE_VIEW_MODEL_KTX)
    implementation(Libs.PAGING)
    implementation(Libs.PAGING_COMPOSE)

    // Voyager
    implementVoyager()

    // Dagger Hilt
    implementHilt()

    // Kotlin
    implementKotlin()
}