package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhang
 * 2021/8/17 21:11
 * 气象数据
 */
public class WeatherData implements Subject{
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers=new ArrayList<>();
    }

    @Override
    public void registryObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    /**
     * 如果数值变化，通知所有观察者
     */
    public void setMeasurements(float t,float h,float p){
        this.temperature=t;
        this.humidity=h;
        this.pressure=p;
        measurementsChanged();
    }
}
