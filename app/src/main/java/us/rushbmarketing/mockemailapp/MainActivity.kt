package us.rushbmarketing.mockemailapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import us.rushbmarketing.mockemailapp.components.HomeAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import us.rushbmarketing.mockemailapp.ui.theme.MockEmailAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MockEmailAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    mailApp()
                }
            }
        }
    }
}

@Composable
fun mailApp() {
    Scaffold(topBar = {HomeAppBar()}) {
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MockEmailAppTheme {
        mailApp()
    }
}