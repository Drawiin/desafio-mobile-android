package com.drawiin.myheroes.domain.interactors

import com.drawiin.myheroes.domain.boundarys.HeroesRepository
import com.drawiin.myheroes.domain.model.character.Character

class GetHeroes (
    private val heroesRepository: HeroesRepository
) {
    suspend fun execute(apikey: String, hash: String): List<Character> {
        return heroesRepository.getHeroes(apikey, hash, 20, 0)
    }
}