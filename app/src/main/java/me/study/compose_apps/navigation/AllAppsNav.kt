package me.study.compose_apps.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import me.study.compose_apps.ui.screen.AllAppsScreen
import me.study.util.Screen


fun NavGraphBuilder.allAppsRoute(
    navigateToAllApps: () -> Unit
){
    composable(route = Screen.AllApps.route){
        AllAppsScreen()
    }
}