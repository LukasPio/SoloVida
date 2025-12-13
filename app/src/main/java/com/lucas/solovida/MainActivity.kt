package com.lucas.solovida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lucas.solovida.screens.Home
import com.lucas.solovida.screens.Login
import com.lucas.solovida.ui.theme.SoloVidaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SoloVidaTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val initialScreen = "login"
    NavHost(navController = navController, startDestination = initialScreen) {
        composable("login") {
            Login(navController)
        }
        composable("home") {
            Home(navController)
        }
    }
}