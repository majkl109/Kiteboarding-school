package kiteboarding.controller;

import kiteboarding.model.Operators;
import kiteboarding.helper.BCrypt;
import kiteboarding.helper.KiteboardingException;
import kiteboarding.helper.HibernateUtil;
import kiteboarding.helper.ProcessingInterface;
import java.util.List;


public class ProcessingOperators extends Processing<Operators> implements ProcessingInterface<Operators>{
    
  public Operators authorising(String email, String password){
      System.out.println(email);
      System.out.println(password);
     
      Operators o = (Operators)HibernateUtil.getSession().createQuery(" from Operators o "
              + " where o.email=:email AND o.password=:password ")
              .setString("email", email)
              .setString("password", password)
              .uniqueResult(); 
      return o;
      
    //  if(BCrypt.checkpw(password, o.getPassword())){
  //        return o;
//      }        
      
  }    
    
  @Override
  public List<Operators>getListed(){
      return HibernateUtil.getSession().createQuery("from Operators").list();
  }
  
  @Override
  public void checking(Operators t) throws KiteboardingException {
      
  } 
  
  @Override
  public Operators save(Operators t) throws KiteboardingException {
      return dao.save(t);
  }
  
  @Override
  public void delete(Operators t) throws KiteboardingException {
      
  }
}
