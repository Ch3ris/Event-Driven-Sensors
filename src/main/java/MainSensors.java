import org.greenrobot.eventbus.EventBus;

public class MainSensors {
    public static void main(String[] args)
    {

        EventBus tempBus=new EventBus();
        EventBus humidBus=new EventBus();
        EventBus waterBus=new EventBus();

        NumericDisplay n1=new NumericDisplay("NumericDisplay1");
        MaxValueDisplay m1=new MaxValueDisplay("MaxValueDisplay1");
        TextDisplay t1=new TextDisplay("TextDisplay1");

        n1.registerBus(tempBus);
        n1.registerBus(waterBus);

        m1.registerBus(humidBus);
        m1.registerBus(waterBus);

        t1.registerBus(tempBus);
        t1.registerBus(humidBus);


        TemperatureSensor ts1=new TemperatureSensor(tempBus,"ts1","Timisoara",35.0f);
        TemperatureSensor ts2=new TemperatureSensor(tempBus,"ts2","Timisoara",40.0f);

        HumiditySensor hs1=new HumiditySensor(humidBus,"Hs1","Timisoara",75.00f);
        HumiditySensor hs2=new HumiditySensor(humidBus,"Hs2","Timisoara",50.00f);

        WaterLevelSensor wl1=new WaterLevelSensor(waterBus,"wl1","Timisoara",new Monitor("Bega",10,300.3f));
        WaterLevelSensor wl2=new WaterLevelSensor(waterBus,"wl2","Timisoara",new Monitor("Bega",30,200.3f));

        System.out.println("------------------Begin temperature sensor values------------------");
        ts1.setTemp(43);
        ts2.setTemp(30);
        System.out.println("---------------End temperature sensor values------------------");
        System.out.println();

        System.out.println("------------Begin humidity sensor values-----------------");
        hs1.setPercentageHumidity(25);
        hs2.setPercentageHumidity(30);
        System.out.println("----------------End humidity sensor values----------------");
        System.out.println();

        System.out.println("-------------Begin water level sensor values-----------");
        wl1.setLevelMonitor(150);
        wl2.setLevelMonitor(100);
        System.out.println("------------End water level sensor values------------------");
        System.out.println();
    }
}
