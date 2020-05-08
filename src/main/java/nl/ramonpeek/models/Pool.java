package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.PoolType;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public class Pool {

    private int laneMax;
    private int laneMin;
    private int temperature;
    private PoolType type;

    public Pool() {
    }

    public Pool(int laneMax, int laneMin, int temperature, PoolType type) {
        this.laneMax = laneMax;
        this.laneMin = laneMin;
        this.temperature = temperature;
        this.type = type;
    }

    public int getLaneMax() {
        return laneMax;
    }

    public void setLaneMax(int laneMax) {
        this.laneMax = laneMax;
    }

    public int getLaneMin() {
        return laneMin;
    }

    public void setLaneMin(int laneMin) {
        this.laneMin = laneMin;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public PoolType getType() {
        return type;
    }

    public void setType(PoolType type) {
        this.type = type;
    }
}
