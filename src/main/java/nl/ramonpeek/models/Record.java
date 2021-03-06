package nl.ramonpeek.models;

import java.time.Duration;
import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Marc
 */
public abstract class Record {

    private Athlete athlete;
    private String comment;
    private MeetInfo meetInfo;
    private Relay relay;
    private List<Split> splits;
    private SwimStyle swimStyle;
    private Duration swimTime;
    private String status;

    public Record() {    }

    public Record(Athlete athlete, String comment, MeetInfo meetInfo, Relay relay, List<Split> splits, SwimStyle swimStyle, Duration swimTime, String status) {
        this.athlete = athlete;
        this.comment = comment;
        this.meetInfo = meetInfo;
        this.relay = relay;
        this.splits = splits;
        this.swimStyle = swimStyle;
        this.swimTime = swimTime;
        this.status = status;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public MeetInfo getMeetInfo() {
        return meetInfo;
    }

    public void setMeetInfo(MeetInfo meetInfo) {
        this.meetInfo = meetInfo;
    }

    public Relay getRelay() {
        return relay;
    }

    public void setRelay(Relay relay) {
        this.relay = relay;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public SwimStyle getSwimStyle() {
        return swimStyle;
    }

    public void setSwimStyle(SwimStyle swimStyle) {
        this.swimStyle = swimStyle;
    }

    public Duration getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(Duration swimTime) {
        this.swimTime = swimTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
