package me.study.birthday.navigation

import android.content.Intent
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import me.study.birthday.BirthdayActivity
import me.study.util.Screen

fun NavGraphBuilder.birthdayRoute(
    navigateToBirthdayApp: () -> Unit
){
    composable(route = Screen.Birthday.route){
        val context = LocalContext.current
        context.startActivity(Intent(context, BirthdayActivity::class.java))
    }
}