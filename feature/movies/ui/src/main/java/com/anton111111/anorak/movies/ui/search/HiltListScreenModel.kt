package com.anton111111.anorak.movies.ui.search

import cafe.adriel.voyager.core.model.ScreenModel
import java.util.*
import javax.inject.Inject

class HiltListScreenModel @Inject constructor() : ScreenModel {

    val items = sampleItems
}

val sampleItems: List<String>
    get() = (0..99).map { "Item #$it | ${UUID.randomUUID().toString().substringBefore('-')}" }
