package com.example.jetpackcompose.screens
import android.annotation.SuppressLint
import android.support.v4.os.IResultReceiver2.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun _3Screen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrowback",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Ventana Column")
        }
    }){
        _3BodyContent(navController)
    }
}

@Composable
fun _3BodyContent(navController: NavController){
    Column(
        modifier=Modifier.fillMaxSize().background(Color.Gray),
        //Definición posición vertical
        verticalArrangement = Arrangement.SpaceAround,//cómo se colocan de forma vertical los eltos
        //con SpaceEvenly->en función del espacio que tienen(dejando encima y debajo)
        //SpaceBetween->mismo espacio entre cada uno los huecos(sin espacio encima 1erElto ni debajo últimoElto)
        //SpaceAround->como Evenly pero dejando mismo espacio encima primero y debajo último (siendo la mitad que el q existe entre eltos)
        //Definición posición horizontal
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        TextStyle(
            "Bienvenido",
            modifier = Modifier
                .background(Color.Red))
        TextStyle(
            "al maravilloso mundo",
            modifier = Modifier
                .background(Color.Blue))
        TextStyle(
            "de JetpackCompose",
            modifier = Modifier
                .background(Color.Yellow))
    }
}

@Composable
fun TextStyle(text: String,modifier: Modifier = Modifier){
    Text(text = text, modifier = modifier)
}

