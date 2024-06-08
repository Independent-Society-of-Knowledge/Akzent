package com.iskportal.akzent.core.phonetic.utils

import com.iskportal.akzent.core.phonetic.ArticulationManner
import com.iskportal.akzent.core.phonetic.ArticulationPlace

operator fun ArticulationPlace.plus(other: ArticulationManner): Pair<ArticulationPlace, ArticulationManner>{
    return  this to other
}

operator fun ArticulationManner.plus(other: ArticulationPlace): Pair<ArticulationPlace, ArticulationManner>{
    return other to this
}
