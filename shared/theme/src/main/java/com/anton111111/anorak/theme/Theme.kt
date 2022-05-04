package com.anton111111.anorak.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

val LocalBottomBarStateHolder =
    compositionLocalOf<BottomBarState> { error("No bottom bar state holder!") }

data class AppColors(
    val primary: Color,
    val onPrimary: Color,
    val primaryVariant: Color,
    val onPrimaryVariant: Color,
    val secondary: Color,
    val onSecondary: Color,
    val secondaryVariant: Color,
    val onSecondaryVariant: Color,
    val background: Color,
    val onBackground: Color,
    val onBackgroundSecondary: Color,
    val onBackgroundDisabled: Color,
    val surface: Color,
    val onSurface: Color,
    val error: Color,
    val onError: Color,
    val placeholder: Color,
    val backdropOverlay: Color,
    val accentHigh: Color,
    val accentMiddle: Color,
    val accentLow: Color
)

val appColors: AppColors = AppColors(
    primary = Color(0xFFE0F7FA),
    onPrimary = Color(0xFF424242),
    primaryVariant = Color(0xFFB2EBF2),
    onPrimaryVariant = Color(0xFF424242),
    secondary = Color(0xFF00BCD4),
    onSecondary = Color(0xFFFFFFFF),
    secondaryVariant = Color(0xFF00BCD4),
    onSecondaryVariant = Color(0xFFFFFFFF),
    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF424242),
    onBackgroundSecondary = Color(0xFF757575),
    onBackgroundDisabled = Color(0xFFA6A6A6),
    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF000000),
    error = Color(0xFFB3261E),
    onError = Color(0xFFFFFFFF),
    placeholder = Color(0xFFC4C4C4),
    backdropOverlay = Color(0x99000000),
    accentHigh = Color(0xFF4CAF50),
    accentMiddle = Color(0xFF9E9E9E),
    accentLow = Color(0xFFE35141)
)

@SuppressLint("ConflictingOnColor")
@Composable
fun AppTheme(
    statusBarColor: Color? = null,
    navigationBarColor: Color? = null,
    content: @Composable () -> Unit
) {

    MaterialTheme(
        colors = Colors(
            primary = appColors.primary,
            primaryVariant = appColors.onPrimaryVariant,
            secondary = appColors.secondary,
            secondaryVariant = appColors.onSecondaryVariant,
            background = appColors.background,
            surface = appColors.surface,
            error = appColors.error,
            onPrimary = appColors.onPrimary,
            onSecondary = appColors.onSecondary,
            onBackground = appColors.onBackground,
            onSurface = appColors.onSurface,
            onError = appColors.onError,
            isLight = !isSystemInDarkTheme()
        )
    ) {
        content()
    }

    val systemUiController = rememberSystemUiController()
    val darkIcons = !isSystemInDarkTheme()

    SideEffect {
        systemUiController.setNavigationBarColor(
            color = navigationBarColor ?: appColors.primary,
            darkIcons = darkIcons
        )
        // Call setStatusBarColor after setNavigationBarColor other way setStatusBarColor works incorrect.
        systemUiController.setStatusBarColor(
            color = statusBarColor ?: appColors.background,
            darkIcons = darkIcons
        )

    }
}
