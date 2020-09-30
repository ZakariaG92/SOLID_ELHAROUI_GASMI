package Tp.jee;


import java.util.Date;


public class Log {
    

    private String name;
    

    private String action;
    

    private AbstractObject object;
    

    private Date dateEvent;
    

    private String pathName;
    
    
    

    public String getName() {
        return this.name;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    

    public String getAction() {
        return this.action;
    }
    

    public void setAction(String action) {
        this.action = action;
    }
    

    public AbstractObject getObject() {
        return this.object;
    }
    

    public void setObject(AbstractObject object) {
        this.object = object;
    }
    

    public Date getDateEvent() {
        return this.dateEvent;
    }
    

    public void setDateEvent(Date dateEvent) {
        this.dateEvent = dateEvent;
    }
    

    private String getPathName() {
        return this.pathName;
    }
    

    private void setPathName(String pathName) {
        this.pathName = pathName;
    }
    
    

    //                          Operations                                  
    

    public void addFile() {
        //TODO
    }

    public void create() {
        //TODO
    }
    
}
