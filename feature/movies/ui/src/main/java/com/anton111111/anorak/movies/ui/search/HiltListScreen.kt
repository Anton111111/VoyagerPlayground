package com.anton111111.anorak.movies.ui.search

import android.util.Log
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.androidx.AndroidScreen
import cafe.adriel.voyager.hilt.getScreenModel
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow

class HiltListScreen : AndroidScreen() {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        // Uncomment version below if you want keep using ViewModel instead of to convert it to ScreenModel
        // val viewModel: HiltListViewModel = getViewModel()
        val viewModel: HiltListScreenModel = getScreenModel()
        Log.e("!!!!", "!!!!!$viewModel")
        Text(text = "This is screen: $this with screen model: $viewModel")
    }
}
