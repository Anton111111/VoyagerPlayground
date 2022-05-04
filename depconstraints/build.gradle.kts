plugins {
    id("java-platform")
}

val appcompat = "1.3.1"
val core = "1.9.0-alpha02"
val lifecycle = "2.5.0-beta01"
val navigationKtx = "2.4.2"
val hilt = Versions.HILT
val hiltNavigationCompose = "1.0.0"
val activity = "1.6.0-alpha01"
val kotlin = Versions.KOTLIN
val kotlinCoroutines = "1.6.1"
val datastore = "1.0.0"
val room = "2.4.2"
val retrofit = "2.9.0"
val okhttp = "4.9.3"
val paging = "3.1.1"
val pagingCompose = "1.0.0-alpha14"
val junitJupiter = "5.7.2"
val mockk = "1.12.0"
val composeNavigation = "2.5.0-beta01"
val compose = "1.2.0-alpha07"
val composeMaterial3 = "1.0.0-alpha09"
val composeCoil = "2.0.0-rc03"
val moshi = "1.12.0"
val accompanist = "0.24.6-alpha"
val voyager = "1.0.0-rc02"

dependencies {
    constraints {
        api("${Libs.CORE_KTX}:$core")
        api("${Libs.LIFECYCLE_VIEW_MODEL_KTX}:$lifecycle")
        api("${Libs.LIFECYCLE_VIEW_MODEL_COMPOSE}:$lifecycle")
        api("${Libs.ACTIVITY_KTX}:$activity")
        api("${Libs.KOTLIN}:$kotlin")
        api("${Libs.KOTLIN_COROUTINES}:$kotlinCoroutines")
        api("${Libs.RETROFIT}:$retrofit")
        api("${Libs.RETROFIT_CONVERTER_MOSHI}:$retrofit")
        api("${Libs.OKHTTP_BOM}:$okhttp")
        api("${Libs.OKHTTP}:$okhttp")
        api("${Libs.OKHTTP_LOGGER_INTERCEPTOR}:$okhttp")
        api("${Libs.ROOM}:$room")
        api("${Libs.ROOM_RUNTIME}:$room")
        api("${Libs.ROOM_COMPILER}:$room")
        api("${Libs.ROOM_PAGING}:$room")
        api("${Libs.HILT}:$hilt")
        api("${Libs.HILT_COMPILER}:$hilt")
        api("${Libs.PAGING}:$paging")
        api("${Libs.PAGING_COMMON}:$paging")
        api("${Libs.PAGING_COMPOSE}:$pagingCompose")
        api("${Libs.JUNIT_JUPITER_API}:$junitJupiter")
        api("${Libs.JUNIT_JUPITER_ENGINE}:$junitJupiter")
        api("${Libs.MOCKK}:$mockk")
        api("${Libs.COMPOSE_COMPILER}:$compose")
        api("${Libs.COMPOSE_RUNTIME}:$compose")
        api("${Libs.COMPOSE_UI}:$compose")
        api("${Libs.COMPOSE_UI_TOOLING}:$compose")
        api("${Libs.COMPOSE_MATERIAL}:$compose")
        api("${Libs.COMPOSE_MATERIAL_ICONS_EXTENDED}:$compose")
        api("${Libs.COMPOSE_MATERIAL3}:$composeMaterial3")
        api("${Libs.COMPOSE_ACTIVITY}:$activity")
        api("${Libs.COMPOSE_COIL}:$composeCoil")
        api("${Libs.MOSHI}:$moshi")
        api("${Libs.ACCOMPANIST_NAV_MATERIAL}:$accompanist")
        api("${Libs.ACCOMPANIST_FLOWLAYOUT}:$accompanist")
        api("${Libs.ACCOMPANIST_SYSTEMUICONTROLLER}:$accompanist")
        api("${Libs.ACCOMPANIST_PLACEHOLDERS_MATERIAL}:$accompanist")
        api("${Libs.ACCOMPANIST_SWIPE_TO_REFRESH}:$accompanist")
        api("${Libs.DATA_STORE_PREFERENCES}:$datastore")
        api("${Libs.VOYAGER_NAVIGATOR}:$voyager")
        api("${Libs.VOYAGER_HILT}:$voyager")

    }
}
