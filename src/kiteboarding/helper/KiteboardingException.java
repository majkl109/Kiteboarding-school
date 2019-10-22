package kiteboarding.helper;


public class KiteboardingException extends Exception {
    
    private int code;
    
    public int getCode(){
        return code;
    }
    
    public void setCode(int code){
        this.code = code;
    }
    
    public KiteboardingException(String message){
        super(message);
    }
    
}
