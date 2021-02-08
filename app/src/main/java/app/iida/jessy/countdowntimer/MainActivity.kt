package app.iida.jessy.countdowntimer

import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Button
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    var second = 10
    var startButton = findViewById<Button>(R.id.startButton)
    var secondText = findViewById<TextView>(R.id.secondText)

    var timer : CountDownTimer = object : CountDownTimer(1000,10000){

        override fun onFinish(){
                startButton.isVisible = true
                second = 10
                secondText.text = second.toString()
            }
    }

    fun onTick(millisUntilFinished: Long){
        second = second - 1
        secondText.text = second.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var timeLadelText = findViewById<TextView>(R.id.timeLadelText)
        var secondText = findViewById<TextView>(R.id.secondText)


        secondText.text = second.toString()

        startButton.setOnClickListener {
            startButton.isVisible = false

            timer.start()
        }

    }
}