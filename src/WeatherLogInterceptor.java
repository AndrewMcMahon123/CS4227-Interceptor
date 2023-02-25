public class WeatherLogInterceptor implements Interceptor {

    private WeatherLog weatherLog = new WeatherLog();
    private int temp;
    private int humidity;
    private float pressure;

    public WeatherLogInterceptor(int temp, int humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public void intercept(ContextObject contextObject) {
        contextObject.setContextMessage("WeatherLog: " + temp + " " + humidity + " " + pressure);
        weatherLog.NotifyInterception(temp, humidity, pressure);
    }

}
