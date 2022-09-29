public class Model 
{
    private String eventType;
    private String eventName;
    private String date;
    
    public Model(String eventType, String eventName, String date) 
    {
        this.eventType = eventType; 
        this.eventName = eventName;
        this.date = date;
    }
   
    private final String url = "jdbc:postgresql://localhost:5432/calendar";
    private final String user = "postgres";
    private final String password = "deepali";

    public String geteventType() 
    {
        return eventType;
    }
    
    public void seteventType(String eventType) 
    {
        this.eventType = eventType;
    }
    
    public String geteventName() 
    {
        return eventName;
    }
    
    public void seteventName(String eventName) 
    {
        this.eventName = eventName;
    }
 
    public String getdate() 
    {
	    return date;
    }
    
    public void setdate(String date) 
    {
	  this.date = date;
    }
}
