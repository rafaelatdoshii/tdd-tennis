package com.themobilecoder.tennistdd


/**
 *
    Class to hold the state of the tennis game
 *
 **/
class TennisScoreEngine {

    private var playerOneScore = TennisScore.ZERO

    fun playerOneScore(): TennisScore {
        return playerOneScore
    }

    fun addPlayerOneScore() {
        playerOneScore = when(playerOneScore) {
            TennisScore.ZERO -> TennisScore.FIFTEEN
            TennisScore.FIFTEEN -> TennisScore.THIRTY
            TennisScore.THIRTY -> TennisScore.FORTY
            else -> TennisScore.ZERO
        }
    }

    enum class TennisScore {
        ZERO,
        FIFTEEN,
        THIRTY,
        FORTY,
    }

}