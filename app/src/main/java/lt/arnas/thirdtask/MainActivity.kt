package lt.arnas.thirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

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

    }

}