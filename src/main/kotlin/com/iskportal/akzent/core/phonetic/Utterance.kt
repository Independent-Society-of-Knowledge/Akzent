package com.iskportal.akzent.core.phonetic


data class Utterance(
    val value: List<Phonetic>
    ){
    fun List<Phonetic>.toUtterance(): Utterance {
        return Utterance(this)
    }
}

