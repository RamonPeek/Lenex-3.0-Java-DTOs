package nl.ramonpeek.models;

import jdk.jfr.Timespan;

public class Split {

    private int distance;
    private Timespan swimTime;

    public Split() {
    }

    public Split(int distance, Timespan swimTime) {
        this.distance = distance;
        this.swimTime = swimTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Timespan getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(Timespan swimTime) {
        this.swimTime = swimTime;
    }
}
