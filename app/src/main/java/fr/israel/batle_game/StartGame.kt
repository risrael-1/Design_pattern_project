package fr.israel.batle_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = ""
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val player1button: Button = findViewById(R.id.deckPlayer1)
        player1button.setOnClickListener {
            player1button.setBackgroundResource(R.drawable.ic_noun_4_treffle)
        }

        val player2button: Button = findViewById(R.id.deckPlayer2)
        player2button.setOnClickListener {
            player2button.setBackgroundResource(R.drawable.ic_noun_2_carreau)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}