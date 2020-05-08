package nl.ramonpeek.models;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public class Contact {

    private String city;
    private String country;
    private String email;
    private String fax;
    private String internet;
    private String name;
    private String mobile;
    private String phone;
    private String state;
    private String street;
    private String street2;
    private String zip;

    public Contact() {
    }

    public Contact(String city, String country, String email, String fax, String internet, String name, String mobile, String phone, String state, String street, String street2, String zip) {
        this.city = city;
        this.country = country;
        this.email = email;
        this.fax = fax;
        this.internet = internet;
        this.name = name;
        this.mobile = mobile;
        this.phone = phone;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
