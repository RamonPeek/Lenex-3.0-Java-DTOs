package nl.ramonpeek.models;

import java.time.LocalDateTime;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public class Session {

    private Course course;
    private LocalDateTime date;
    private LocalDateTime daytime;
    private LocalDateTime endTime;
    private List<Event> events;
    private List<Fee> fees;
    private List<Judge> judges;
    private int maxEntriesAthlete;
    private int maxEntriesRelay;
    private String name;
    private int number;
    private LocalDateTime officialMeeting;
    private Pool pool;
    private String remarksJudge;
    private LocalDateTime teamLeaderMeeting;
    private Timing timing;
    private LocalDateTime warmUpFrom;
    private LocalDateTime warmUpUntil;

    public Session() {
    }

    public Session(Course course, LocalDateTime date, LocalDateTime daytime, LocalDateTime endTime, List<Event> events, List<Fee> fees, List<Judge> judges, int maxEntriesAthlete, int maxEntriesRelay, String name, int number, LocalDateTime officialMeeting, Pool pool, String remarksJudge, LocalDateTime teamLeaderMeeting, Timing timing, LocalDateTime warmUpFrom, LocalDateTime warmUpUntil) {
        this.course = course;
        this.date = date;
        this.daytime = daytime;
        this.endTime = endTime;
        this.events = events;
        this.fees = fees;
        this.judges = judges;
        this.maxEntriesAthlete = maxEntriesAthlete;
        this.maxEntriesRelay = maxEntriesRelay;
        this.name = name;
        this.number = number;
        this.officialMeeting = officialMeeting;
        this.pool = pool;
        this.remarksJudge = remarksJudge;
        this.teamLeaderMeeting = teamLeaderMeeting;
        this.timing = timing;
        this.warmUpFrom = warmUpFrom;
        this.warmUpUntil = warmUpUntil;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getDaytime() {
        return daytime;
    }

    public void setDaytime(LocalDateTime daytime) {
        this.daytime = daytime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public List<Judge> getJudges() {
        return judges;
    }

    public void setJudges(List<Judge> judges) {
        this.judges = judges;
    }

    public int getMaxEntriesAthlete() {
        return maxEntriesAthlete;
    }

    public void setMaxEntriesAthlete(int maxEntriesAthlete) {
        this.maxEntriesAthlete = maxEntriesAthlete;
    }

    public int getMaxEntriesRelay() {
        return maxEntriesRelay;
    }

    public void setMaxEntriesRelay(int maxEntriesRelay) {
        this.maxEntriesRelay = maxEntriesRelay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDateTime getOfficialMeeting() {
        return officialMeeting;
    }

    public void setOfficialMeeting(LocalDateTime officialMeeting) {
        this.officialMeeting = officialMeeting;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public String getRemarksJudge() {
        return remarksJudge;
    }

    public void setRemarksJudge(String remarksJudge) {
        this.remarksJudge = remarksJudge;
    }

    public LocalDateTime getTeamLeaderMeeting() {
        return teamLeaderMeeting;
    }

    public void setTeamLeaderMeeting(LocalDateTime teamLeaderMeeting) {
        this.teamLeaderMeeting = teamLeaderMeeting;
    }

    public Timing getTiming() {
        return timing;
    }

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    public LocalDateTime getWarmUpFrom() {
        return warmUpFrom;
    }

    public void setWarmUpFrom(LocalDateTime warmUpFrom) {
        this.warmUpFrom = warmUpFrom;
    }

    public LocalDateTime getWarmUpUntil() {
        return warmUpUntil;
    }

    public void setWarmUpUntil(LocalDateTime warmUpUntil) {
        this.warmUpUntil = warmUpUntil;
    }
}
