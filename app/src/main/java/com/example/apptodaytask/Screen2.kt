package com.example.apptodaytask


import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Screen2(navController:NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar { Text(text = "Tela sobre") }
        }

    ) {
        // Screen content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()

        ) {


            Text(text = "Projeto para a tarefa  'TaskAppToday com navegação de telas', aproveite a aplicação!!")
            Button(onClick = {navController.popBackStack()}) {
                Text(text = "Volte para a primeira tela")
            }

        }
    }
}