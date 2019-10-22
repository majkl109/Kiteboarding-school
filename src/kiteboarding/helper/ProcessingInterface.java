package kiteboarding.helper;

import java.util.List;
/*
@param<T>
*/
public interface ProcessingInterface<T> {
    
    public List<T> getListed();
    public void checking(T t) throws KiteboardingException;
    public T save(T t) throws KiteboardingException;
    public void delete(T t) throws KiteboardingException;
    
    
    
}
