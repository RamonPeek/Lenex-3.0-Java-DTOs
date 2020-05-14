package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.CalculateType;
import nl.ramonpeek.models.enums.EventGender;
import nl.ramonpeek.models.enums.HandicapType;

import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public abstract class AgeGroup {

    private int id;
    private String name;
    private int ageMax;
    private int ageMin;
    private EventGender gender;
    private CalculateType calculateType;
    private HandicapType handicapType;
    private int levelMin;
    private int levelMax;
    private String levels;
    private List<Ranking> rankings;

    public AgeGroup() {
    }

    public AgeGroup(int id, String name, int ageMax, int ageMin, EventGender gender,
                    CalculateType calculateType, HandicapType handicapType, int levelMin,
                    int levelMax, String levels, List<Ranking> rankings) {
        this.id = id;
        this.name = name;
        this.ageMax = ageMax;
        this.ageMin = ageMin;
        this.gender = gender;
        this.calculateType = calculateType;
        this.handicapType = handicapType;
        this.levelMin = levelMin;
        this.levelMax = levelMax;
        this.levels = levels;
        this.rankings = rankings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public EventGender getGender() {
        return gender;
    }

    public void setGender(EventGender gender) {
        this.gender = gender;
    }

    public CalculateType getCalculateType() {
        return calculateType;
    }

    public void setCalculateType(CalculateType calculateType) {
        this.calculateType = calculateType;
    }

    public HandicapType getHandicapType() {
        return handicapType;
    }

    public void setHandicapType(HandicapType handicapType) {
        this.handicapType = handicapType;
    }

    public int getLevelMin() {
        return levelMin;
    }

    public void setLevelMin(int levelMin) {
        this.levelMin = levelMin;
    }

    public int getLevelMax() {
        return levelMax;
    }

    public void setLevelMax(int levelMax) {
        this.levelMax = levelMax;
    }

    public String getLevels() {
        return levels;
    }

    public void setLevels(String levels) {
        this.levels = levels;
    }

    public List<Ranking> getRankings() {
        return rankings;
    }

    public void setRankings(List<Ranking> rankings) {
        this.rankings = rankings;
    }
}
