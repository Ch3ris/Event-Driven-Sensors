public interface Display {

    public void onTemperatureEvent(TemperatureEvent e);
    public void onWaterLevelEvent(WaterLevelEvent e);
    public void onHumidityEvent(HumidityEvent e);
    public void display();
}
