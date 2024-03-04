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
import androidx.compose.runtime.saveable.rememberSaveable
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
fun _12Screen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arro back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Contador hasta 10")
        }
    }){
        _12BodyContent(navController)
    }
}

@Composable
fun _12BodyContent(navController: NavController){

}


@Composable
fun estadoContador() {
    var count by rememberSaveable { mutableStateOf(0) }
    muestraContador(count, { count++ })
}

@Composable
fun muestraContador(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier) {
    Column(

    ) {
        if (count > 0) {
            androidx.compose.material3.Text("Has pulsado $count veces.")
        }
        androidx.compose.material3.Button(
            onClick = onIncrement,
            Modifier.padding(top = 8.dp),
            enabled = count < 10
        ) {
            if (count < 10) androidx.compose.material3.Text("No pulsar")
            else androidx.compose.material3.Text("No podias estar quieto??")
        }

    }
}

@Composable
fun contador(modifier: Modifier = Modifier) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        estadoContador()

    }
}

@Composable
@Preview(showSystemUi = true)
fun PreviewContador(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        estadoContador()

    }

}




