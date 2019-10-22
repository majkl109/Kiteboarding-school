package kiteboarding.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
    

@MappedSuperclass
public abstract class ClassEntity {
    
    @Id
    @GeneratedValue
    private int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

   
    
}

    

