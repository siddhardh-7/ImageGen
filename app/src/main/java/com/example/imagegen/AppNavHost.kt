package com.example.imagegen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.imagegen.screens.DetailScreen
import com.example.imagegen.screens.HistoryScreen
import com.example.imagegen.screens.MainScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Main.route) {
        composable(route = Screen.Main.route) {
            MainScreen(
                toDetailsScreen = {
                    navController.navigate(route = Screen.Detail.route)
                },
                toHistoryScreen = {
                    navController.navigate(route = Screen.History.route)
                }
            )
        }
        composable(
            route = Screen.Detail.route,
        ) {
            DetailScreen {
                navController.popBackStack()
            }
        }
        composable(
            route = Screen.History.route
        ) {
            HistoryScreen {
                navController.popBackStack()
            }
        }
    }
}

sealed class Screen(val route: String) {
    object Main: Screen("main_screen")
    object Detail: Screen("detail_screen")
    object History: Screen("history_screen")
}