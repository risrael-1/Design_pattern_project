package fr.israel.batle_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import fr.israel.batle_game.visitorPattern.IntentVisitor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNewGame:Button = findViewById(R.id.button)
        buttonNewGame.setOnClickListener {
            IntentVisitor.startActivity(this, NewGame::class.java);
        }

        val buttonScore:Button = findViewById(R.id.button3)
        buttonScore.setOnClickListener {
            IntentVisitor.startActivity(this, GameReport::class.java);
        }
    }
}