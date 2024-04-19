package me.study.util

sealed class Screen(val route: String){
    data object AllApps : Screen(route = "all_apps")
    data object Aluvery : Screen(route = "alura_aluvery_app")
    data object Birthday : Screen(route = "google_birthday_app")
}
