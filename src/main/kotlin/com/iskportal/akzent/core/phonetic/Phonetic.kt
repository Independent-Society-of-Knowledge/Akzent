package com.iskportal.akzent.core.phonetic

interface Phonetic {
    val name: String
    val symbol: String

    fun Phonetic.plus(other: Phonetic): Utterance {
        return Utterance(listOf(this, other).asSequence(), writtenValue = this.symbol + other.symbol)
    }

}