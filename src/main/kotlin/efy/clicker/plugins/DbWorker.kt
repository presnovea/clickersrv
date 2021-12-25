package efy.clicker.plugins

import com.zaxxer.hikari.HikariConfig
import org.jetbrains.exposed.sql.Database

public class DbWorker
{
    //private val dataSource = TODO()
    //private val config

    private constructor()
    {
        val config = HikariConfig().apply {
            jdbcUrl = ""
        }
    }

    fun connect() {}
    fun disconnect() {}
}