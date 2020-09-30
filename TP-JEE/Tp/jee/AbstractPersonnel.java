package Tp.jee;


import java.time.Clock;

/**
* @generated
*/
public abstract class AbstractPersonnel implements Utilisateur{

    String username ;
    String password;
    String email ;
    String nom;
    String prenom;
    String ip;
    
    
    

    //                          Operations                                  
    

    public void connectBo() {
        //TODO
    }

    public void disconnectBo() {
        //TODO
    }

    public void updateUser() {
        //TODO
    }

    public void getUser() {
        //TODO
    }

    public void updateObject() {
        //TODO
    }

    public String getToken() {

       return  "tokenExample";
    }

}
