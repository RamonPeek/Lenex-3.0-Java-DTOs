package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.HandicapType;
import nl.ramonpeek.models.enums.RecordGender;

import java.util.List;

public class Relay {

    private int ageMax;
    private int ageMin;
    private int ageTotalMax;
    private int ageTotalMin;
    private Club club;
    private List<Entry> entries;
    private RecordGender gender;
    private HandicapType handicap;
    private String name;
    private int number;
    private List<RelayPosition> relayPositions;
    private List<Result> results;

    public Relay() {    }

    public Relay(int ageMax, int ageMin, int ageTotalMax, int ageTotalMin, Club club, List<Entry> entries, RecordGender gender, HandicapType handicap, String name, int number, List<RelayPosition> relayPositions, List<Result> results) {
        this.ageMax = ageMax;
        this.ageMin = ageMin;
        this.ageTotalMax = ageTotalMax;
        this.ageTotalMin = ageTotalMin;
        this.club = club;
        this.entries = entries;
        this.gender = gender;
        this.handicap = handicap;
        this.name = name;
        this.number = number;
        this.relayPositions = relayPositions;
        this.results = results;
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

    public int getAgeTotalMax() {
        return ageTotalMax;
    }

    public void setAgeTotalMax(int ageTotalMax) {
        this.ageTotalMax = ageTotalMax;
    }

    public int getAgeTotalMin() {
        return ageTotalMin;
    }

    public void setAgeTotalMin(int ageTotalMin) {
        this.ageTotalMin = ageTotalMin;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public RecordGender getGender() {
        return gender;
    }

    public void setGender(RecordGender gender) {
        this.gender = gender;
    }

    public HandicapType getHandicap() {
        return handicap;
    }

    public void setHandicap(HandicapType handicap) {
        this.handicap = handicap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<RelayPosition> getRelayPositions() {
        return relayPositions;
    }

    public void setRelayPositions(List<RelayPosition> relayPositions) {
        this.relayPositions = relayPositions;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
