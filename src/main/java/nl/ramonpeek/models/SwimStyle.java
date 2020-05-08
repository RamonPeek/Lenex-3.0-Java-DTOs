package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.Stroke;
import nl.ramonpeek.models.enums.Technique;

/**
 * Created on 08/05/2020.
 *
 * @author Vincent
 */
public class SwimStyle {
    private int id;
    private String code;
    private int distance;
    private String name;
    private int relayCount;
    private Stroke stroke;
    private Technique technique;

    public SwimStyle() {
    }

    public SwimStyle(int id, String code, int distance, String name, int relayCount,
                     Stroke stroke, Technique technique) {
        this.id = id;
        this.code = code;
        this.distance = distance;
        this.name = name;
        this.relayCount = relayCount;
        this.stroke = stroke;
        this.technique = technique;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelayCount() {
        return relayCount;
    }

    public void setRelayCount(int relayCount) {
        this.relayCount = relayCount;
    }

    public Stroke getStroke() {
        return stroke;
    }

    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    public Technique getTechnique() {
        return technique;
    }

    public void setTechnique(Technique technique) {
        this.technique = technique;
    }
}
