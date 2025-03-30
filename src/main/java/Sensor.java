import org.greenrobot.eventbus.EventBus;

public abstract class Sensor
{
    private EventBus e;
    private String name;
    private String location;
    public Sensor(EventBus e,String name,String location) {
        this.e = e;
        this.name = name;
        this.location = location;
    }
    @Override
    public String toString() {
        return "Sensor name:" + name + " at location:" + location;
    }

    public String getLocation()
    {
        return location;
    }
    public String getName() {
        return name;
    }

}

