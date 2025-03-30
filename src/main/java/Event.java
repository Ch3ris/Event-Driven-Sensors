public abstract class Event {
    private Sensor s;
    public Event(Sensor s)
    {
        this.s=s;
    }
    @Override
    public String toString()
    {
        return "Sensor description for this event:"+s;
    }
    public Sensor getSensor()
    {
        return s;
    }

    public String getSensorDescription()
    {
        return s.toString();
    }


}
