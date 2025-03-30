public class Monitor {
    private String river;
    private int position;
    private float level;
    public Monitor(String river,int position,float level)
    {
        this.river=river;
        this.position=position;
        this.level=level;
    }
    public float getLever()
    {
        return level;
    }
    public void setLevel(float newLevel)
    {
        level=newLevel;
    }

    public String getRiver(){
        return river;
    }
    public int getPosition()
    {
       return position;
    }
    @Override
    public String toString()
    {
        return "River:"+river+" position:"+position;
    }
}
