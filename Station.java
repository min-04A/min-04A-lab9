public class Station 
{
    protected String name;
    protected String lineColor;
    protected boolean inService;
    protected Station previousStation;
    protected Station nextStation;

    public Station(String lineColor, String name)
    {
        this.name = name;
        this.lineColor = lineColor;
        this.previousStation = null;
        this.nextStation = null;
        this.inService = true;
    }
    
    public String getName()
    {
        return name;
    }

    public String getLineColor()
    {
        return lineColor;
    }

    public Station getPrev()
    {
        return previousStation;
    }

    public Station getNext()
    {
        return nextStation;
    }

    public boolean isAvailable()
    {
        return inService;
    }
}
