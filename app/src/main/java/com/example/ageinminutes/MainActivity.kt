package com.example.ageinminutes

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ageinminutes.ui.theme.AgeInMinutesTheme
import android.app.DatePickerDialog
import java.util.Calendar


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val datePicker = findViewById<Button>(R.id.btnDatePicker)
        datePicker.setOnClickListener { view ->
            view

            clickDatePicker()
        }

    }
    fun clickDatePicker(){
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(
            this,
             { view, year, month, dayOfMonth ->
                Toast.makeText(this,
                    "Date picker works", Toast.LENGTH_SHORT).show()
            },
            year,
            month,
            day
        ).show()

    }

}

