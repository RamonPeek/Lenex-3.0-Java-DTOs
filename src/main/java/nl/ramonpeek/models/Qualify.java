package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.ConversionType;

import java.time.LocalDateTime;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public class Qualify {

    private ConversionType conversion;
    private LocalDateTime from;
    private LocalDateTime until;
    private int percent;

    public Qualify() {
    }

    public Qualify(ConversionType conversion, LocalDateTime from, LocalDateTime until, int percent) {
        this.conversion = conversion;
        this.from = from;
        this.until = until;
        this.percent = percent;
    }

    public ConversionType getConversion() {
        return conversion;
    }

    public void setConversion(ConversionType conversion) {
        this.conversion = conversion;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public void setFrom(LocalDateTime from) {
        this.from = from;
    }

    public LocalDateTime getUntil() {
        return until;
    }

    public void setUntil(LocalDateTime until) {
        this.until = until;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }
}
