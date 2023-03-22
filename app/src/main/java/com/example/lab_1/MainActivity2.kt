package com.example.lab_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab_1.databinding.ActivityMain2Binding
import com.example.lab_1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var bindingClass : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        val animal = intent.getParcelableExtra<Animal>("Animal")

        bindingClass.image1.setImageResource(animal!!.image)
        bindingClass.desc.text=animal.description
        bindingClass.animal.text=animal.name

        bindingClass.returnButton.setOnClickListener {
            finish()
        }
    }
}