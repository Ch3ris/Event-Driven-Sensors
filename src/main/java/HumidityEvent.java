public class HumidityEvent extends Event {
    HumiditySensor h;
    public HumidityEvent(HumiditySensor h)
    {
        super(h);
        this.h=h;
    }
    public HumiditySensor getSensor(){
        return h;
    }

}
