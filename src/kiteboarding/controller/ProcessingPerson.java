package kiteboarding.controller;

import kiteboarding.helper.KiteboardingException;
import kiteboarding.model.Person;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.commons.validator.routines.IBANValidator;



public abstract class ProcessingPerson<T extends Person> extends Processing<T> {
    
    public ProcessingPerson(){
        super();
        
    }
    
    public void checking (Person p) throws KiteboardingException{
        if(p.getFirstname()== null){
            throw new KiteboardingException("First name is not defined ");    
        }
        if(p.getFirstname().trim().isEmpty()){
            throw new KiteboardingException("First name is not entered ");
        }
        if(p.getLastname()== null){
            throw new KiteboardingException("Last name is not defined ");
        }
        if(p.getLastname().trim().isEmpty()){
            throw new KiteboardingException("Last name is not entered ");
        }
//        if(!EmailValidator.getInstance().isValid(p.getEmail())){
//            throw new KiteboardingException("Email is not valid ");
//        }
//        if(!IBANValidator.getInstance().isValid(p.getIban())){
//            throw new KiteboardingException("IBAN is not valid ");
//        }
     
    }
    
}
