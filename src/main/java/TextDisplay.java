import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class TextDisplay {
    String name;
    public TextDisplay(String name)
    {
        this.name=name;
    }


    String explanation;
    public void display()
    {
        String s="Values from display with name:"+name+"\n";
        s+="Updated New value"+"\nExplanation for this value:\n"+explanation;
        System.out.println(s+"\n");
    }

    public void registerBus(EventBus e)
    {
        e.register(this);
    }

    @Subscribe
    public void onTemperatureEvent(TemperatureEvent e)
    {

        explanation=e.getSensorDescription();
        display();
    }
    @Subscribe
    public void onWaterLevelEvent(WaterLevelEvent e)
    {
        Monitor m=e.getSensor().getMonitor();

        explanation=e.getSensorDescription();
        display();
    }
    @Subscribe
    public void onHumidityEvent(HumidityEvent e)
    {

        explanation=e.getSensorDescription();
        display();
    }
}
