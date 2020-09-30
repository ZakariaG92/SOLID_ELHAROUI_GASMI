package Tp.jee;


/**
* @generated
*/
public abstract class AbstractObject {

    int id ;
    String name;

    private Switchable switchable;
    
    

    
    


    public Switchable setSwitchable(Switchable switchable) {
        this.switchable = switchable;
        return  switchable;
    }
    
    

    public Switchable getSwitchable() {
        return this.switchable;
    }
    



    //                          Operations                                  
    

    public void closeCircuit() {
        //TODO
    }

    public void openCircuit() {
        //TODO
    }
    
}
