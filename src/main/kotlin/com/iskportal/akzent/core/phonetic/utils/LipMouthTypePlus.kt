package com.iskportal.akzent.core.phonetic.utils

import com.iskportal.akzent.core.phonetic.LipType
import com.iskportal.akzent.core.phonetic.MouthType

operator fun LipType.plus(other: MouthType): Pair<MouthType, LipType> {
    return other to this
}

operator fun MouthType.plus(other: LipType): Pair<MouthType, LipType> {
    return this to other
}