package kiteboarding.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
    

@MappedSuperclass
public abstract class ClassEntity {
    
    @Id
    @GeneratedValue
    private int id ;
    
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
    

   
    
}

    

