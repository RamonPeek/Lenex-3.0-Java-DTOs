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
}
