package org.dr.domain

import java.time.LocalDateTime

data class Meeting(
        val name: String,
        val emails: List<String>,
        val start: LocalDateTime,
        val description: String,
        val wishes: List<String>
)