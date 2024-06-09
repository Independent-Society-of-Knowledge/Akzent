package com.iskportal.akzent.core.language

import com.iskportal.akzent.core.language.utils.GrammarCorrelation

interface Grammar {
    val name: String
    val rule: List<Word>

    fun findCorrelationNumber(other: Grammar, grammarCorrelation: GrammarCorrelation): Double {
        return (this to other).grammarCorrelation()
    }
}