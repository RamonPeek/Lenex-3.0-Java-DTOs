package nl.ramonpeek.models;

import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public abstract class Lenex {

    private Constructor constructor;
    private List<Meet> meets;
    private List<RecordList> recordLists;
    private List<TimeStandardList> timeStandardLists;
    private String version;

    public Lenex() {
    }

    public Lenex(Constructor constructor, List<Meet> meets, List<RecordList> recordLists, List<TimeStandardList> timeStandardLists, String version) {
        this.constructor = constructor;
        this.meets = meets;
        this.recordLists = recordLists;
        this.timeStandardLists = timeStandardLists;
        this.version = version;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }

    public List<Meet> getMeets() {
        return meets;
    }

    public void setMeets(List<Meet> meets) {
        this.meets = meets;
    }

    public List<RecordList> getRecordLists() {
        return recordLists;
    }

    public void setRecordLists(List<RecordList> recordLists) {
        this.recordLists = recordLists;
    }

    public List<TimeStandardList> getTimeStandardLists() {
        return timeStandardLists;
    }

    public void setTimeStandardLists(List<TimeStandardList> timeStandardLists) {
        this.timeStandardLists = timeStandardLists;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
