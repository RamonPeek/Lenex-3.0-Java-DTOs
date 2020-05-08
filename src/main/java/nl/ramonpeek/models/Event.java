package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.EventGender;
import nl.ramonpeek.models.enums.EventRound;
import nl.ramonpeek.models.enums.EventType;
import nl.ramonpeek.models.enums.Timing;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public class Event {
    private int id;
    private List<AgeGroup> ageGroups;
    private LocalDateTime dayTime;
    private Fee fee;
    private EventGender gender;
    private List<Heat> heats;
    private int maxEntries;
    private int number;
    private int order;
    private Event previousEvent;
    private EventRound eventRound;
    private int run;
    private SwimStyle swimStyle;
    private List<TimeStandardRef> timeStandardRefs;
    private Timing timing;
    private EventType type;

    public Event() {
    }

    public Event(int id, List<AgeGroup> ageGroups, LocalDateTime dayTime, Fee fee,
                 EventGender gender, List<Heat> heats, int maxEntries, int number, int order,
                 Event previousEvent, EventRound eventRound, int run, SwimStyle swimStyle,
                 List<TimeStandardRef> timeStandardRefs, Timing timing, EventType type) {
        this.id = id;
        this.ageGroups = ageGroups;
        this.dayTime = dayTime;
        this.fee = fee;
        this.gender = gender;
        this.heats = heats;
        this.maxEntries = maxEntries;
        this.number = number;
        this.order = order;
        this.previousEvent = previousEvent;
        this.eventRound = eventRound;
        this.run = run;
        this.swimStyle = swimStyle;
        this.timeStandardRefs = timeStandardRefs;
        this.timing = timing;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<AgeGroup> getAgeGroups() {
        return ageGroups;
    }

    public void setAgeGroups(List<AgeGroup> ageGroups) {
        this.ageGroups = ageGroups;
    }

    public LocalDateTime getDayTime() {
        return dayTime;
    }

    public void setDayTime(LocalDateTime dayTime) {
        this.dayTime = dayTime;
    }

    public Fee getFee() {
        return fee;
    }

    public void setFee(Fee fee) {
        this.fee = fee;
    }

    public EventGender getGender() {
        return gender;
    }

    public void setGender(EventGender gender) {
        this.gender = gender;
    }

    public List<Heat> getHeats() {
        return heats;
    }

    public void setHeats(List<Heat> heats) {
        this.heats = heats;
    }

    public int getMaxEntries() {
        return maxEntries;
    }

    public void setMaxEntries(int maxEntries) {
        this.maxEntries = maxEntries;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Event getPreviousEvent() {
        return previousEvent;
    }

    public void setPreviousEvent(Event previousEvent) {
        this.previousEvent = previousEvent;
    }

    public EventRound getEventRound() {
        return eventRound;
    }

    public void setEventRound(EventRound eventRound) {
        this.eventRound = eventRound;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public SwimStyle getSwimStyle() {
        return swimStyle;
    }

    public void setSwimStyle(SwimStyle swimStyle) {
        this.swimStyle = swimStyle;
    }

    public List<TimeStandardRef> getTimeStandardRefs() {
        return timeStandardRefs;
    }

    public void setTimeStandardRefs(List<TimeStandardRef> timeStandardRefs) {
        this.timeStandardRefs = timeStandardRefs;
    }

    public Timing getTiming() {
        return timing;
    }

    public void setTiming(Timing timing) {
        this.timing = timing;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }
}
