import org.greenrobot.eventbus.EventBus;

public class WaterLevelSensor extends Sensor {
    private EventBus e;
    private String name;
    private String location;
    private Monitor m;
    public WaterLevelSensor(EventBus e,String name,String location,Monitor m)
    {
        super(e,name,location);
        this.e=e;
        this.m=m;
    }
    @Override
    public String toString() {
        return super.toString() + " "+m;
    }
    public Monitor getMonitor(){
        return m;
    }

    public void setLevelMonitor(float level){
        m.setLevel(level);
        e.post(new WaterLevelEvent((this)));
    }
}
