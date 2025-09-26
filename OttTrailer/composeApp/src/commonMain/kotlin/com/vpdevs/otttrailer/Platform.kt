package com.vpdevs.otttrailer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform