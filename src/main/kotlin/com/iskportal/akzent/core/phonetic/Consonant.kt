package com.iskportal.akzent.core.phonetic

import com.iskportal.akzent.core.phonetic.utils.plus

data class Consonant(
    override val name: String = "",
    override val symbol: String = "",
    val form: Pair<ArticulationPlace, ArticulationManner> = ArticulationPlace.None + ArticulationManner.None,
) : Phonetic {
    fun getName(): String {
        return name
    }

    fun getSymbol(): String {
        return symbol
    }

    fun getForm(): Pair<ArticulationPlace, ArticulationManner> {
        return form
    }

    // Vowel Generation
    fun Pair<ArticulationPlace, ArticulationManner>.defineAsConsonant(name: String = "", symbol: String = ""): Consonant {
        return Consonant(name, symbol, this@defineAsConsonant)
    }
}