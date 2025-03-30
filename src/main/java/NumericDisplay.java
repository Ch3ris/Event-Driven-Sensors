import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class NumericDisplay implements Display{
    //we'll say that for example, this display will only return the new value assigned for each of the Events.
    String name;
    EventBus e;
    public NumericDisplay(EventBus e,String name)
    {
        this.e=e;
        this.name=name;
    }

    float value;
    String explanation;
    public void display()
    {
        String s="Values from display with name:"+name+"\n";
        s+="New value:"+value+"\nExplanation for this value:\n"+explanation;
        System.out.println(s+"\n");
    }
    @Subscribe
    public void onTemperatureEvent(TemperatureEvent e)
    {
        value=e.getSensor().temp;
        explanation=e.getSensorDescription();
        display();
    }
    @Subscribe
    public void onWaterLevelEvent(WaterLevelEvent e)
    {
        Monitor m=e.getSensor().getMonitor();
        value=m.getLever();
        explanation=e.getSensorDescription();
        display();
    }
    @Subscribe
    public void onHumidityEvent(HumidityEvent e)
    {
        value=e.getSensor().getPercentageHumidity();
        explanation=e.getSensorDescription();
        display();
    }
}
