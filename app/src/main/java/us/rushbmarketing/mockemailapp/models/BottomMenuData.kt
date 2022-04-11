package us.rushbmarketing.mockemailapp.models

import android.media.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val text: String
    ){
    object Mail: BottomMenuData(icon = Icons.Outlined.Mail,"Mail")
    object Call: BottomMenuData(icon = Icons.Outlined.Phone, "Call")
}