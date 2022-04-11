package us.rushbmarketing.mockemailapp.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import us.rushbmarketing.mockemailapp.models.BottomMenuData

@Composable
fun HomeBottomMenu() {
    val items = listOf(BottomMenuData.Mail, BottomMenuData.Call)
    BottomNavigation(backgroundColor = Color.White, contentColor = Color.Black) {
        items.forEach {
            BottomNavigationItem(
                label = { Text(text = it.text) },
                alwaysShowLabel = true,
                selected = false, onClick = { /*TODO*/ },
                icon = { Icon(imageVector = it.icon, contentDescription = it.text) }
            )
        }
    }
}