package nl.ramonpeek.models;

import jdk.jfr.Timespan;
import nl.ramonpeek.models.enums.ResultStatus;

import java.util.List;

public class Result {

    private int id;
    private String comment;
    private Event event;
    private Heat heat;
    private int lane;
    private int points;
    private String reactionTime;
    private List<RelayPosition> relayPositions;
    private ResultStatus status;
    private List<Split> splits;
    private Timespan swimTime;

    public Result() {
    }

    public Result(int id, String comment, Event event, Heat heat, int lane, int points, String reactionTime, List<RelayPosition> relayPositions, ResultStatus status, List<Split> splits, Timespan swimTime) {
        this.id = id;
        this.comment = comment;
        this.event = event;
        this.heat = heat;
        this.lane = lane;
        this.points = points;
        this.reactionTime = reactionTime;
        this.relayPositions = relayPositions;
        this.status = status;
        this.splits = splits;
        this.swimTime = swimTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(String reactionTime) {
        this.reactionTime = reactionTime;
    }

    public List<RelayPosition> getRelayPositions() {
        return relayPositions;
    }

    public void setRelayPositions(List<RelayPosition> relayPositions) {
        this.relayPositions = relayPositions;
    }

    public ResultStatus getStatus() {
        return status;
    }

    public void setStatus(ResultStatus status) {
        this.status = status;
    }

    public List<Split> getSplits() {
        return splits;
    }

    public void setSplits(List<Split> splits) {
        this.splits = splits;
    }

    public Timespan getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(Timespan swimTime) {
        this.swimTime = swimTime;
    }

}
