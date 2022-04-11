package us.rushbmarketing.mockemailapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import us.rushbmarketing.mockemailapp.models.DrawerMenuData

@Composable
fun MailDrawerMenu(scrollState: ScrollState) {
    val menuList = listOf(
        DrawerMenuData.Divider,
        DrawerMenuData.AllInboxes,
        DrawerMenuData.Divider,
        DrawerMenuData.Primary,
        DrawerMenuData.Social,
        DrawerMenuData.Promotions,
        DrawerMenuData.HeaderOne,
        DrawerMenuData.Starred,
        DrawerMenuData.Snoozed,
        DrawerMenuData.Important,
        DrawerMenuData.Sent,
        DrawerMenuData.Schedule,
        DrawerMenuData.Outbox,
        DrawerMenuData.Draft,
        DrawerMenuData.AllMail,
        DrawerMenuData.Divider,
        DrawerMenuData.Setting,
        DrawerMenuData.Help
    )
    Column(Modifier.verticalScroll(scrollState)){
        Text(
            text = "RB Mail", color = Color.Blue,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp))
        menuList.forEach{ item->
            when{
                item.isDivider ->{
                    Divider(modifier = Modifier.padding(bottom = 8.dp, top = 8.dp))
                }
                item.isHeader ->{
                    Text(text = item.text!!, fontWeight= FontWeight.Light,
                        modifier = Modifier.padding(start = 20.dp,bottom = 8.dp,
                            top=8.dp))
                }
                else ->{
                    MailDrawerItem(item = item)
                }
            }
        }
    }
}

@Composable
fun MailDrawerItem(item: DrawerMenuData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(top = 16.dp)
    ) {
        Image(
            imageVector = item.icon!!,
            contentDescription =item.text!!,
            modifier = Modifier.weight(0.5f)
        )
        Text(text = item.text,modifier = Modifier.weight(2.0f))
    }

}