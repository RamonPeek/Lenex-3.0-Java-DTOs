package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.CourseCode;
import nl.ramonpeek.models.enums.HandicapType;
import nl.ramonpeek.models.enums.RecordGender;
import nl.ramonpeek.models.enums.RecordType;

import java.time.LocalDateTime;
import java.util.List;

public class RecordList {

    private AgeGroup ageGroup;
    private CourseCode course;
    private RecordGender gender;
    private HandicapType handicap;
    private String name;
    private String nation;
    private int order;
    private List<Record> records;
    private String region;
    private LocalDateTime updated;
    private RecordType type;

    public RecordList() {    }

    public RecordList(AgeGroup ageGroup, CourseCode course, RecordGender gender, HandicapType handicap, String name, String nation, int order, List<Record> records, String region, LocalDateTime updated, RecordType type) {
        this.ageGroup = ageGroup;
        this.course = course;
        this.gender = gender;
        this.handicap = handicap;
        this.name = name;
        this.nation = nation;
        this.order = order;
        this.records = records;
        this.region = region;
        this.updated = updated;
        this.type = type;
    }

    public AgeGroup getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(AgeGroup ageGroup) {
        this.ageGroup = ageGroup;
    }

    public CourseCode getCourse() {
        return course;
    }

    public void setCourse(CourseCode course) {
        this.course = course;
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

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }


    public RecordType getType() {
        return type;
    }

    public void setType(RecordType type) {
        this.type = type;
    }
}
