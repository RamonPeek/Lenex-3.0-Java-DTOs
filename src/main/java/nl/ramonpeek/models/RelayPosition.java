package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.RelayStatus;

/**
 * Created on 08/05/2020.
 *
 * @author Marc
 */
public abstract class RelayPosition {

    private Athlete athlete;
    private MeetInfo meetInfo;
    private int number;
    private String reactionTime;
    private RelayStatus status;

    public RelayPosition() {    }

    public RelayPosition(Athlete athlete, MeetInfo meetInfo, int number, String reactionTime, RelayStatus status) {
        this.athlete = athlete;
        this.meetInfo = meetInfo;
        this.number = number;
        this.reactionTime = reactionTime;
        this.status = status;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public void setAthlete(Athlete athlete) {
        this.athlete = athlete;
    }

    public MeetInfo getMeetInfo() {
        return meetInfo;
    }

    public void setMeetInfo(MeetInfo meetInfo) {
        this.meetInfo = meetInfo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(String reactionTime) {
        this.reactionTime = reactionTime;
    }

    public RelayStatus getStatus() {
        return status;
    }

    public void setStatus(RelayStatus status) {
        this.status = status;
    }
}
