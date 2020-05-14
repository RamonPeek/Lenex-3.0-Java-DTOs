package nl.ramonpeek.models;

/**
 * Created on 08/05/2020.
 *
 * @author Ramon
 */
public abstract class Constructor {

    private Contact contact;
    private String name;
    private String registration;
    private String version;

    public Constructor() {
    }

    public Constructor(Contact contact, String name, String registration, String version) {
        this.contact = contact;
        this.name = name;
        this.registration = registration;
        this.version = version;
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

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
