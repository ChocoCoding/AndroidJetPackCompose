package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import android.support.v4.os.IResultReceiver2.Default
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcompose.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun FirstScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "First Screen")
        }
    }) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text ="Botones de navegación",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold
        )
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route)
        }) {
            Text("Listas Desplegables")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._3Screen.route)
        }) {
            Text("Column")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._4Screen.route)
        }) {
            Text("Column 2")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._5Screen.route)
        }) {
            Text("Column 3")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._6Screen.route)
        }) {
            Text("Column 4")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._7Screen.route)
        }) {
            Text("Row")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._8Screen.route)
        }) {
            Text("Button")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._9Screen.route)
        }) {
            Text("Button 2")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._10Screen.route)
        }) {
            Text("Button 3")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._11Screen.route)
        }) {
            Text("Calculadora Estado")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens._13Screen.route)
        }) {
            Text("Calculadora VM")
        }
    }
}
