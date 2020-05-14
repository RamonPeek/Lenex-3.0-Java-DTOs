package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.ClubType;
import nl.ramonpeek.models.enums.Nation;

import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public abstract class Club {

    private List<Athlete> athletes;
    private String code;
    private Contact contact;
    private String name;
    private String nameEn;
    private Nation nation;
    private int number;
    private List<Official> officials;
    private String region;
    private String shortName;
    private String shortNameEn;
    private int swrid;
    private ClubType type;
    private List<Relay> relays;

    public Club() {
    }

    public Club(List<Athlete> athletes, String code, Contact contact, String name, String nameEn, Nation nation, int number, List<Official> officials, String region, String shortName, String shortNameEn, int swrid, ClubType type, List<Relay> relays) {
        this.athletes = athletes;
        this.code = code;
        this.contact = contact;
        this.name = name;
        this.nameEn = nameEn;
        this.nation = nation;
        this.number = number;
        this.officials = officials;
        this.region = region;
        this.shortName = shortName;
        this.shortNameEn = shortNameEn;
        this.swrid = swrid;
        this.type = type;
        this.relays = relays;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Official> getOfficials() {
        return officials;
    }

    public void setOfficials(List<Official> officials) {
        this.officials = officials;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getShortNameEn() {
        return shortNameEn;
    }

    public void setShortNameEn(String shortNameEn) {
        this.shortNameEn = shortNameEn;
    }

    public int getSwrid() {
        return swrid;
    }

    public void setSwrid(int swrid) {
        this.swrid = swrid;
    }

    public ClubType getType() {
        return type;
    }

    public void setType(ClubType type) {
        this.type = type;
    }

    public List<Relay> getRelays() {
        return relays;
    }

    public void setRelays(List<Relay> relays) {
        this.relays = relays;
    }
}
