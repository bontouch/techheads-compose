package com.bontouch.example.compose.ui.screens.employees

import androidx.annotation.DrawableRes
import org.threeten.bp.LocalDate

sealed interface ListItem {

    object TechHeadsLogo : ListItem

    data class Team(
        val name: String,
        @DrawableRes val logoResource: Int?
    ): ListItem

    data class Employee(
        val name: String,
        val role: String,
        val team: String?,
        val employmentDate: LocalDate?,
        @DrawableRes val photoResource: Int,
        val notes: String,
    ): ListItem

}
