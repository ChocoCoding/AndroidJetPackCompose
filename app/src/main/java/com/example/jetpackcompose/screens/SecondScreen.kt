package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import android.support.v4.os.IResultReceiver2.Default
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.R
import com.example.jetpackcompose.navigation.AppScreens
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SecondScreen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arro back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Listas desplegables")
        }
    }){
        SecondBodyContent(navController)
    }
}

private val messages: List<MyMessage> = listOf(
    MyMessage("Hola Jetpack Compose 1", "¿Are you ready?Lorem ipsum es el texto que se usa habitualmente en diseño gráfico en demostraciones de tipografías o de borradores de diseño para probar el diseño visual antes de insertar el texto final."),
    MyMessage("Hola Jetpack Compose 2", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose3", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1​ Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose4", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose5", "¿Are you ready?El texto en sí no tiene sentido aparente, aunque no es aleatorio, sino que deriva de un texto de Cicerón en lengua latina, a cuyas palabras se les han eliminado sílabas o letras. El significado del mismo no tiene importancia, ya que solo es una demostración o prueba. El texto procede de la obra De finibus bonorum et malorum (Sobre los límites del bien y del mal) que comienza con:"),
    MyMessage("Hola Jetpack Compose6", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose7", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose8", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose9", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose10", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose11", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose12", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),
    MyMessage("Hola Jetpack Compose13", "¿Are you ready?Aunque no posee actualmente fuentes para justificar sus hipótesis, el profesor de filología clásica Richard McClintock asegura que su uso se remonta a los impresores de comienzos del siglo xvi.1\u200B Su uso en algunos editores de texto muy conocidos en la actualidad ha dado al texto lorem ipsum nueva popularidad."),

    )

@Composable
fun SecondBodyContent(navController: NavController){
    JetPackComposeTheme {
        MyMessages(messages)
    }
}

@Composable
fun myImage(){
    Image(
        painterResource(R.drawable.ic_launcher_foreground),
        "Mi imagen",
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
            .size(64.dp)
    )
}

@Composable
fun MyComponent(message: MyMessage){
    Row(
        Modifier
            .background(Color.White)
            .padding(8.dp)
    ){
        myImage()
        MyTexts(message)
    }
}

data class MyMessage(val title: String, val body: String)

@Composable
fun MyTexts(message: MyMessage){
    var expanded by remember{ mutableStateOf(false) }
    Column(modifier = Modifier.padding(start = 8.dp).clickable {
        expanded = !expanded
    }) {
        MyText(
            message.title,
            Color.Red
        )
        Spacer(Modifier.height(8.dp))
        MyText(
            message.body,
            MaterialTheme.colorScheme.inversePrimary,
            if (expanded) Int.MAX_VALUE else 1
        )
    }
}

@Composable
fun MyMessages(messages: List<MyMessage>){
    LazyColumn(){
        items(messages){ message ->
            MyComponent(message)
        }
    }
}

@Composable
fun MyText(text: String,color: Color, lines: Int = Int.MAX_VALUE){
    Text(text,color = color, maxLines = lines);
}

@Preview(showSystemUi = true)
@Preview
@Composable
fun PreviewTexts(){
    JetPackComposeTheme {
        MyMessages(messages)
    }
}
