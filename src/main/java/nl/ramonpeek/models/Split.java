package nl.ramonpeek.models;

import jdk.jfr.Timespan;

import java.time.Duration;

/**
 * Created on 08/05/2020.
 *
 * @author Marc
 */
public class Split {

    private int distance;
    private Duration swimTime;

    public Split() {
    }

    public Split(int distance, Duration swimTime) {
        this.distance = distance;
        this.swimTime = swimTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Duration getSwimTime() {
        return swimTime;
    }

    public void setSwimTime(Duration swimTime) {
        this.swimTime = swimTime;
    }
}
