package nl.ramonpeek.models;

import jdk.jfr.Timespan;

import java.time.Duration;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public class TimeStandard {
    private SwimStyle swimStyle;
    private Duration swimTime;

    public TimeStandard() {
    }

    public TimeStandard(SwimStyle swimStyle, Duration swimTime) {
        this.swimStyle = swimStyle;
        this.swimTime = swimTime;
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
}
