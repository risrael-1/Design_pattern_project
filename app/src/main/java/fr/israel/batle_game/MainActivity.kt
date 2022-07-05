package fr.israel.batle_game

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNewGame:Button = findViewById(R.id.button)
        buttonNewGame.setOnClickListener {
            val intent = Intent(this, NewGame::class.java)
            startActivity(intent)
        }

        val buttonScore:Button = findViewById(R.id.button3)
        buttonScore.setOnClickListener {
            val intent = Intent(this, GameReport::class.java)
            startActivity(intent)
        }
    }
}