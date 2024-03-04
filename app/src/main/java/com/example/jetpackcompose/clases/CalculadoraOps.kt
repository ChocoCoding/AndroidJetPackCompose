package com.example.jetpackcompose.clases

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculadoraSinEstado (
    op1: String, op2: String, onCalcular: ()->Unit, color: Color, suma: Double, onValueChange1: (String) -> Unit,
    onValueChange2: (String) -> Unit){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Spacer(modifier = Modifier.padding(15.dp))

        TextField(
            value = op1,
            onValueChange =  onValueChange1 ,
            label = { Text("Operando 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.padding(15.dp))
        TextField(
            value = op2,
            onValueChange =  onValueChange2 ,
            label = { Text("Operando 2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.padding(15.dp))
        Text(text = "Suma=$suma",
            color = color,
            fontSize = 22.sp)
        Spacer(modifier = Modifier.padding(15.dp))
        Button(onClick =  onCalcular ) {
            Text(text = "Calcular")
        }
    }
}
@Composable
fun CalculadoraConEstado(){
    var op1 by remember { mutableStateOf("") }
    var op2 by remember { mutableStateOf("") }
    var suma by remember { mutableStateOf(0.0) }
    var color by remember { mutableStateOf(Color.Black) }
    val onCalcular = {
        suma=op1.toDouble()+op2.toDouble()
        if(suma<25) color = Color.Cyan else if (suma>25) color = Color.Blue else color = Color.Red
    }

    CalculadoraSinEstado(op1 = op1, op2 = op2, onCalcular = onCalcular, color = color, suma = suma,
        onValueChange1 ={ op1 = it }, onValueChange2 = { op2 = it })
}