package kiteboarding.model;

import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
    

@MappedSuperclass
public abstract class ClassEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id = 0;
    
    public ClassEntity(){
        
    }
    
    public ClassEntity(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ClassEntity{" + "id=" + id + '}';
    }
    
     
}

    

