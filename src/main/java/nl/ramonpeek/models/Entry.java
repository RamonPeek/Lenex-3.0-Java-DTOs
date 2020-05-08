package nl.ramonpeek.models;

import jdk.jfr.Timespan;
import nl.ramonpeek.models.enums.CourseCode;
import nl.ramonpeek.models.enums.EntryStatus;

import java.time.Duration;
import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Marc
 */
public class Entry {

    private AgeGroup ageGroup;
    private CourseCode entryCourse;
    private Duration entryTime;
    private Event event;
    private Heat heat;
    private int lane;
    private MeetInfo meetInfo;
    private List<RelayPosition> relayPositions;
    private EntryStatus status;

    public Entry() {   }

    public Entry(AgeGroup ageGroup, CourseCode entryCourse, Duration entryTime, Event event, Heat heat, int lane, MeetInfo meetInfo, List<RelayPosition> relayPositions, EntryStatus status) {
        this.ageGroup = ageGroup;
        this.entryCourse = entryCourse;
        this.entryTime = entryTime;
        this.event = event;
        this.heat = heat;
        this.lane = lane;
        this.meetInfo = meetInfo;
        this.relayPositions = relayPositions;
        this.status = status;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public CourseCode getEntryCourse() {
        return entryCourse;
    }

    public void setEntryCourse(CourseCode entryCourse) {
        this.entryCourse = entryCourse;
    }

    public Duration getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Duration entryTime) {
        this.entryTime = entryTime;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Heat getHeat() {
        return heat;
    }

    public void setHeat(Heat heat) {
        this.heat = heat;
    }

    public int getLane() {
        return lane;
    }

    public void setLane(int lane) {
        this.lane = lane;
    }

    public MeetInfo getMeetInfo() {
        return meetInfo;
    }

    public void setMeetInfo(MeetInfo meetInfo) {
        this.meetInfo = meetInfo;
    }

    public List<RelayPosition> getRelayPositions() {
        return relayPositions;
    }

    public void setRelayPositions(List<RelayPosition> relayPositions) {
        this.relayPositions = relayPositions;
    }

    public EntryStatus getStatus() {
        return status;
    }

    public void setStatus(EntryStatus status) {
        this.status = status;
    }
}
