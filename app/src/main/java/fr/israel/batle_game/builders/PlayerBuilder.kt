package fr.israel.batle_game.builders

import fr.israel.batle_game.entities.PlayerEntity

class PlayerBuilder {
    private var name: String = "name"
    private var scores: MutableList<Int> = mutableListOf<Int>()
    private var currentScore: Int = 0
    private var round = 0

    fun setName(_name: String): PlayerBuilder {
        name = _name;
        return this;
    }

    fun setScores(scores: MutableList<Int>): PlayerBuilder {
        this.scores = scores;
        return this;
    }

    fun setCurrentScore(currentScore: Int): PlayerBuilder {
        this.currentScore = currentScore;
        return this;
    }

    fun setRound(round: Int): PlayerBuilder {
        this.round = round;
        return this;
    }

    fun build(): PlayerEntity {
        print("this.name: ");
        print(this.name);
        println();
        return PlayerEntity(this.name, this.scores, this.currentScore, this.round);
    }
}