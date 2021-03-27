package org.dr.logic

import org.dr.domain.Meeting

interface MeetingOrganizer {

    fun invite(meeting: Meeting): String

    fun cancel(meetingName: String): String

}