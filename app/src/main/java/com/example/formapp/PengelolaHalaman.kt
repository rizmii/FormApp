package com.example.formapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlin.math.round
import androidx.navigation.compose.rememberNavController


enum class PengelolaHalaman {
    Formulir,
    Detail
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactApp(
    viewModel : ContactViewModel = viewModel(),
    navController: NavHostController = rememberNavController()

){
    Scaffold { innerPadding ->
        val uiState by viewModel.stateUI.collectAsState()
        NavHost(
            navController=navController,
            startDestination = PengelolaHalaman.Formulir.name,
            modifier = Modifier.padding(innerPadding)
        ){
            composable(route = PengelolaHalaman.Formulir.name){
                HalamanSatu(onSubmitButtonClick = {
                    viewModel.setContact(it)
                    navController.navigate(PengelolaHalaman.Detail.name)
                } )
            }
            composable(route = PengelolaHalaman.Detail.name){
                HalamanDua(contactUIState = uiState, onClickedButton = {
                    navController.popBackStack(PengelolaHalaman.Formulir.name,false)
                })
            }
        }
    }
}