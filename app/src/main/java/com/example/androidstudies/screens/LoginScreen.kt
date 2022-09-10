package com.example.androidstudies.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidstudies.R
import com.example.androidstudies.ui.theme.AndroidStudiesTheme

@Composable
fun Login() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFF77a4ed)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .padding(horizontal = 12.dp, vertical = 24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                tint = Color.Black
            )
            Text(
                text = "Login",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace
            )
        }

        Image(
            painter = painterResource(id = R.drawable.google),
            contentScale = ContentScale.Crop,
            contentDescription = "HeaderImage",
            modifier = Modifier
                .size(150.dp)

        )


        var inputEmail by remember { mutableStateOf("") }
        var passwordInput by remember { mutableStateOf("") }
        val isPasswordVisible by remember { mutableStateOf(false) }

        val color = Color.Black.copy(alpha = 0.78F)

        OutlinedTextField(
            value = inputEmail,
            onValueChange = { newValue ->
                inputEmail = newValue
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 12.dp),
            label = {
                Text(text = "Email")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "EmailPlaceholder")
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = color,
                cursorColor = color,
                leadingIconColor = color,
                trailingIconColor = color,
                focusedBorderColor = Color.White,
                unfocusedBorderColor = color.copy(alpha = 0.5F),
                focusedLabelColor = Color.White,
                unfocusedLabelColor = color
            )
        )

        OutlinedTextField(
            value = passwordInput,
            onValueChange = { newValue ->
                passwordInput = newValue
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 12.dp),
            label = {
                Text(
                    text = "PassWord"
                )
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Icon"
                )
            },
            trailingIcon = {
                val image = if (isPasswordVisible)
                    R.drawable.ic_baseline_visibility_24 else R.drawable.ic_baseline_visibility_off_24
                IconButton(onClick = {
                    isPasswordVisible != isPasswordVisible
                }) {
                    Icon(
                        painter = painterResource(id = image),
                        contentDescription = "Toggle Icon"
                    )

                }
            },
            singleLine = true,
            visualTransformation = if (isPasswordVisible) VisualTransformation.None
            else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = color,
                cursorColor = color,
                leadingIconColor = color,
                trailingIconColor = color,
                focusedBorderColor = Color.White,
                unfocusedBorderColor = color.copy(alpha = 0.5F),
                focusedLabelColor = Color.White,
                unfocusedLabelColor = color
            )
        )
        Button(onClick = {},
            modifier = Modifier
                .size(40.dp)
                .padding(horizontal = 150.dp, vertical = 10.dp),
            shape = CircleShape,
            contentPadding = PaddingValues(10.dp),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colors.primary
            )
        ) {
            Text(text = "Login")
            
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPrev() {
    AndroidStudiesTheme {
        Login()
    }
}