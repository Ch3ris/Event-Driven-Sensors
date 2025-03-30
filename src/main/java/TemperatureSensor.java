import org.greenrobot.eventbus.EventBus;

public class TemperatureSensor extends Sensor {
    private EventBus e;
    private String name;
    private String location;
    float temp;
    public TemperatureSensor(EventBus e,String name,String location,float temp)
    {
        super(e,name,location);
        this.e=e;
        this.temp=temp;
    }
    @Override
    public String toString() {
        return super.toString() + " temperature:" + temp;
    }

    public String getLocation()
    {
        return location;
    }


    public void setTemp(float temp)
    {
        this.temp=temp;
        e.post(new TemperatureEvent(this));
    }




}
