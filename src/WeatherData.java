import java.util.ArrayList;

public class WeatherData implements SetMeasurements, GetMeasurements, Subject {
    private ArrayList observers;

    private Dispatcher dispatcher;
    private ArrayList<Interceptor> interceptors = new ArrayList<Interceptor>();
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }


    public void measurementsChanged(){
        notifyObservers();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }

    public void addInterceptor(Interceptor interceptor) {
        dispatcher = new Dispatcher();
        interceptors.add(interceptor);
    }

    public void removeInterceptor(Interceptor interceptor) {
        int i = interceptors.indexOf(interceptor);
        if (i >= 0) {
            interceptors.remove(i);
        }
    }

    public void notifyInterceptors(ContextObject contextObject){
        for (int i = 0; i < interceptors.size(); i++) {
            Interceptor interceptor = (Interceptor)interceptors.get(i);
            interceptor.intercept(contextObject);
        }
    }

//    @Override
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}