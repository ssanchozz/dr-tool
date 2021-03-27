package org.dr.logic

import org.dr.domain.Meeting
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.time.LocalDateTime

internal class NoOpMeetingOrganizerTest {

    @Test
    fun inviteAndCancelTest() {
        val noOpMeetingOrganizer = NoOpMeetingOrganizer()
        val meeting = Meeting(
                "testMeeting",
                listOf(),
                LocalDateTime.now(),
                "",
                listOf()
        )
        val inviteAnswer = noOpMeetingOrganizer.invite(meeting)

        assertEquals("Invited to testMeeting!", inviteAnswer)

        val cancelAnswer = noOpMeetingOrganizer.cancel("testMeeting")

        assertEquals("Cancelled testMeeting!", cancelAnswer)
    }

    @Test
    fun rewriteInvite() {
        val noOpMeetingOrganizer = NoOpMeetingOrganizer()
        val meeting = Meeting(
                "testMeeting",
                listOf(),
                LocalDateTime.now(),
                "1",
                listOf()
        )

        assertEquals("Invited to testMeeting!", noOpMeetingOrganizer.invite(meeting))

        val newMeeting = Meeting(
                "testMeeting",
                listOf(),
                LocalDateTime.now(),
                "2",
                listOf()
        )

        assertEquals("Invited to testMeeting!", noOpMeetingOrganizer.invite(newMeeting))
    }

    @Test
    fun cancelNotExistingMeeting() {
        val noOpMeetingOrganizer = NoOpMeetingOrganizer()

        val cancelAnswer = noOpMeetingOrganizer.cancel("testMeeting")

        assertEquals("There is no testMeeting, nothing to cancel.", cancelAnswer)
    }

}