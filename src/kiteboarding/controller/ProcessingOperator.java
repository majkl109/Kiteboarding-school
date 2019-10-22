package kiteboarding.controller;

import kiteboarding.model.Operator;
import kiteboarding.helper.BCrypt;
import kiteboarding.helper.KiteboardingException;
import kiteboarding.helper.HibernateUtil;
import kiteboarding.helper.ProcessingInterface;
import java.util.List;


public class ProcessingOperator extends Processing<Operator> implements ProcessingInterface<Operator>{
    
  public Operator authorising(String email, String password){
      Operator o = (Operator)HibernateUtil.getSession().createQuery(" from Operator a "
              + " where a.email=:email ").
              setString("email", email)
              .uniqueResult(); 
      if(o==null){
          return null;
      }    
      
      if(BCrypt.checkpw(password, o.getPassword())){
          return o;
      }        
      
      return null;
  }    
    
  @Override
  public List<Operator>getListed(){
      return HibernateUtil.getSession().createQuery(" from Operator ").list();
  }
  
  @Override
  public void checking(Operator t) throws KiteboardingException {
      
  } 
  
  @Override
  public Operator save(Operator t) throws KiteboardingException {
      return dao.save(t);
  }
  
  @Override
  public void delete(Operator t) throws KiteboardingException {
      
  }
}
