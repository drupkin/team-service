package bg.dr.chillywe.teamservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["bg.dr.avro.chillywe", "bg.dr.chillywe.teamservice"])
class TeamServiceApplication

fun main(args: Array<String>) {
    runApplication<TeamServiceApplication>(*args)
}
