package efy.clicker

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import efy.clicker.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureMonitoring()
        configureHTTP()
        configureRouting()
        configureSerialization()
        configureSecurity()
    }.start(wait = true)
}
