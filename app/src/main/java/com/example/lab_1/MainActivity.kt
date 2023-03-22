package com.example.lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab_1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        val cat : Animal = Animal(R.drawable.cat,getString(R.string.CatDetails),getString(R.string.cat))
        val dog : Animal = Animal(R.drawable.dog,getString(R.string.DogDetails),getString(R.string.dog))
        val parrot : Animal = Animal(R.drawable.parrot,getString(R.string.ParrotDetails),getString(R.string.parrot))

        bindingClass.button1.setOnClickListener {
            val h1 = Intent(this,MainActivity2::class.java)
            h1.putExtra("Animal",cat)
            startActivity(h1)
        }
        bindingClass.button2.setOnClickListener {
            val h2 = Intent(this,MainActivity2::class.java)
            h2.putExtra("Animal",dog)
            startActivity(h2)
        }
        bindingClass.button3.setOnClickListener {
            val h3 = Intent(this,MainActivity2::class.java)
            h3.putExtra("Animal",parrot)
            startActivity(h3)
        }


    }
}