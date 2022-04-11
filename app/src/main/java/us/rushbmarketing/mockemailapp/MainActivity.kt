package us.rushbmarketing.mockemailapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import us.rushbmarketing.mockemailapp.components.HomeAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import us.rushbmarketing.mockemailapp.components.HomeBottomMenu
import us.rushbmarketing.mockemailapp.components.MailDrawerMenu
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
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {HomeAppBar(scaffoldState, coroutineScope)},
        drawerContent = {
            MailDrawerMenu(scrollState)
        },
        bottomBar = {
            HomeBottomMenu()
        }
    ) {
        LazyColumn{

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MockEmailAppTheme {
        mailApp()
    }
}