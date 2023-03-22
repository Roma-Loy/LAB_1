package com.example.lab_1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(val image: Int,
                  val description: String,
                  var name: String,) : Parcelable