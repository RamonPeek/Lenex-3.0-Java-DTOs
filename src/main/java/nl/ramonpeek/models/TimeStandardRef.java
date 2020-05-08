package nl.ramonpeek.models;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public class TimeStandardRef {
    private TimeStandardList timeStandardList;
    private Fee fee;
    private String marker;

    public TimeStandardRef() {
    }

    public TimeStandardRef(TimeStandardList timeStandardList, Fee fee, String marker) {
        this.timeStandardList = timeStandardList;
        this.fee = fee;
        this.marker = marker;
    }

    public TimeStandardList getTimeStandardList() {
        return timeStandardList;
    }

    public void setTimeStandardList(TimeStandardList timeStandardList) {
        this.timeStandardList = timeStandardList;
    }

    public Fee getFee() {
        return fee;
    }

    public void setFee(Fee fee) {
        this.fee = fee;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
}
