package kiteboarding.controller;



public abstract class Processing<T> {
    
    protected DAO<T> dao;
    
    public Processing(){
        dao = new DAO<>();
    }
    
}
