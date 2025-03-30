import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class MaxValueDisplay implements Display {

    String name;
    String explanation;
    float maxTemp=Float.MIN_VALUE;
    float maxWater=Float.MIN_VALUE;
    float maxHumid=Float.MIN_VALUE;


    public MaxValueDisplay(String name)
    {
        this.name=name;
    }

    public void registerBus(EventBus e)
    {
        e.register(this);
    }

    @Subscribe
    public void display() {
        String s="Name for this display:"+name;
        if(maxTemp!=Float.MIN_VALUE)
            s+="\nMax value for this event: temperature:"+maxTemp;
        if(maxWater!=Float.MIN_VALUE)
            s+="\nMax value for this event: water:"+maxWater;
        if(maxHumid!=Float.MIN_VALUE)
            s+="\nMax value for this event: humid:"+maxHumid;
        s+="\nLatest sensor compared for max value:\n"+explanation;
        System.out.println(s);
        System.out.println();
    }

    @Subscribe
    public void onTemperatureEvent(TemperatureEvent e)
    {
        if(e.getSensor().temp>maxTemp)
        {
            maxTemp=e.getSensor().temp;
            explanation=e.getSensorDescription();
        }
        display();
    }
    @Subscribe
    public void onWaterLevelEvent(WaterLevelEvent e)
    {
        Monitor m=e.getSensor().getMonitor();
        if(m.getLever()>maxWater)
        {
            maxWater=m.getLever();
            explanation=e.getSensorDescription();
        }
        display();
    }
    @Subscribe
    public void onHumidityEvent(HumidityEvent e)
    {
        if(e.getSensor().getPercentageHumidity()>maxHumid)
        {
            maxHumid=e.getSensor().getPercentageHumidity();
            explanation=e.getSensorDescription();
        }
        explanation=e.getSensorDescription();
        display();
    }
}
