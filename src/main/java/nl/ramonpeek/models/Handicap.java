package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.HandicapType;

public class Handicap {

    private HandicapType breast;
    private HandicapType free;
    private HandicapType medley;
    private String exeption;

    public Handicap() {    }

    public Handicap(HandicapType breast, HandicapType free, HandicapType medley, String exeption) {
        this.breast = breast;
        this.free = free;
        this.medley = medley;
        this.exeption = exeption;
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

    public String getExeption() {
        return exeption;
    }

    public void setExeption(String exeption) {
        this.exeption = exeption;
    }
}
