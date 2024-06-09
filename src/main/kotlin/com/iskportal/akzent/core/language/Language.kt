package com.iskportal.akzent.core.language

import com.iskportal.akzent.core.language.utils.GrammarCorrelation
import com.iskportal.akzent.core.language.utils.WordCorrelation
import com.iskportal.akzent.core.language.utils.basicWordCorrelations
import com.iskportal.akzent.core.phonetic.Phonetic
import com.iskportal.akzent.core.phonetic.Utterance

interface Language {
    val name: String

    val availablePhonetics: List<Phonetic>
    val availableLetterSymbols: List<Char>

    val utterances: List<Utterance>
    val words: List<Word>
    val grammar: List<Grammar>

    val wordCorrelations: List<WordCorrelation>
    val grammarCorrelation: List<GrammarCorrelation>

    // TODO Synonym Antonym and Correlation Implementation


    fun generateUtterance(): Utterance
    fun addUtterance(utterance: Utterance)
    fun addWord(word: Word)
}