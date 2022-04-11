package us.rushbmarketing.mockemailapp.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun MailFab(scrollState: ScrollState){
    if(scrollState.value < 100){
        ExtendedFloatingActionButton(text = { Text(text = "New Message", fontSize = 16.sp)},
            onClick = { /*TODO*/ },
            icon = {Icon(imageVector = Icons.Default.Add, contentDescription = "New Email")},
            backgroundColor = MaterialTheme.colors.surface
        )
    }
    else {
        FloatingActionButton(
            onClick = { /*TODO*/ },
            backgroundColor = MaterialTheme.colors.surface
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "New Email")
        }
    }
}