package com.lucas.solovida.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.lucas.solovida.R
import com.lucas.solovida.utils.Constants

@Composable
fun EmailInputField(
    email: String,
    onEmailChange: (String) -> Unit,
    modifier: Modifier = Modifier
) {

    OutlinedTextField(
        value = email,
        onValueChange = {
            if (it.length <= Constants.MAX_EMAIL_LENGTH) onEmailChange(it)
        },
        label = { Text("Email") },
        placeholder = { Text("Digite seu email") },
        singleLine = true,
        modifier = modifier.fillMaxWidth(),
        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.outline_email_24),
                contentDescription = "Mail icon"
            )
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        )
    )
}