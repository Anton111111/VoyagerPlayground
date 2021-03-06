package com.anton111111.anorak.movies.ui

import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.hilt.ScreenModelKey
import com.anton111111.anorak.movies.ui.search.HiltListScreenModel
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.multibindings.IntoMap

@Module
@InstallIn(ActivityComponent::class)
abstract class HiltModule {

    @Binds
    @IntoMap
    @ScreenModelKey(HiltListScreenModel::class)
    abstract fun bindHiltScreenModel(hiltListScreenModel: HiltListScreenModel): ScreenModel


}