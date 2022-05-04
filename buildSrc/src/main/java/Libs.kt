import org.gradle.api.artifacts.dsl.DependencyHandler

object Libs {
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7"
    const val KOTLIN_COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core"
    const val CORE_KTX = "androidx.core:core-ktx"

    // Hilt
    const val HILT = "com.google.dagger:hilt-android"
    const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler"

    // Voyager
    const val VOYAGER_NAVIGATOR = "cafe.adriel.voyager:voyager-navigator"
    const val VOYAGER_HILT = "cafe.adriel.voyager:voyager-hilt"


    // Architecture components
    const val LIFECYCLE_VIEW_MODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx"
    const val LIFECYCLE_VIEW_MODEL_COMPOSE = "androidx.lifecycle:lifecycle-viewmodel-compose"
    const val PAGING = "androidx.paging:paging-runtime"
    const val PAGING_COMPOSE= "androidx.paging:paging-compose"
    const val PAGING_COMMON = "androidx.paging:paging-common"

    // Compose
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose"
    const val COMPOSE_RUNTIME = "androidx.compose.runtime:runtime"
    const val COMPOSE_COMPILER = "androidx.compose.compiler:compiler"
    const val COMPOSE_UI = "androidx.compose.ui:ui"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling"
    const val COMPOSE_MATERIAL = "androidx.compose.material:material"
    const val COMPOSE_MATERIAL_ICONS_EXTENDED = "androidx.compose.material:material-icons-extended"
    const val COMPOSE_MATERIAL3 = "androidx.compose.material3:material3"
    const val COMPOSE_COIL = "io.coil-kt:coil-compose"

    // Accompanist
    const val ACCOMPANIST_NAV_MATERIAL = "com.google.accompanist:accompanist-navigation-material"
    const val ACCOMPANIST_FLOWLAYOUT = "com.google.accompanist:accompanist-flowlayout"
    const val ACCOMPANIST_SYSTEMUICONTROLLER = "com.google.accompanist:accompanist-systemuicontroller"
    const val ACCOMPANIST_PLACEHOLDERS_MATERIAL = "com.google.accompanist:accompanist-placeholder-material"
    const val ACCOMPANIST_SWIPE_TO_REFRESH = "com.google.accompanist:accompanist-swiperefresh"

    // UI
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx"

    // Data
    const val DATA_STORE_PREFERENCES = "androidx.datastore:datastore-preferences"
    const val RETROFIT = "com.squareup.retrofit2:retrofit"
    const val RETROFIT_CONVERTER_MOSHI = "com.squareup.retrofit2:converter-moshi"
    const val OKHTTP_BOM = "com.squareup.okhttp3:okhttp-bom"
    const val OKHTTP = "com.squareup.okhttp3:okhttp"
    const val OKHTTP_LOGGER_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor"
    const val ROOM = "androidx.room:room-ktx"
    const val ROOM_RUNTIME = "androidx.room:room-runtime"
    const val ROOM_COMPILER = "androidx.room:room-compiler"
    const val ROOM_PAGING = "androidx.room:room-paging"
    const val MOSHI = "com.squareup.moshi:moshi-kotlin"

    // Tests
    const val JUNIT_JUPITER_API = "org.junit.jupiter:junit-jupiter-api"
    const val JUNIT_JUPITER_ENGINE = "org.junit.jupiter:junit-jupiter-engine"
    const val MOCKK = "io.mockk:mockk"
}

fun DependencyHandler.implementRetrofit() {
    add("implementation", Libs.RETROFIT)
    add("implementation", Libs.RETROFIT_CONVERTER_MOSHI)
    // OkHttp
    add("implementation", platform(Libs.OKHTTP_BOM))
    add("implementation", Libs.OKHTTP)
    add("implementation", Libs.OKHTTP_LOGGER_INTERCEPTOR)
}

fun DependencyHandler.implementRoom() {
    add("implementation", Libs.ROOM_RUNTIME)
    add("implementation", Libs.ROOM)
    add("implementation", Libs.ROOM_PAGING)
    add("kapt", Libs.ROOM_COMPILER)
}

fun DependencyHandler.implementHilt() {
    add("implementation", Libs.HILT)
    add("kapt", Libs.HILT_COMPILER)
}

fun DependencyHandler.implementKotlin() {
    add("implementation", Libs.KOTLIN)
    add("implementation", Libs.KOTLIN_COROUTINES)
}

fun DependencyHandler.implementJUnit() {
    add("testImplementation", Libs.JUNIT_JUPITER_API)
    add("testRuntimeOnly", Libs.JUNIT_JUPITER_ENGINE)
    add("testImplementation", Libs.MOCKK)
}

fun DependencyHandler.implementCompose() {
    add("implementation", Libs.COMPOSE_ACTIVITY)
    add("implementation", Libs.COMPOSE_COMPILER)
    add("implementation", Libs.COMPOSE_RUNTIME)
    add("implementation", Libs.COMPOSE_UI)
    add("implementation", Libs.COMPOSE_UI_TOOLING)
    add("implementation", Libs.COMPOSE_MATERIAL)
    add("implementation", Libs.COMPOSE_MATERIAL_ICONS_EXTENDED)
    add("implementation", Libs.COMPOSE_MATERIAL3)
}

fun DependencyHandler.implementVoyager() {
    add("implementation", Libs.VOYAGER_NAVIGATOR)
    add("implementation", Libs.VOYAGER_HILT)
}