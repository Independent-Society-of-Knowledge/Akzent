package com.iskportal.akzent.core.phonetic

enum class MouthType {
    Front,
    NearFront,
    Centeral,
    NearBack,
    Back
}

enum class LipType {
    Close,
    NearClose,
    CloseMid,
    Mid,
    OpenMid,
    NearOpen,
    Open
}

operator fun MouthType.plus(other: LipType): Pair<MouthType, LipType> {
    return this to other
}
operator fun LipType.plus(other: MouthType): Pair<MouthType, LipType> {
    return other to this
}

typealias Vowel = Pair<MouthType, LipType>