package me.study.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import me.study.aluvery.theme.AluveryTheme


class AluveryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    MyFirstComposable()
                }
            }
        }
    }
}

@Composable
fun MyFirstComposable(){
    Text(text = "é nois cachorro")
    Text(text = "é nois cachorro grande")
}

@Preview
@Composable
fun myPreview(){
    MyFirstComposable()
}