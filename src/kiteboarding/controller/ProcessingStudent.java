package kiteboarding.controller;

import kiteboarding.model.Student;
import kiteboarding.helper.KiteboardingException;
import kiteboarding.helper.HibernateUtil;
import kiteboarding.helper.ProcessingInterface;
import java.util.List;
import org.hibernate.Query;




public class ProcessingStudent extends ProcessingPerson<Student> implements ProcessingInterface<Student> {
    
    public ProcessingStudent(){
        super();
    }    
    
    public List<Student> getListed(){
        return HibernateUtil.getSession().createQuery("from Student").list();
    }
    
    public List<Student> getListed(String condition,boolean isSelected){
        
        Query query = HibernateUtil.getSession().createQuery("from Student a"
                + " where concat(a.firstName,' ',a.lastName) like :condition")
                .setString("condition","%" + condition + "%");
        if(isSelected){
            query.setMaxResults(50);
        }
        return query.list();
    }
    
    public Student save(Student s) throws KiteboardingException{
        
        super.checking(s);
        checking(s);
        
        return dao.save(s);
    }
    
    public List<Student> save( List<Student> students) throws KiteboardingException{
    
        for(Student s : students){
            super.checking(s);
            checking(s);
        }
        return dao.save(students);
    }    
        
        
    public void delete(Student s) throws KiteboardingException{
        
        dao.delete(s);   
    }
     public void checking(Student s) throws KiteboardingException{
        
    }
   
}
