package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.Gender;
import nl.ramonpeek.models.enums.NationCode;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created on 08/05/2020.
 *
 * @author Marc
 */
public class Athlete {

    private int id;
    private LocalDateTime birthDate;
    private Club club;
    private List<Entry> entrys;
    private String firstname;
    private String firstnameEn;
    private String lastname;
    private String lastnameEn;
    private Gender gender;
    private Handicap handicap;
    private String level;
    private String license;
    private String nameprefix;
    private NationCode nation;
    private String password;
    private List<Result> results;
    private int swrid;

    public Athlete() {}

    public Athlete(int id, LocalDateTime birthDate, Club club, List<Entry> entrys, String firstname, String firstnameEn, String lastname, String lastnameEn, Gender gender, Handicap handicap, String level, String license, String nameprefix, NationCode nation, String password, List<Result> results, int swrid) {
        this.id = id;
        this.birthDate = birthDate;
        this.club = club;
        this.entrys = entrys;
        this.firstname = firstname;
        this.firstnameEn = firstnameEn;
        this.lastname = lastname;
        this.lastnameEn = lastnameEn;
        this.gender = gender;
        this.handicap = handicap;
        this.level = level;
        this.license = license;
        this.nameprefix = nameprefix;
        this.nation = nation;
        this.password = password;
        this.results = results;
        this.swrid = swrid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public List<Entry> getEntrys() {
        return entrys;
    }

    public void setEntrys(List<Entry> entrys) {
        this.entrys = entrys;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstnameEn() {
        return firstnameEn;
    }

    public void setFirstnameEn(String firstnameEn) {
        this.firstnameEn = firstnameEn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastnameEn() {
        return lastnameEn;
    }

    public void setLastnameEn(String lastnameEn) {
        this.lastnameEn = lastnameEn;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Handicap getHandicap() {
        return handicap;
    }

    public void setHandicap(Handicap handicap) {
        this.handicap = handicap;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getNameprefix() {
        return nameprefix;
    }

    public void setNameprefix(String nameprefix) {
        this.nameprefix = nameprefix;
    }

    public NationCode getNation() {
        return nation;
    }

    public void setNation(NationCode nation) {
        this.nation = nation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public int getSwrid() {
        return swrid;
    }

    public void setSwrid(int swrid) {
        this.swrid = swrid;
    }
}

