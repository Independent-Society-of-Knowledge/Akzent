package com.iskportal.akzent.core.phonetic


enum class ArticulationPlace {
    Bilabial,
    LabioDental,
    LinguoLabial,
    Dental,
    Alveolar,
    PostAlveolar,
    RetroFlex,
    Palatal,
    Velar,
    Uvular,
    PharyngealEpiglottal,
    Glottal,
}

enum class ArticulationManner    {
    Nasal,
    Plosive,
    SibilantFricative,
    NonSibilantFricative,
    Fricative,
    Tenuis,
    Voiced,
    VoicedLateral,
    NasalLateral,
    Approximant,
    TapFlap,
    Trill,
    LateralFricative,
    LateralApproximant,
    LateralTapFlap
}

operator fun ArticulationPlace.plus(other: ArticulationManner): Pair<ArticulationPlace, ArticulationManner>{
    return  this to other
}
operator fun ArticulationManner.plus(other: ArticulationPlace): Pair<ArticulationPlace, ArticulationManner>{
    return other to this
}

typealias Consonant = Pair<ArticulationPlace, ArticulationManner>
