package kiteboarding.controller;

import kiteboarding.helper.HibernateUtil;
import kiteboarding.helper.KiteboardingException;
import kiteboarding.model.Kitecourse;
import java.util.List;


public class ProcessingKitecourse extends Processing<Kitecourse> {
    
    public ProcessingKitecourse(){
        super();
    }
    
    public List<Kitecourse> getListed(){
        
        return HibernateUtil.getSession().createQuery("from Kitecourse").list();
    }
    
    public Kitecourse save(Kitecourse c) throws KiteboardingException{
        
        checking(c);
        
        return dao.save(c);
    }
    
    public void delete(Kitecourse c) throws KiteboardingException{
        
        if(c.getKitegroups().isEmpty()){
            throw new KiteboardingException("Kitecourse has kitegroups and can not be deleted");
        }
        
        dao.delete(c);
    }
    
    private void checking(Kitecourse c) throws KiteboardingException{
        if(c.getKitecoursetype() == null){
            throw new KiteboardingException ("Kitecoursetype is null. Entry is mandatory");
        }
        if(c.getKitecoursetype().trim().length() == 0){
            throw new KiteboardingException ("Kitecoursetype is empty. Entry is manadatory");
        }
        if(c.getDuration()<0 || c.getDuration()>15){
            throw new KiteboardingException ("Enter valid duration, please: ");
        }
        if(c.getPrice() == 0){
            throw new KiteboardingException ("Enter valid price, please: ");
        }
    }    
}
