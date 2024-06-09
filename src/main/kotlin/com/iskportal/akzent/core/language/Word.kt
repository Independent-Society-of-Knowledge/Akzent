package com.iskportal.akzent.core.language

import com.iskportal.akzent.core.language.utils.WordCorrelation
import com.iskportal.akzent.core.phonetic.Utterance

interface Word {
    val symbol: String
    val utterance: Utterance


    fun findCorrelationNumber(other: Word, wordCorrelation: WordCorrelation): Double {
        return (this to other).wordCorrelation()
    }

    
}