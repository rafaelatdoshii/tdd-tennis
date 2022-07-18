package com.themobilecoder.tennistdd

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class TennisScoreEngineTest {

    @Test
    fun `player one should have zero score initially`() {
        val tennisScoreEngine = TennisScoreEngine()

        assertEquals(TennisScoreEngine.TennisScore.ZERO, tennisScoreEngine.playerOneScore())
    }

    @Test
    fun `add score to player one should set to 15`() {
        val tennisScoreEngine = TennisScoreEngine()
        tennisScoreEngine.addPlayerOneScore()

        assertEquals(TennisScoreEngine.TennisScore.FIFTEEN, tennisScoreEngine.playerOneScore())
    }

    @Test
    fun `add score to player one from 15 should set to 30`() {
        val tennisScoreEngine = TennisScoreEngine()
        tennisScoreEngine.addPlayerOneScore()
        tennisScoreEngine.addPlayerOneScore()

        assertEquals(TennisScoreEngine.TennisScore.THIRTY, tennisScoreEngine.playerOneScore())
    }

    @Test
    fun `add score to player one from 30 should set to 40`() {
        val tennisScoreEngine = TennisScoreEngine()
        tennisScoreEngine.addPlayerOneScore()
        tennisScoreEngine.addPlayerOneScore()
        tennisScoreEngine.addPlayerOneScore()

        assertEquals(TennisScoreEngine.TennisScore.FORTY, tennisScoreEngine.playerOneScore())
    }
}