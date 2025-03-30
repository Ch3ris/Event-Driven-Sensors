import org.greenrobot.eventbus.EventBus;

public class MainSensors {
    public static void main(String[] args)
    {

        EventBus eventBus = EventBus.getDefault();

//        NumericDisplay n1=new NumericDisplay(eventBus,"NumericDisplay1");
        MaxValueDisplay m1=new MaxValueDisplay(eventBus,"MaxValueDisplay1");

//        eventBus.register(n1);
        eventBus.register(m1);


        TemperatureSensor TimisoaraSensor1=new TemperatureSensor(eventBus,"TimisoaraSensor1","Timisoara",35.0f);
        TemperatureSensor TimisoaraSensor2=new TemperatureSensor(eventBus,"TimisoaraSensor2","Timisoara",40.0f);

        HumiditySensor hs1=new HumiditySensor(eventBus,"Hs1","Timisoara",75.00f);
        HumiditySensor hs2=new HumiditySensor(eventBus,"Hs2","Timisoara",50.00f);

        WaterLevelSensor wl1=new WaterLevelSensor(eventBus,"wl1","Timisoara",new Monitor("Bega",10,300.3f));
        WaterLevelSensor wl2=new WaterLevelSensor(eventBus,"wl2","Timisoara",new Monitor("Bega",30,200.3f));

        TimisoaraSensor1.setTemp(43);
        TimisoaraSensor2.setTemp(30);

        hs1.setPercentageHumidity(25);
        hs2.setPercentageHumidity(30);

        wl1.setLevelMonitor(150);
        wl2.setLevelMonitor(100);

    }
}
