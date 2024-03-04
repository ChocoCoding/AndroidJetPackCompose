package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import android.support.v4.os.IResultReceiver2.Default
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose.navigation.AppScreens

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun _6Screen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrowback",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Diferentes Combinaciones Column")
        }
    }){
        _6BodyContent(navController)
    }
}

@Composable
fun _6BodyContent(navController: NavController){
    Box(
        modifier = Modifier
            .width(800.dp)
            .height(200.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ){
        Box(modifier = Modifier
            .width(800.dp)
            .height(200.dp)
            .padding(top = 20.dp, start = 20.dp, bottom = 60.dp, end = 20.dp)
            .background(Color.Cyan)
        ){
            TextStyle(text = "hi",
                modifier = Modifier
                    .align(Alignment.BottomStart)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .align(Alignment.BottomStart)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .align(Alignment.BottomStart)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .align(Alignment.TopCenter)
            )
            TextStyle(text = "teis",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .align(Alignment.TopCenter)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .align(Alignment.BottomEnd)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .align(Alignment.BottomEnd)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .align(Alignment.BottomEnd)
            )

        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewThing2(){
    Box(
        modifier = Modifier
            .width(800.dp)
            .height(200.dp)
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ){
        Box(modifier = Modifier
            .width(800.dp)
            .height(200.dp)
            .padding(top = 20.dp, start = 20.dp, bottom = 60.dp, end = 20.dp)
            .background(Color.Cyan)
        ){
            TextStyle(text = "hi",
                modifier = Modifier
                    .align(Alignment.BottomStart)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .align(Alignment.BottomStart)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .align(Alignment.BottomStart)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .align(Alignment.TopCenter)
            )
            TextStyle(text = "teis",
                modifier = Modifier
                    .padding(top = 15.dp)
                    .align(Alignment.TopCenter)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .align(Alignment.BottomEnd)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .padding(bottom = 15.dp)
                    .align(Alignment.BottomEnd)
            )
            TextStyle(text = "hi",
                modifier = Modifier
                    .padding(bottom = 30.dp)
                    .align(Alignment.BottomEnd)
            )

        }
        }
    }

