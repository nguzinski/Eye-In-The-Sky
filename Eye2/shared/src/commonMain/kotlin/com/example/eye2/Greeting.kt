package com.example.eye2
import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val intro = if(Random.nextInt(0,100)>50) "Howdy" else "Aloha";
        return " ${intro}, Welcome to Eye in the Sky! \n Running on ${platform.name} \n Only ${daysUntilMonday()} days till dreaded Monday :( ";

    }


}