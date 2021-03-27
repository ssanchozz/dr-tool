package org.dr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DrTool

fun main(args: Array<String>) {
	runApplication<DrTool>(*args)
}
