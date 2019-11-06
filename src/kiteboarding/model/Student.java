package kiteboarding.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.ArrayList;


@Entity
@Table
public class Student extends Person implements Serializable {           

  
    
    private String contractnumber;        
    
    @OneToMany(mappedBy = "student")
    private List<Kitegroup> kitegroups = new ArrayList<>();

    public List<Kitegroup> getKitegroups() {
        return kitegroups;
    }

    public void setKitegroups(List<Kitegroup> kitegroups) {
        this.kitegroups = kitegroups;
    }
    
    
    public String getContractnumber() {
        return contractnumber;
    }

    public void setContractnumber(String contractnumber) {
        this.contractnumber = contractnumber;
    }
               
    @Override
    public String toString() {
        return getFirstname() + " " + getLastname();
    }

}


