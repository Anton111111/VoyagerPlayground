plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Versions.COMPILE_SDK
    defaultConfig {
        applicationId = "com.anton111111.anorak"
        minSdk = Versions.MIN_SDK
        targetSdk = Versions.TARGET_SDK
        versionCode = Versions.versionCodeMobile
        versionName = Versions.versionName
        vectorDrawables.useSupportLibrary = true

        applicationVariants.all {
            val variant = this
            variant.outputs
                .map { it as com.android.build.gradle.internal.api.BaseVariantOutputImpl }
                .forEach { output ->
                    output.outputFileName = "anorak.${variant.versionName}.apk"
                }
        }

    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("debug") {
            versionNameSuffix = "-debug"
        }
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
    namespace = "com.anton111111.anorak"

}

dependencies {
    api(platform(project(":depconstraints")))
    kapt(platform(project(":depconstraints")))
    implementation(project(":shared:theme"))
    implementation(project(":feature:movies:ui"))

    implementation(Libs.CORE_KTX)

    // Compose
    implementCompose()

    // UI
    implementation(Libs.ACTIVITY_KTX)
    //implementation(Libs.ACCOMPANIST_SYSTEMUICONTROLLER)
    //implementation(Libs.ACCOMPANIST_INSETS)
    implementation(Libs.ACCOMPANIST_NAV_MATERIAL)

    // Voyager
    implementVoyager()

    // Architecture Components
    implementation(Libs.LIFECYCLE_VIEW_MODEL_KTX)
    implementRetrofit()
    implementRoom()

    // Dagger Hilt
    implementHilt()

    // Kotlin
    implementKotlin()
}

kapt {
    correctErrorTypes = true
}