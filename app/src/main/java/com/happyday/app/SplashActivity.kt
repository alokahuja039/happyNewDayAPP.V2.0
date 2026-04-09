
package com.happyday.app

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import java.util.*

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val dayText = findViewById<TextView>(R.id.dayText)
        val quoteText = findViewById<TextView>(R.id.quoteText)

        val day = Calendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
        dayText.text = "Have a Happy $day"

        val quotes = listOf(
            "Believe you can and you're halfway there.",
            "Push yourself, because no one else will.",
            "Dream big. Start small. Act now.",
            "Stay positive, work hard, make it happen."
        )

        quoteText.text = quotes.random()

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 10000)
    }
}
