package fr.israel.batle_game

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class GameReport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_reports)

        val actionbar = supportActionBar
        // set actionbar title
        actionbar!!.title = ""
        // set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}