package com.iskportal.akzent.core.phonetic


data class Utterance(
    val phoneticValue: Sequence<Phonetic>,
    val writtenValue: String,
    ){
    fun Pair<Collection<Phonetic>, String>.toUtterance(): Utterance {
        return Utterance(this.first.asSequence(), this.second)
    }
}

