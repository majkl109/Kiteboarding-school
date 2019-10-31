package kiteboarding.controller;

import kiteboarding.model.Kitegroup;
import kiteboarding.helper.KiteboardingException;
import kiteboarding.helper.HibernateUtil;
import kiteboarding.helper.ProcessingInterface;
import java.util.List;



public class ProcessingKitegroup extends Processing<Kitegroup> implements ProcessingInterface<Kitegroup>{

    @Override
    public List<Kitegroup> getListed(){
        return HibernateUtil.getSession().createQuery("from Kitegroup").list();
    }
    
    @Override
    public void checking(Kitegroup kg) throws KiteboardingException {
        if(kg.getKitecourse()== null){
           throw new KiteboardingException("Enter valid kitecourse");
        }
        if(kg.getTeacher()== null){
           throw new KiteboardingException("Enter valid teacher");
        }
        if(kg.getNumberOfStudents()== 0){
           throw new KiteboardingException("Enter valid number of students");        
        }
    }
    @Override
    public Kitegroup save(Kitegroup kg) throws KiteboardingException{
        checking(kg);

        return dao.save(kg);
    }
    @Override
    public void delete(Kitegroup kg) throws KiteboardingException{ 
        checking(kg);
        dao.delete(kg);
    }
}
   

