public class WaterLevelEvent extends Event {
    private WaterLevelSensor s;
    public WaterLevelEvent(WaterLevelSensor s)
    {
        super(s);
        this.s=s;
    }
    public WaterLevelSensor getSensor()
    {
        return s;
    }

}
