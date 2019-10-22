package kiteboarding.model;

import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class Person  extends ClassEntity {


     private String firstname;
     private String lastname;
     private String email;
     
     @ManyToOne
     private Kitecourse kitecourse;
     private String iban;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Kitecourse getKitecourse() {
        return kitecourse;
    }

    public void setKitecourse(Kitecourse kitecourse) {
        this.kitecourse = kitecourse;
    }

     




}


