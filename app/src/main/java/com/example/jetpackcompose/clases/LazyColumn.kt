package com.example.examen_nerea_martinez_fernandez_2eva.ui.theme.screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.BottomAppBar
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun LazyColumnEjemploConEstado(){
    val elementos : List<String> = List(10){"Elemento ${it+1}"}
    var name : String by remember { mutableStateOf("") }
    PantallaLazyColumnConScaffold(elem = elementos, name=name, {name = it})
}
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun PantallaLazyColumnConScaffold(elem: List<String>, name: String, onNameChange:(String)->Unit){
    val context = LocalContext.current
    Scaffold (
        topBar = { TopAppBar (
            title = { Text(text = "Título arriba")},
            navigationIcon = {
                IconButton(onClick = { Toast.makeText(context,"Pulsado menú", Toast.LENGTH_SHORT).show() }) {
                    Icon(Icons.Default.Menu,contentDescription = null)
                }
            },
            actions = {
                IconButton(onClick = { Toast.makeText(context,"Pulsado menú", Toast.LENGTH_SHORT).show() }) {
                    Icon(Icons.Default.Share,contentDescription = null)
                }
                IconButton(onClick = { Toast.makeText(context,"Pulsado menú", Toast.LENGTH_SHORT).show() }) {
                    Icon(Icons.Default.Home,contentDescription = null)
                }
                IconButton(onClick = { Toast.makeText(context,"Pulsado menú", Toast.LENGTH_SHORT).show() }) {
                    Icon(Icons.Default.Add,contentDescription = null)
                }
            })
        },
        bottomBar = { BottomAppBar() {
            Text(text = "Hecho por Nerea")
        }

        },
        floatingActionButton = {
            val context = LocalContext.current
            FloatingActionButton(
                backgroundColor = MaterialTheme.colors.primary,
                onClick = {Toast.makeText(context,"Añadir",Toast.LENGTH_SHORT).show()}) {
                Text(fontSize = 40.sp,
                    text = "+")
            }
        }
    ){
        Column(verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(value = name,
                onValueChange = onNameChange,
                label = { Text(text = "Introduce texto") }
            )
            if (name.isNotBlank())
                Text(text = "¡Hola, $name !, qué tal estás?", Modifier.padding(10.dp))

            Spacer(modifier = Modifier.padding(20.dp))

            LazyColumn{
                items(elem){
                        el -> ElementoRowContador(nombreElemento = el)
                }
            }
        }
    }
}
@Composable
fun ElementoRowContador(nombreElemento : String, modifier : Modifier = Modifier){
    var cont by remember { mutableStateOf(0)}
    val extraSuperficie : Dp = if(cont>5) 48.dp else 0.dp

    Column (verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp, bottom = extraSuperficie),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(text=nombreElemento)
            IconButton(onClick = { cont++ }) {
                Icon(imageVector = Icons.Default.Add,
                    contentDescription = "Incrementar cont")
            }
            IconButton(
                onClick = {cont--},
                enabled = cont>0) {
                Icon(imageVector = Icons.Default.Delete,
                    contentDescription = "Disminuir cont")
            }
            Text(text = "Clicks${cont}")
        }
        if(cont>5){
            Text(text = "Has superado los vasos recomendados")
        }
    }

}
