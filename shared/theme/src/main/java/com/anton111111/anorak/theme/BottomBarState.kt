package com.anton111111.anorak.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

class BottomBarState(initVisibleValue: Boolean = true) {
    private val _visibleState = mutableStateOf(initVisibleValue)
    val visibleState: State<Boolean> get() = _visibleState

    fun show() {
        _visibleState.value = true
    }

    fun hide() {
        _visibleState.value = false
    }
}

@Composable
fun rememberBottomBarState(initVisibleValue: Boolean = true) = remember {
    BottomBarState(initVisibleValue = initVisibleValue)
}
