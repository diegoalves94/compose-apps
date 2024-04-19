package me.study.compose_apps.ui.screen

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.study.aluvery.AluveryActivity
import me.study.birthday.BirthdayActivity

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AllAppsScreen() {

    Scaffold(
        content = {
            AllAppsMainScreen()
        }
    )
}


@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AllAppsMainScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                modifier = Modifier.fillMaxWidth(0.5f),
                onClick = {
                    context.startActivity(Intent(context, AluveryActivity::class.java))
                }) {
                Text(text = "Aluvery")
            }

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    context.startActivity(Intent(context, BirthdayActivity::class.java))
                }) {
                Text(text = "Birthday")
            }
        }
    }
}
