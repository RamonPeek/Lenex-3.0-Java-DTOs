package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.AgeDateType;
import java.time.LocalDateTime;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public class AgeDate {

    private AgeDateType type;
    private LocalDateTime value;

    public AgeDate() {
    }

    public AgeDate(AgeDateType type, LocalDateTime value) {
        this.type = type;
        this.value = value;
    }

    public AgeDateType getType() {
        return type;
    }

    public void setType(AgeDateType type) {
        this.type = type;
    }

    public LocalDateTime getValue() {
        return value;
    }

    public void setValue(LocalDateTime value) {
        this.value = value;
    }
}
