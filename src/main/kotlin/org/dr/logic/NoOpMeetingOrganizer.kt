package org.dr.logic

import org.dr.domain.Meeting

class NoOpMeetingOrganizer: MeetingOrganizer {

    private val meetingNotebook: MutableMap<String, Meeting> = HashMap()

    override fun invite(meeting: Meeting): String {
        val name = meeting.name
        meetingNotebook[name] = meeting
        return "Invited to $name!"
    }

    override fun cancel(meetingName: String): String {
        return if (meetingNotebook.containsKey(meetingName)) {
            "Cancelled $meetingName!"
        } else {
            "There is no $meetingName, nothing to cancel."
        }
    }

}