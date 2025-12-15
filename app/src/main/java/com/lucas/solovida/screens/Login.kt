package com.lucas.solovida.screens

import android.graphics.drawable.shapes.OvalShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lucas.solovida.R
import com.lucas.solovida.components.AppLogo
import com.lucas.solovida.components.EmailInputField
import com.lucas.solovida.components.PasswordInputField
import com.lucas.solovida.ui.theme.Brown

@Composable
fun Login(navController: NavController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().background(color = MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier.border(
                width = 2.dp,
                shape = RoundedCornerShape(8.dp),
                color = MaterialTheme.colorScheme.primary
            )
                .fillMaxWidth(0.9f)
                .fillMaxHeight(0.6f)
                .padding(12.dp),
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AppLogo()
                Spacer(Modifier.size(16.dp))
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color.Black
                )
                Spacer(Modifier.size(16.dp))
                EmailInputField(
                    modifier = Modifier.fillMaxWidth(0.9f),
                    email = email,
                    onEmailChange = {email = it}
                )
                PasswordInputField(
                    modifier = Modifier.fillMaxWidth(0.9f),
                    password = password,
                    label = "Senha",
                    placeholder = "Insiria sua senha",
                    onPasswordChange = {password = it}
                )
                Spacer(Modifier.size(16.dp))
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier.fillMaxWidth(0.5f)
                ) {
                    Text(
                        "Entrar",
                        fontSize = 18.sp
                    )
                }
                TextButton({
                    navController.navigate("register")
                }) {
                    Text("Ainda não possui uma conta? Clique aqui!")
                }
            }
        }
    }
}