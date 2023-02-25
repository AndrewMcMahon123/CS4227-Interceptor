public class ContextObject {
    String contextMessage;
    WeatherData weatherData;

    public ContextObject(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public void setContextMessage(String contextMessage) {
        this.contextMessage = contextMessage;
    }

    public String toString() {
        return contextMessage;
    }

    public String getContextMessage() {
        return contextMessage;
    }
}
