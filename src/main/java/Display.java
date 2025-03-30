import org.greenrobot.eventbus.EventBus;

public interface Display {

    public void onTemperatureEvent(TemperatureEvent e);
    public void onWaterLevelEvent(WaterLevelEvent e);
    public void onHumidityEvent(HumidityEvent e);
    public void registerBus(EventBus e);
    public void display();
}
