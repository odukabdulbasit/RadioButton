package com.odukabdulbasit.radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val buttonShowSelection: Button = findViewById(R.id.buttonShowSelection)
        val textViewSelection: TextView = findViewById(R.id.textViewSelection)

        buttonShowSelection.setOnClickListener {
            val selectedOptionId = radioGroup.checkedRadioButtonId
            val selectedRadioButton: RadioButton = findViewById(selectedOptionId)

            val selectedText = selectedRadioButton.text.toString()
            textViewSelection.text = "Selected Option: $selectedText"
        }
    }
}
