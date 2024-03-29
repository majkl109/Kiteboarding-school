package kiteboarding.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity 
@Table
public class Teacher extends Person implements Serializable {
   
     private int contractduration;
     
@OneToMany(mappedBy = "teacher")
    private List<Kitegroup> kitegroups = new ArrayList<>(); 
    
  
    public List<Kitegroup> getKitegroups() {
        return kitegroups;
    }

    public void setKitegroups(List<Kitegroup> kitegroups) {
        this.kitegroups = kitegroups;
    }
         
    public int getContractduration() {
        return contractduration;
    }

    public void setContractduration(int contractduration) {
        this.contractduration = contractduration;
    }
     
    @Override
    public String toString() {
        return getFirstname() + " " + getLastname();
    }
}


