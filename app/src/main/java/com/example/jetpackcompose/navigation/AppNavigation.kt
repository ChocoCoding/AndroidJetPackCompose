package com.example.jetpackcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.screens.FirstScreen
import com.example.jetpackcompose.screens.SecondScreen
import com.example.jetpackcompose.screens._10Screen
import com.example.jetpackcompose.screens._11Screen
import com.example.jetpackcompose.screens._13Screen
import com.example.jetpackcompose.screens._3Screen
import com.example.jetpackcompose.screens._4Screen
import com.example.jetpackcompose.screens._5Screen
import com.example.jetpackcompose.screens._6Screen
import com.example.jetpackcompose.screens._7Screen
import com.example.jetpackcompose.screens._8Screen
import com.example.jetpackcompose.screens._9Screen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens._3Screen.route){
            _3Screen(navController)
        }
        composable(route = AppScreens._4Screen.route){
            _4Screen(navController)
        }
        composable(route = AppScreens._5Screen.route){
            _5Screen(navController)
        }
        composable(route = AppScreens._6Screen.route){
            _6Screen(navController)
        }
        composable(route = AppScreens._7Screen.route){
            _7Screen(navController)
        }
        composable(route = AppScreens._8Screen.route){
            _8Screen(navController)
        }
        composable(route = AppScreens._9Screen.route){
            _9Screen(navController)
        }
        composable(route = AppScreens._10Screen.route){
            _10Screen(navController)
        }
        composable(route = AppScreens._11Screen.route){
            _11Screen(navController)
        }
        composable(route = AppScreens._13Screen.route){
            _13Screen(navController)
        }
    }

}

