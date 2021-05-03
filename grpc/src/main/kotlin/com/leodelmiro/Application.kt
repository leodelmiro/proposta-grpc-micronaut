package com.leodelmiro

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.leodelmiro")
		.start()
}

