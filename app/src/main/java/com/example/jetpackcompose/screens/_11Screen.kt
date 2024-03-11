package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Scaffold
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
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
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun _11Screen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arro back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Calculadora State Hoisting")
        }
    }){
        CalculadoraStateHoisting()
    }
}



@Composable
fun _11BodyContent (
    operando1: String, operando2: String, onCalcular: ()->Unit, color: Color, suma: Double, onValueChange1: (String) -> Unit,
    onValueChange2: (String) -> Unit){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
    ){
        Spacer(modifier = Modifier.padding(15.dp))

        TextField(
            value = operando1,
            onValueChange =  onValueChange1 ,
            label = { Text("Operando 1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.padding(15.dp))
        TextField(
            value = operando2,
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
fun CalculadoraStateHoisting(){
    var operando1 by remember { mutableStateOf("") }
    var operando2 by remember { mutableStateOf("") }
    var color by remember { mutableStateOf(Color.Black) }
    var suma by remember { mutableStateOf(0.0) }
    val onCalcular = {
        suma=operando1.toDouble()+operando2.toDouble()
        if(suma<25) color = Color.Cyan else if (suma>25)
            color = Color.Blue else color = Color.Red
    }

    _11BodyContent(
        operando1 = operando1,
        operando2 = operando2,
        onCalcular = onCalcular,
        color = color,
        suma = suma,
        onValueChange1 ={ operando1 = it },
        onValueChange2 = { operando2 = it })
}


