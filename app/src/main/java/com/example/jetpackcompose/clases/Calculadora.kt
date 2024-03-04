package com.example.jetpackcompose.clases

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class Calculadora : ViewModel() {
    //Definimos los estados mutables
    var operando1 = mutableStateOf("")
    var operando2 = mutableStateOf("")

    //Definimos el resultado
    var res = mutableStateOf(0.0)

    var colorRes = mutableStateOf(Color.Black)

    val options = listOf("suma","resta","multiplicacion","division")

    var option = mutableStateOf("")



    fun establecerColor(){
        colorRes.value =
            when{
                res.value == 25.0 -> Color.Red
                res.value < 25 -> Color.Cyan
                res.value > 25 -> Color.Blue
                else -> Color.Black
            }
    }

    fun suma(){
        res.value = operando1.value.toDouble() + operando2.value.toDouble()
    }

    fun resta(){
        res.value = operando1.value.toDouble() - operando2.value.toDouble()
    }

    fun mult(){
        res.value = operando1.value.toDouble() * operando2.value.toDouble()
    }

    fun div(){
        res.value = operando1.value.toDouble() / operando2.value.toDouble()
    }


    fun operacionARealizar() {
        if(option.value == "suma")suma()
        if(option.value == "resta")resta()
        if(option.value == "multiplicacion")mult()
        if(option.value == "division")div()
        establecerColor()
    }

}