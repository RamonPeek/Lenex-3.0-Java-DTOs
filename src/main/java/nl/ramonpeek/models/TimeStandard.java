package nl.ramonpeek.models;

import jdk.jfr.Timespan;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public class TimeStandard {
    private SwimStyle swimStyle;
    private Timespan swimTime;

    public TimeStandard() {
    }

    public TimeStandard(SwimStyle swimStyle, Timespan swimTime) {
        this.swimStyle = swimStyle;
        this.swimTime = swimTime;
    }

    public SwimStyle getSwimStyle() {
        return swimStyle;
    }

    public void setSwimStyle(SwimStyle swimStyle) {
        this.swimStyle = swimStyle;
    }

    public Timespan getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(Timespan swimTime) {
        this.swimTime = swimTime;
    }
}
