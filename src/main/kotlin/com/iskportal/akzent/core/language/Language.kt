package com.iskportal.akzent.core.language

import com.iskportal.akzent.core.phonetic.Phonetic
import com.iskportal.akzent.core.phonetic.Utterance

interface Language {
    val name: String

    val availablePhonetics: List<Phonetic>
    val availableLetterSymbols: List<Char>

    val utterances: List<Utterance>
    val words: List<Word>

    // TODO Grammar Definition


    fun generateUtterance(): Utterance
    fun addUtterance(utterance: Utterance)
    fun addWord(word: Word)
}