package com.iskportal.akzent.core.phonetic

import com.iskportal.akzent.core.phonetic.utils.plus

class Vowel(
    override val name: String = "",
    override val symbol: String = "",
    private val form: Pair<MouthType, LipType> = MouthType.None + LipType.None,
) : Phonetic {

    fun getName(): String {
        return name
    }

    fun getSymbol(): String {
        return symbol
    }

    fun getForm(): Pair<MouthType, LipType> {
        return form
    }

    // Vowel Generation
    fun Pair<MouthType, LipType>.defineAsVowel(name: String = "", symbol: String = ""): Vowel {
        return Vowel(name, symbol, this@defineAsVowel)
    }
}

