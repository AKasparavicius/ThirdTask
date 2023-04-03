package lt.arnas.thirdtask

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*
import kotlin.random.Random

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
            doTask02()
            doTask03()
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

    fun doTask02(){
        val randomTime = Random.nextInt(0, 10)
        when(randomTime) {
            0 -> task02TextView.text = "$randomTime \nUnknown day of week"
            1 -> task02TextView.text = "Random value is $randomTime \nMonday"
            2 -> task02TextView.text = "Random value is $randomTime \nTuesday"
            3 -> task02TextView.text = "Random value is $randomTime \nWednesday"
            4 -> task02TextView.text = "Random value is $randomTime \nThursday"
            5 -> task02TextView.text = "Random value is $randomTime \nFriday"
            6 -> task02TextView.text = "Random value is $randomTime \nSaturday"
            7 -> task02TextView.text = "Random value is $randomTime \nSunday"
            in 8..10 -> task02TextView.text = "$randomTime \nUnknown day of week"
        }
    }

    fun doTask03(){
        val randomTime03 = Random.nextInt(0, 10)
        when(randomTime03){
            0 -> task03TextView.text = "Random value is $randomTime03 \nUnknown day of the week"
            in 1..5 -> task03TextView.text = "Random value is $randomTime03 \nToday is working" +
                                                    " day"
            6,7 -> task03TextView.text = "Random value is $randomTime03 \nToday is weekend"
            in 8 .. 10 -> task03TextView.text = "Random value is $randomTime03 \nUnknown day" +
                                                        " of the week"
        }
    }

}