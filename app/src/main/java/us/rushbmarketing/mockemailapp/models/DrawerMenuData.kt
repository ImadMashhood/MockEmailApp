package us.rushbmarketing.mockemailapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuData (
    val icon: ImageVector? = null, val text: String? = null,
    val isDivider: Boolean = false, val isHeader:Boolean = false
    ){
    object AllInboxes: DrawerMenuData(
        icon = Icons.Outlined.AllInbox,
        text = "All inboxes"
    )
    object Primary: DrawerMenuData(
        icon = Icons.Outlined.Inbox,
        text = "Primary"
    )
    object Social: DrawerMenuData(
        icon = Icons.Outlined.Person,
        text = "Social"
    )
    object Promotions: DrawerMenuData(
        icon = Icons.Outlined.Tag,
        text = "Promotions",
    )
    object Starred: DrawerMenuData(
        icon = Icons.Outlined.StarOutline,
        text = "Starred"
    )
    object Snoozed: DrawerMenuData(
        icon = Icons.Outlined.Snooze,
        text = "Snoozed"
    )
    object Important: DrawerMenuData(
        icon = Icons.Outlined.Label,
        text = "Important"
    )
    object Sent: DrawerMenuData(
        icon = Icons.Outlined.Send,
        text = "Sent"
    )
    object Schedule: DrawerMenuData(
        icon = Icons.Outlined.Schedule,
        text = "Scheduled"
    )
    object Outbox: DrawerMenuData(
        icon = Icons.Outlined.Outbox,
        text = "Outbox"
    )
    object Draft: DrawerMenuData(
        icon = Icons.Outlined.Drafts,
        text = "Drafts"
    )
    object AllMail: DrawerMenuData(
        icon = Icons.Outlined.Mail,
        text = "All Mail"
    )
    object Setting: DrawerMenuData(
        icon = Icons.Outlined.Settings,
        text = "Settings"
    )
    object Help: DrawerMenuData(
        icon = Icons.Outlined.Help,
        text = "Help & FeedBack"
    )
    object Divider: DrawerMenuData(
        isDivider = true
    )
    object HeaderOne: DrawerMenuData(
        isHeader = true,
        text = "ALL LABELS"
    )
}