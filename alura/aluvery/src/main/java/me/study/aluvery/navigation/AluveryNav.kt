package me.study.aluvery.navigation

import android.content.Intent
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import me.study.aluvery.AluveryActivity
import me.study.util.Screen

fun NavGraphBuilder.aluveryRoute(
    navigateToAluveryApp: () -> Unit
){
    composable(route = Screen.Aluvery.route){
        val context = LocalContext.current
        context.startActivity(Intent(context, AluveryActivity::class.java))
    }
}