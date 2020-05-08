package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.HeatFinalType;
import nl.ramonpeek.models.enums.HeatStatus;

import java.time.LocalDateTime;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public class Heat {
    private AgeGroup ageGroup;
    private LocalDateTime dayTime;
    private HeatFinalType heatFinalType;
    private int id;
    private int number;
    private int order;
    private HeatStatus heatStatus;

    public Heat() {
    }

    public Heat(AgeGroup ageGroup, LocalDateTime dayTime, HeatFinalType heatFinalType,
                int id, int number, int order, HeatStatus heatStatus) {
        this.ageGroup = ageGroup;
        this.dayTime = dayTime;
        this.heatFinalType = heatFinalType;
        this.id = id;
        this.number = number;
        this.order = order;
        this.heatStatus = heatStatus;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public LocalDateTime getDayTime() {
        return dayTime;
    }

    public void setDayTime(LocalDateTime dayTime) {
        this.dayTime = dayTime;
    }

    public HeatFinalType getHeatFinalType() {
        return heatFinalType;
    }

    public void setHeatFinalType(HeatFinalType heatFinalType) {
        this.heatFinalType = heatFinalType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public HeatStatus getHeatStatus() {
        return heatStatus;
    }

    public void setHeatStatus(HeatStatus heatStatus) {
        this.heatStatus = heatStatus;
    }
}
