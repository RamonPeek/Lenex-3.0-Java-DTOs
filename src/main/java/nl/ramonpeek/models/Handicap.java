package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.HandicapType;

/**
 * Created on 08/05/2020.
 *
 * @author Marc
 */
public abstract class Handicap {

    private HandicapType breast;
    private HandicapType free;
    private HandicapType medley;
    private String exception;

    public Handicap() {    }

    public Handicap(HandicapType breast, HandicapType free, HandicapType medley, String exception) {
        this.breast = breast;
        this.free = free;
        this.medley = medley;
        this.exception = exception;
    }

    public HandicapType getBreast() {
        return breast;
    }

    public void setBreast(HandicapType breast) {
        this.breast = breast;
    }

    public HandicapType getFree() {
        return free;
    }

    public void setFree(HandicapType free) {
        this.free = free;
    }

    public HandicapType getMedley() {
        return medley;
    }

    public void setMedley(HandicapType medley) {
        this.medley = medley;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
