import org.greenrobot.eventbus.EventBus;

public class HumiditySensor extends Sensor {
    private EventBus e;
    private String name;
    private String location;

    private float percentageHumidity;
    public HumiditySensor(EventBus e,String name,String location,float percentageHumidity)
    {
        super(e,name,location);
        this.e=e;
        this.percentageHumidity=percentageHumidity;
    }
    @Override
    public String toString() {
        return super.toString() + " percentage humidity:"+percentageHumidity;
    }
    public float getPercentageHumidity()
    {
        return percentageHumidity;
    }
    public void setPercentageHumidity(float newPercentageHumidity){
        percentageHumidity=newPercentageHumidity;
        e.post(new HumidityEvent((this)));
    }
}
