package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.NationCode;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public abstract class Facility {

    private String city;
    private NationCode nation;
    private String name;
    private String state;
    private String street;
    private String street2;
    private String zip;

    public Facility() {
    }

    public Facility(String city, NationCode nation, String name, String state, String street, String street2, String zip) {
        this.city = city;
        this.nation = nation;
        this.name = name;
        this.state = state;
        this.street = street;
        this.street2 = street2;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public NationCode getNation() {
        return nation;
    }

    public void setNation(NationCode nation) {
        this.nation = nation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
