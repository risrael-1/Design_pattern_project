package fr.israel.batle_game

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import fr.israel.batle_game.builders.PlayerBuilder
import fr.israel.batle_game.entities.PlayerEntity
import fr.israel.batle_game.visitorPattern.IntentVisitor

class NewGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_game)

        val actionbar = supportActionBar
        // set actionbar title
        actionbar!!.title = ""
        // set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val textFieldPlayer1: EditText = findViewById(R.id.player1)
        val textFieldPlayer2: EditText = findViewById(R.id.player2)

        val startGame: Button = findViewById(R.id.buttonContinue)

        startGame.setOnClickListener {
            if ("" == textFieldPlayer1.getText().toString().trim()) {
                Toast.makeText(
                    this,
                    "Merci de saisir un nom de joueur",
                    Toast.LENGTH_SHORT
                ).show()
            } else if ("" == textFieldPlayer2.getText().toString().trim()) {
                Toast.makeText(
                    this,
                    "Merci de saisir un nom de joueur 2",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val firstPlayer = PlayerBuilder()
                    .setName(textFieldPlayer1.text.toString())
                    .build();
                val secondPlayer = PlayerBuilder()
                    .setName(textFieldPlayer2.text.toString())
                    .build();
                val players = listOf<PlayerEntity>(firstPlayer, secondPlayer);
                IntentVisitor.startActivity(this, StartGame::class.java, players);
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}