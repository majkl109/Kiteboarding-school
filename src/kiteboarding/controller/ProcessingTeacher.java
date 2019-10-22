package kiteboarding.controller;

import java.util.Arrays;
import java.util.List;
import kiteboarding.helper.HibernateUtil;
import kiteboarding.helper.KiteboardingException;
import kiteboarding.helper.ProcessingInterface;
import kiteboarding.model.Teacher;
import org.hibernate.Query;

public class ProcessingTeacher extends ProcessingPerson<Teacher> implements ProcessingInterface<Teacher>{
    
        public ProcessingTeacher(){
        super();
    }
    
    public List<Teacher> getListed(){
        return HibernateUtil.getSession().createQuery("from Teacher").list();
    }
    public List<Teacher> getListed(String condition,boolean isSelected){

        Query query = HibernateUtil.getSession().createQuery("from Teacher a"
               + " where concat(a.firstName,' ',a.lastName) like :condition")
               .setString("condition", "%" + condition + "%");
        if(isSelected){
            query.setMaxResults(50);
        }
        
        return query.list();
    }
    public Teacher save(Teacher t) throws KiteboardingException{
        
        super.checking(t);
        checking(t);
        
        return dao.save(t);
    }
    
    public void delete(Teacher t) throws KiteboardingException{
        
        if(!t.getKitegroups().isEmpty()){
            throw new KiteboardingException(
             "Cannot be erased because teacher teaches Kitegoups: " + 
                     Arrays.toString(t.getKitegroups().toArray())
            );
        }
        dao.delete(t);
    }
    public void checking(Teacher t) throws KiteboardingException{
        
    }
    
    public List<Teacher> save(List<Teacher> teachers) throws KiteboardingException{
        
        for(Teacher t : teachers) {
            super.checking(t);
            checking(t);
        }
        return dao.save(teachers);
    }
    
}


