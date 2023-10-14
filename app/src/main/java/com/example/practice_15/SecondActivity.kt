package com.example.practice_15

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val textView : TextView = findViewById(R.id.textView)
        var animal : Animal = Animal()
        val arguments : Bundle? = intent.extras
        if (arguments != null ){
            animal = arguments.getParcelable<Animal>(animal.javaClass.simpleName) as Animal
            textView.text = "Порода : ${animal.getWeather()} \nГод : ${animal.getYear()}\nДата рождения : ${animal.getDatahp()}"
        }
    }
}