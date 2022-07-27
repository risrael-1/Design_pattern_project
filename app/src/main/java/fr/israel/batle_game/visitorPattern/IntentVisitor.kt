package fr.israel.batle_game.visitorPattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import fr.israel.batle_game.entities.PlayerEntity

class IntentVisitor {
    companion object {
        fun <T>startActivity(
            app: AppCompatActivity,
            cls: Class<T>,
            extraVars: List<PlayerEntity> = listOf(),
        ) {
            val intent = Intent(app, cls);
            for (i in extraVars.indices) {
                intent.putExtra("player_${i+1}", extraVars[i].name);
            }
            app.startActivity(intent);
        }
    }
}