package com.example.practice_15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun buttonSendClick(view: View) {
        val weatherText: TextView = findViewById(R.id.editTextText2)
        val yearText: TextView = findViewById(R.id.editTextNumber)
        val datahpText: TextView = findViewById(R.id.editTextNumber2)
        val weather = weatherText.text.toString()
        val year = yearText.text.toString().toInt()
        val datahp = datahpText.text.toString().toInt()
        val animal: Animal = Animal(weather, year, datahp)
        val intent: Intent = Intent(
            this@MainActivity,
            SecondActivity::class.java )
        intent.putExtra(animal.javaClass.simpleName, animal)
        startActivity(intent)

    }
}