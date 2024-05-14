// imports
import androidx.appcompat.app.AppCompatActivity
import andoid.os.Bundle
import android.widget.Button
import android.widget.Toast

import QuestionProvider
import javax.swing.plaf.nimbus.State

class DisplayQuestion : AppCompatActivity() {
    Question currentQuestion = QuestionProvider()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var correctAnswer = currentQuestion.answer

        var buttonOption1 = findViewById<Button>(R.id.buttonOption1)
        var answer1 = currentQuestion.options[0]
        myTextView.text = answer1
        var buttonOption2 = findViewById<Button>(R.id.buttonOption1)
        var answer2 = currentQuestion.options[1]
        myTextView.text = answer2
        var buttonOption3 = findViewById<Button>(R.id.buttonOption1)
        var answer3 = currentQuestion.options[2]
        myTextView.text = answer3
        var buttonOption4 = findViewById<Button>(R.id.buttonOption1)
        var answer4 = currentQuestion.options[3]
        myTextView.text = answer4

        val checkAnswr = { button: Button ->
            if (button.text == correctAnswer) {
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
            }
        }
        buttonOption1.setOnClickListener { checkAnswer(buttonOption1) }
        buttonOption2.setOnClickListener { checkAnswer(buttonOption2) }
        buttonOption3.setOnClickListener { checkAnswer(buttonOption3) }
        buttonOption4.setOnClickListener { checkAnswer(buttonOption4) }

    }
/* Add following to build.gradle:
android {
    ...
    dataBinding {
        enabled = true
    }
}
*/
}