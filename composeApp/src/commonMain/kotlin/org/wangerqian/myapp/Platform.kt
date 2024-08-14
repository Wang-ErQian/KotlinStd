package org.wangerqian.myapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform