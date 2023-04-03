package lt.arnas.thirdtask

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

val TAG = "my_tag"

    lateinit var task01TextView: TextView
    lateinit var task02TextView: TextView
    lateinit var task03TextView: TextView
    lateinit var clickMeButton: Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_exercise_control_flow_01)

        task01TextView = findViewById(R.id.task01TextView)
        task02TextView = findViewById(R.id.task02TextView)
        task03TextView = findViewById(R.id.task03TextView)
        clickMeButton = findViewById(R.id.clickMeButton)
        setOnClickButtonListener()
    }

    private fun setOnClickButtonListener(){
        clickMeButton.setOnClickListener {
            doTask01()
        }
    }

    fun doTask01(){
//        Nuskaitom savaitės dieną iš OS ir atvizduojam rezultatą:
        val sdf = SimpleDateFormat("EEEE")
        val d = Date()
        val dayOfTheWeek: String = sdf.format(d)
        var today = dayOfTheWeek
        Log.i(TAG, "today's day: $dayOfTheWeek")
        task01TextView.text = "Today is $dayOfTheWeek"
    }

}