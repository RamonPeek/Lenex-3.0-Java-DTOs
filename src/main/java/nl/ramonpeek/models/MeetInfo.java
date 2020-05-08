package nl.ramonpeek.models;

import jdk.jfr.Timespan;
import nl.ramonpeek.models.enums.CourseCode;
import nl.ramonpeek.models.enums.Nation;

import java.time.LocalDateTime;
import java.util.Date;

public class MeetInfo {

    private String approved;
    private String city;
    private CourseCode course;
    private Date date;
    private LocalDateTime dayTime;
    private String name;
    private Nation nation;
    private Pool pool;
    private Timespan qualificationTime;
    private String state;

    public MeetInfo() {
    }

    public MeetInfo(String approved, String city, CourseCode course, Date date, LocalDateTime dayTime, String name, Nation nation, Pool pool, Timespan qualificationTime, String state) {
        this.approved = approved;
        this.city = city;
        this.course = course;
        this.date = date;
        this.dayTime = dayTime;
        this.name = name;
        this.nation = nation;
        this.pool = pool;
        this.qualificationTime = qualificationTime;
        this.state = state;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CourseCode getCourse() {
        return course;
    }

    public void setCourse(CourseCode course) {
        this.course = course;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getDayTime() {
        return dayTime;
    }

    public void setDayTime(LocalDateTime dayTime) {
        this.dayTime = dayTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public Timespan getQualificationTime() {
        return qualificationTime;
    }

    public void setQualificationTime(Timespan qualificationTime) {
        this.qualificationTime = qualificationTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
