package kiteboarding.model;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import javax.persistence.Entity;


@MappedSuperclass
public abstract class Person extends ClassEntity {


     private String firstname;
     private String lastname;
     private String email;  
     private String iban;
//
//    public Person() {
//        super();
//    }
//     
//    public Person(String firstname, String lastname, String email,Integer id, String iban ) {
//         super(id);
//         this.firstname = firstname;
//         this.lastname = lastname;
//         this.email = email;
//         this.iban = iban;
//         
//     }

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

    @Override
    public String toString() {
        return getFirstname() + " " + getLastname();
    }
    
   
}


