package me.study.compose_apps.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import me.study.aluvery.navigation.aluveryRoute
import me.study.birthday.navigation.birthdayRoute
import me.study.util.Screen

@Composable
fun SetupNavGraph(
    startDestination: String,
    navController: NavHostController
) {
    NavHost(
        startDestination = startDestination,
        navController = navController,
    ) {
        allAppsRoute(
            navigateToAllApps = {
                navController.popBackStack()
                navController.navigate(Screen.AllApps.route)
            }
        )
        aluveryRoute(
            navigateToAluveryApp = {
                navController.navigate(Screen.Aluvery.route)
            }
        )
        birthdayRoute(
            navigateToBirthdayApp = {
                navController.navigate(Screen.Birthday.route)
            }
        )
    }
}