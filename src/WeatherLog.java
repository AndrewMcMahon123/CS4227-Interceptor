public class WeatherLog implements Interceptor {

    public void intercept(int temp, int humidity, float pressure) {
        System.out.println("WeatherLog: " + temp + " " + humidity + " " + pressure);
    }

    public void intercept(ContextObject contextObject) {
        contextObject.setContextMessage("WeatherLog: " + contextObject.getContextMessage());
    }

    public void NotifyInterception(int temp, int humidity, float pressure) {
        System.out.println("WeatherLog: temp: " + temp + " humidity: " + humidity + " pressure: " + pressure);
    }

}

