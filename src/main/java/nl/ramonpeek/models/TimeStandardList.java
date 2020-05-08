package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.CourseCode;
import nl.ramonpeek.models.enums.EventGender;
import nl.ramonpeek.models.enums.HandicapType;
import nl.ramonpeek.models.enums.TimeStandardType;

import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public class TimeStandardList {
    private int id;
    private AgeGroup ageGroup;
    private CourseCode courseCode;
    private EventGender eventGender;
    private HandicapType handicapType;
    private String name;
    private List<TimeStandard> timeStandards;
    private TimeStandardType type;

    public TimeStandardList() {
    }

    public TimeStandardList(int id, AgeGroup ageGroup, CourseCode courseCode,
                            EventGender eventGender, HandicapType handicapType, String name,
                            List<TimeStandard> timeStandards, TimeStandardType type) {
        this.id = id;
        this.ageGroup = ageGroup;
        this.courseCode = courseCode;
        this.eventGender = eventGender;
        this.handicapType = handicapType;
        this.name = name;
        this.timeStandards = timeStandards;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public CourseCode getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(CourseCode courseCode) {
        this.courseCode = courseCode;
    }

    public EventGender getEventGender() {
        return eventGender;
    }

    public void setEventGender(EventGender eventGender) {
        this.eventGender = eventGender;
    }

    public HandicapType getHandicapType() {
        return handicapType;
    }

    public void setHandicapType(HandicapType handicapType) {
        this.handicapType = handicapType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TimeStandard> getTimeStandards() {
        return timeStandards;
    }

    public void setTimeStandards(List<TimeStandard> timeStandards) {
        this.timeStandards = timeStandards;
    }

    public TimeStandardType getType() {
        return type;
    }

    public void setType(TimeStandardType type) {
        this.type = type;
    }
}
