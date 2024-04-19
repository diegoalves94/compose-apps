package me.study.compose_apps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import me.aluvery.compose_apps.ui.theme.ComposeAppsTheme
import me.study.compose_apps.navigation.SetupNavGraph
import me.study.util.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAppsTheme {
                val navController = rememberNavController()
                SetupNavGraph(
                    startDestination = Screen.AllApps.route,
                    navController = navController
                )
            }
        }
    }
}
