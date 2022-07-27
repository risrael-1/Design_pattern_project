package fr.israel.batle_game.entities

class PlayerEntity constructor(_name: String, _scores: MutableList<Int>, _currentScore: Int, _round: Int) {
    val name: String = _name
    var scores: MutableList<Int> = _scores
    var currentScore: Int = _currentScore
    var round: Int = _round
}