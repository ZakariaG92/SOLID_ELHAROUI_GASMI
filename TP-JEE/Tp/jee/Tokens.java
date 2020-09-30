package Tp.jee;


import java.util.Date;


public class Tokens {
    

    private Integer id;
    

    private String code;
    

    private Date DateGen;
    
    

    private ApiController apiController;
    
    

    public Integer getId() {
        return this.id;
    }
    

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String getCode() {
        return this.code;
    }
    

    public void setCode(String code) {
        this.code = code;
    }
    

    public Date getDateGen() {
        return this.DateGen;
    }
    

    public void setDateGen(Date DateGen) {
        this.DateGen = DateGen;
    }
    
    

    public ApiController getApiController() {
        return this.apiController;
    }
    

    public void setApiController(ApiController apiController) {
        this.apiController = apiController;
    }
    
}
