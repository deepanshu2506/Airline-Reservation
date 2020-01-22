public class Airport{

    private String code;
    private String name;
    private String location;

    public Airport(String name, String code,String location){
        this.name = name;
        this.location = location;
        this.code = code;
    }

    public String getName(){
        return this.name;
    }

    
    public String getCode(){
        return this.code;
    }
    
    public String getlocation(){
        return this.location;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    public void setLocation(String location){
        this.location = location;
    }
}