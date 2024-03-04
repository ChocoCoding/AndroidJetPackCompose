package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Scaffold
import androidx.compose.material.Icon
import androidx.compose.material.RadioButton
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
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.jetpackcompose.clases.Calculadora

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun _13Screen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arro back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Calculadora con View Model")
        }
    }){
        _13BodyContent(navController)
    }
}

@Composable
fun _13BodyContent(navController: NavController){
    val viewModel : Calculadora = viewModel()

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier
            .padding(40.dp))
        TextField(
            value = viewModel.operando1.value,
            onValueChange = { viewModel.operando1.value = it },
            label = { androidx.compose.material3.Text("Operando1") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier
            .padding(10.dp))
        TextField(
            value =  viewModel.operando2.value,
            onValueChange = {  viewModel.operando2.value = it },
            label = { androidx.compose.material3.Text("Operando2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier
            .padding(10.dp))


        RadioButtonPersonaliz(lista = viewModel.options, viewModel = viewModel)

        Spacer(modifier = Modifier.padding(10.dp))

        Text(
            text = "Resultado = ${viewModel.res.value}",
            fontSize = 25.sp,
            color = viewModel.colorRes.value
        )

        Spacer(modifier = Modifier.padding(10.dp))
        androidx.compose.material3.Button(onClick = {viewModel.operacionARealizar() }) {
            androidx.compose.material3.Text(text = "Calcular")
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun CalculadoraVM(){
    val viewModel : Calculadora = viewModel()
    var operando1: String by remember { mutableStateOf("") }
    var operando2: String by remember { mutableStateOf("") }

    viewModel.operando1.value = operando1
    viewModel.operando2.value = operando2

    val res: Double by viewModel.res

    val colorRes: Color by viewModel.colorRes

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
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier
            .padding(10.dp))
        TextField(
            value = operando2,
            onValueChange = { operando2 = it },
            label = { androidx.compose.material3.Text("Operando2") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier
            .padding(10.dp))


        RadioButtonPersonaliz(lista = viewModel.options, viewModel = viewModel)

        Spacer(modifier = Modifier.padding(10.dp))

        Text(
            text = "Resultado = $res",
            fontSize = 25.sp,
            color = viewModel.colorRes.value
        )

        Spacer(modifier = Modifier.padding(10.dp))
        androidx.compose.material3.Button(onClick = {viewModel.operacionARealizar() }) {
            androidx.compose.material3.Text(text = "Calcular")
        }
    }

}

@Composable
fun RadioButtonPersonaliz(lista: List<String>, viewModel : Calculadora){

    var selectedOption by remember { mutableStateOf(viewModel.options[0]) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 60.dp),
        horizontalAlignment = Alignment.Start
    ) {
        lista.forEach{item ->
            Row {
               RadioButton(
                   selected = selectedOption == item,
                   onClick = {selectedOption= item
                       viewModel.option.value = item} )
                Text(text = item, Modifier.padding(top = 12.dp))
            }
        }

    }
}


