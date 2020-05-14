package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.CurrencyCode;
import nl.ramonpeek.models.enums.FeeType;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public abstract class Fee {

    private CurrencyCode currency;
    private FeeType type;
    private double value;

    public Fee() {
    }

    public Fee(CurrencyCode currency, FeeType type, double value) {
        this.currency = currency;
        this.type = type;
        this.value = value;
    }

    public CurrencyCode getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyCode currency) {
        this.currency = currency;
    }

    public FeeType getType() {
        return type;
    }

    public void setType(FeeType type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
