package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import android.support.v4.os.IResultReceiver2.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Scaffold
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.R
import com.example.jetpackcompose.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun _8Screen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arro back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Botones con contador")
        }
    }){
        _8BodyContent(navController)
    }
}

@Composable
fun _8BodyContent(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        BotonesColores(text = "",colorBackground= Color.Yellow, colorContent= Color.Black)
        BotonesColores(text = "",colorBackground= Color.Green, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.Gray, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.Magenta, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.DarkGray, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.Red, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.Blue, colorContent= Color.Black)

    }
}

@Composable
@Preview(showSystemUi = true)
fun PreviewContent(){
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        BotonesColores(text = "",colorBackground= Color.Yellow, colorContent= Color.Black)
        BotonesColores(text = "",colorBackground= Color.Green, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.Gray, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.Magenta, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.DarkGray, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.Red, colorContent= Color.Black)
        BotonesColores(text = "0",colorBackground= Color.Blue, colorContent= Color.Black)

    }
}

@Composable
fun BotonesColores(text: String, colorBackground:Color, colorContent:Color){
    Row (
        Modifier
            .border(1.dp, Color.Black)
            .background(Color.Cyan)
            .fillMaxWidth(),

    ){
        Row(
            Modifier
                .fillMaxWidth(0.6f),
            horizontalArrangement = Arrangement.End
        ) {
            var cont by rememberSaveable{ mutableStateOf(0) }
            androidx.compose.material3.Button(
                onClick = { cont++ },
                colors = ButtonDefaults.buttonColors(
                    contentColor=colorContent,
                    containerColor = colorBackground
                ),
            ) {
                androidx.compose.material3.Text(text="${cont}")
            }
        }
        Row {
            Text(text)
        }
    }

}

