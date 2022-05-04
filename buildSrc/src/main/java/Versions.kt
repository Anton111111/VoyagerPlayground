object Versions {
    private const val vMajor = 4
    private const val vMinor = 1
    private const val vPatchLevel = 1

    const val versionName =
        "$vMajor.$vMinor.$vPatchLevel" // X.Y.Z; X = Major, Y = minor, Z = Patch level
    const val versionCodeMobile = vMajor * 1000 + vMinor * 100 + vPatchLevel// XYYZZ;

    const val COMPILE_SDK = 31
    const val TARGET_SDK = 31
    const val MIN_SDK = 23

    const val ANDROID_GRADLE_PLUGIN = "7.2.0-rc01"
    const val KOTLIN = "1.6.10"
    const val HILT = "2.41"
    const val COMPOSE_COMPILER = "1.2.0-alpha07"
}
