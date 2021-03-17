package com.drawiin.myheroes.di


import com.drawiin.myheroes.network.HeroesService
import com.drawiin.myheroes.repository.DefaultHeroesRepository
import com.drawiin.myheroes.repository.HeroesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideHeroesRepository(
        heroesService: HeroesService
    ): HeroesRepository {
        return DefaultHeroesRepository(
            heroesService
        )
    }
}