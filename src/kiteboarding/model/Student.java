package kiteboarding.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.ArrayList;


@Entity
@Table
public class Student extends Person implements Serializable {           
    
    private String contractnumber;        
    
//    @ManyToMany(mappedBy = "students")
//    private List<Kitegroup> Kitegroups = new ArrayList<>();
//
//    public List<Kitegroup> getKitegroups() {
//        return Kitegroups;
//    }
//
//    public void setKitegroups(List<Kitegroup> Kitegroups) {
//        this.Kitegroups = Kitegroups;
//    }
//   
    public String getContractnumber() {
        return contractnumber;
    }

    public void setContractnumber(String contractnumber) {
        this.contractnumber = contractnumber;
    }
               


}


