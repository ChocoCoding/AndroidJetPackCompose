package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun _5Screen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrowback",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Box + Column Screen")
        }
    }){
        _5BodyContent(navController)
    }
}

@Composable
fun _5BodyContent(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .background(Color.Cyan)
        ){
            Column(modifier = Modifier
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween) {

                TextStyle(
                    text = "Hola",
                    Modifier
                        .align(Alignment.Start))
                TextStyle(
                    text = "JetPackCompose",
                    Modifier
                        .align(AbsoluteAlignment.Left))
                TextStyle(
                    text = "Otro texto Hardcodeado",
                    Modifier
                        .align(Alignment.End))
            }
        }
    }
}


@Composable
@Preview
fun previewThing(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
        contentAlignment = Alignment.Center
    ){
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
            .background(Color.Cyan)
        ){
            Column(modifier = Modifier
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween) {

                TextStyle(
                    text = "Hola",
                    Modifier
                        .align(Alignment.Start))
                TextStyle(
                    text = "JetPackCompose",
                    Modifier
                        .align(AbsoluteAlignment.Left))
                TextStyle(
                    text = "Otro texto Hardcodeado",
                    Modifier
                        .align(Alignment.End))
            }
        }
    }

}


