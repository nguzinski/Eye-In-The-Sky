package com.example.eye2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform