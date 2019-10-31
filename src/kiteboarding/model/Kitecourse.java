package kiteboarding.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Kitecourse extends ClassEntity implements Serializable {
    

    private String kitecoursetype;
    private int duration;
    private int price;

    
    
     
    @OneToMany(mappedBy = "kitecourse")
    private List<Kitegroup> kitegroups = new ArrayList<>();
     
    public String getKitecoursetype() {
        return kitecoursetype;
    }

    public void setKitecoursetype(String kitecoursetype) {
        this.kitecoursetype = kitecoursetype;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Kitegroup> getKitegroups() {
        return kitegroups;
    }

    public void setKitegroups(List<Kitegroup> kitegroups) {
        this.kitegroups = kitegroups;
    }

    @Override
    public String toString() {
        return "kitecoursetype=" + kitecoursetype + ", duration=" + duration + ", price=" + price ;
    }

     
     
}

