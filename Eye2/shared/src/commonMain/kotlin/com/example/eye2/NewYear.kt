package com.example.eye2

import kotlinx.datetime.*
fun daysUntilMonday():Int{
    val today = Clock.System.todayIn(TimeZone.currentSystemDefault());

    val nextMonday = if(today.dayOfMonth>7) (today.dayOfMonth-2)%7 else today.dayOfMonth%7
    return today.daysUntil(LocalDate(today.year,today.monthNumber,today.dayOfMonth+nextMonday))
}