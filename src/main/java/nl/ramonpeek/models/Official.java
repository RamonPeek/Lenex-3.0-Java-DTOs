package nl.ramonpeek.models;

import nl.ramonpeek.models.enums.EventGender;
import nl.ramonpeek.models.enums.Nation;

public class Official {

    private int id;
    private Contact contact;
    private String firstname;
    private EventGender gender;
    private String grade;
    private String lastname;
    private String license;
    private String namePrefix;
    private Nation nation;
    private String passport;

    public Official() { }

    public Official(int id, Contact contact, String firstname, EventGender gender, String grade, String lastname, String license, String namePrefix, Nation nation, String passport) {
        this.id = id;
        this.contact = contact;
        this.firstname = firstname;
        this.gender = gender;
        this.grade = grade;
        this.lastname = lastname;
        this.license = license;
        this.namePrefix = namePrefix;
        this.nation = nation;
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public EventGender getGender() {
        return gender;
    }

    public void setGender(EventGender gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
