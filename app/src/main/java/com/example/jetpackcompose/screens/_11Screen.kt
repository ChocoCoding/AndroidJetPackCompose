package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import android.support.v4.os.IResultReceiver2.Default
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcompose.navigation.AppScreens

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
        _11BodyContent(navController)
    }
}

@Composable
fun _11BodyContent(navController: NavController){
    var operando1 by remember{ mutableStateOf("") }
    var operando2 by remember{ mutableStateOf("") }
    var suma by remember { mutableStateOf(0.0) }
    var colorTexto by remember {mutableStateOf(Color.Black)}
    val onCalcular={
        suma=operando1.toDouble()+operando2.toDouble()
        colorTexto=when {
            suma<25 -> Color.Cyan
            suma>25 -> Color.Blue
            suma==25.0-> Color.Red
            else -> Color.Black
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier
            .padding(40.dp))
        TextField(
            value = operando1,
            onValueChange = { operando1 = it },
            label = { androidx.compose.material3.Text("Operando1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        Spacer(modifier = Modifier
            .padding(10.dp))
        TextField(
            value = operando2,
            onValueChange = { operando2 = it },
            label = { androidx.compose.material3.Text("Operando2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
        Spacer(modifier = Modifier
            .padding(10.dp))
        androidx.compose.material3.Text(text = " Suma = $suma", fontSize = 25.sp, color = colorTexto)
        Spacer(modifier = Modifier.padding(10.dp))

        Spacer(modifier = Modifier.padding(10.dp))
        androidx.compose.material3.Button(onClick = onCalcular) {
            androidx.compose.material3.Text(text = "Calcular")
        }
    }
}

@Composable
fun LogicaCalculadora(){


}

@Composable
@Preview(showSystemUi = true)
fun PreviewCalculadora(){
    var operando1 by remember{ mutableStateOf("") }
    var operando2 by remember{ mutableStateOf("") }
    var suma by remember { mutableStateOf(0.0) }
    var colorTexto by remember {mutableStateOf(Color.Black)}
    var colorM by remember {mutableStateOf(Color.Black)}
    val onCalcular={
        colorTexto=when {
            suma<25 -> Color.Cyan
            suma>25 -> Color.Blue
            suma==25.0-> Color.Red
            else -> Color.Black
        }
    }

Column(
    modifier = Modifier
        .fillMaxSize(),
    verticalArrangement = Arrangement.Top,
    horizontalAlignment = Alignment.CenterHorizontally
) {
    Spacer(modifier = Modifier
        .padding(40.dp))
    TextField(
        value = operando1,
        onValueChange = { operando1 = it },
        label = { androidx.compose.material3.Text("Operando1") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
    Spacer(modifier = Modifier
        .padding(10.dp))
    TextField(
        value = operando2,
        onValueChange = { operando2 = it },
        label = { androidx.compose.material3.Text("Operando2") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))
    Spacer(modifier = Modifier
        .padding(10.dp))
    androidx.compose.material3.Text(text = " Suma = $suma", fontSize = 25.sp, color = colorTexto)
    Spacer(modifier = Modifier.padding(10.dp))

    Spacer(modifier = Modifier.padding(10.dp))
    androidx.compose.material3.Button(onClick = onCalcular) {
        androidx.compose.material3.Text(text = "Calcular")
    }
}
}


