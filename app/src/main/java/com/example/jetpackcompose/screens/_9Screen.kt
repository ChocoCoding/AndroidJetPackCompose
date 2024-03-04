package com.example.jetpackcompose.screens

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources.Theme
import android.support.v4.os.IResultReceiver2.Default
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcompose.navigation.AppScreens
import gen._base._base_java__assetres.srcjar.R.attr.fontStyle
import gen._base._base_java__assetres.srcjar.R.attr.fontWeight

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun _9Screen(navController: NavController){
    Scaffold (topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arro back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Botones con Toast")
        }
    }){
        _9BodyContent(navController)
    }
}

@Composable
fun _9BodyContent(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        botonesPersonaliz(text = "ButtonConButton", color = MaterialTheme.colors.primary,toast = "ButtonConButton",colorText = Color.White)
        botonesPersonaliz(text = "ButtonEnText",  color =  androidx.compose.material3.MaterialTheme.colorScheme.tertiary,toast = "ButtonEnText",colorText = Color.White)
        botonesPersonaliz(text = "ButtonEnBox",  color = Color.Green, toast = "ButtonEnBox", colorText = Color.White)
    }
}

@Composable
@Preview(showSystemUi = true)
fun previewToast(){
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        botonesPersonaliz(text = "ButtonConButton", color = MaterialTheme.colors.primary,toast = "ButtonConButton",colorText = Color.White)
        botonesPersonaliz(text = "ButtonEnText",  color =  androidx.compose.material3.MaterialTheme.colorScheme.tertiary,toast = "ButtonEnText",colorText = Color.Black, colorBorde = Color.Blue)
        botonesPersonaliz(text = "ButtonEnBox",  color = Color.Green, toast = "ButtonEnBox", colorText = Color.White)
    }

}

@Composable
fun botonesPersonaliz(text: String,color:Color,colorText:Color,toast: String, colorBorde: Color ?= null){
    val context = LocalContext.current;
    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = color),
        border = colorBorde?.let { BorderStroke(4.dp, it) },
        shape = CircleShape,
        onClick = {
        Toast.makeText(context,toast,Toast.LENGTH_LONG).show()
    }) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 18.sp
        )

    }

}
