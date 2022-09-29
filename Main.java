public class Main 
{
    public static void main(String[] args)
    {
        Model m = new Model("Enter Event Type","Enter Event Name","Enter Date");
        View v = new View("Calendar Event");
        Controller c = new Controller(m, v);
        c.initController();
    }
}