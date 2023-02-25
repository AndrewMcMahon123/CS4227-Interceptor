public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        weatherData.addInterceptor(new WeatherLog());
        Dispatcher dispatcher = new Dispatcher();
        ContextObject contextObject = new ContextObject(weatherData);
        dispatcher.addInterceptor(new WeatherLogInterceptor(25,46, 29.4f));
        dispatcher.addInterceptor(new UserInterceptor("John"));

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements( 25, 40, 29.2f);
        dispatcher.dispatch(contextObject);
        weatherData.setMeasurements(28, 47, 29.2f);
        dispatcher.dispatch(contextObject);
        weatherData.setMeasurements(21, 36, 29.4f);
        dispatcher.dispatch(contextObject);
    }
}
