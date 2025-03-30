public class TemperatureEvent extends Event {
    private TemperatureSensor s;
    public TemperatureEvent(TemperatureSensor s)
    {
        super(s);
        this.s=s;
    }
    public TemperatureSensor getSensor()
    {
        return s;
    }


}
