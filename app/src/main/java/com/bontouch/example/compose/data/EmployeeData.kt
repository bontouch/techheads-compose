package com.bontouch.example.compose.data

import com.bontouch.example.compose.R
import com.bontouch.example.compose.domain.Employee
import com.bontouch.example.compose.domain.Studio
import com.bontouch.example.compose.domain.Teams
import org.threeten.bp.LocalDate

object EmployeeData {

    private val camille = Employee(
        name = "Camille Bossoutrot",
        role = "Android Developer",
        team = "Systembolaget",
        notes = "Likes Kotlin",
        startDate = LocalDate.parse("2017-10-30"),
        imageResource = R.drawable.photo_camille
    )

    private val emma = Employee(
        name = "Emma Olsson",
        role = "iOS Developer",
        team = "Systembolaget",
        notes = "Likes Swift",
        startDate = LocalDate.parse("2021-01-18"),
        imageResource = R.drawable.photo_emma
    )

    private val jonas = Employee(
        name = "Jonas Hansson",
        role = "Android Developer",
        team = "Swish",
        notes = "Likes Kotlin",
        startDate = LocalDate.parse("2018-08-20"),
        imageResource = R.drawable.photo_jonas
    )

    private val adam = Employee(
        name = "Adam Morén",
        role = "Web Developer",
        team = "Swish",
        notes = "Likes JavaScript",
        startDate = LocalDate.parse("2021-08-09"),
        imageResource = R.drawable.photo_adam
    )

    private val robert = Employee(
        name = "Robert Söderbjörn",
        role = "Android Developer",
        team = "PostNord",
        notes = "❤️ Commodore C64 / Amiga",
        startDate = LocalDate.parse("2017-02-27"),
        imageResource = R.drawable.photo_robert
    )

    private val alex = Employee(
        name = "Alex Kent",
        role = "iOS Developer",
        team = null,
        notes = "Likes Swift",
        startDate = LocalDate.parse("2020-02-21"),
        imageResource = R.drawable.photo_alex
    )

    private val susanne = Employee(
        name = "Susanne Hansson",
        role = "Head of Operations",
        team = null,
        notes = "",
        startDate = LocalDate.parse("2021-10-11"),
        imageResource = R.drawable.photo_susanne
    )

    private val lars = Employee(
        name = "Lars Englund",
        role = "UX Designer",
        team = "Skistar",
        notes = "Likes design",
        startDate = LocalDate.parse("2020-01-07"),
        imageResource = R.drawable.photo_lars
    )

    private val nikita = Employee(
        name = "Nikita Dudson",
        role = "UI Designer",
        team = "PostNord",
        notes = "Likes design",
        startDate = LocalDate.parse("2018-09-17"),
        imageResource = R.drawable.photo_nikita
    )

    private val alexN = Employee(
        name = "Alex Norrman",
        role = "Android Developer",
        team = null,
        notes = "Likes Kotlin",
        startDate = LocalDate.parse("2020-01-11"),
        imageResource = R.drawable.photo_alex_n
    )

    private val frida = Employee(
        name = "Frida Eklund",
        role = "Cloud & iOS Developer",
        team = null,
        notes = "",
        startDate = LocalDate.parse("2020-05-04"),
        imageResource = R.drawable.photo_frida
    )

    private val marthin = Employee(
        name = "Marthin Freij",
        role = "Studio Manager",
        team = null,
        notes = "",
        startDate = LocalDate.parse("2019-09-25"),
        imageResource = R.drawable.photo_marthin
    )

    private val mikael = Employee(
        name = "Mikael Konradsson",
        role = "iOS Developer",
        team = null,
        notes = "Likes Swift",
        startDate = LocalDate.parse("2019-10-28"),
        imageResource = R.drawable.photo_mikael
    )

    private val david = Employee(
        name = "David Jonsén",
        role = "iOS Developer",
        team = null,
        notes = "Likes Swift",
        startDate = LocalDate.parse("2019-10-28"),
        imageResource = R.drawable.photo_david
    )

    val people = Teams(
        listOf(
            Studio(
                name = "Kalmar",
                logoResource = R.drawable.logo_kalmar,
                employees = listOf(
                    frida,
                    marthin,
                    mikael,
                    david,
                )
            ),
            Studio(
                name = "Åre / Östersund",
                logoResource = R.drawable.logo_osd,
                employees = listOf(
                    alex,
                    susanne,
                    lars,
                    nikita,
                    alexN
                )
            ),
            Studio(
                name = "Stockholm",
                logoResource = R.drawable.logo_sthlm,
                employees = listOf(
                    camille,
                    robert,
                    emma,
                    jonas,
                    adam
                )
            ),
        )
    )

}
