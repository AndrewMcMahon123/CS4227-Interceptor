import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TemperatureTest {

    @Test
    public void whenTemperatureIsSetThenGetTemperatureReturnsTheSameValue() {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements( 25, 40, 29.2f);

        assertEquals(25, weatherData.getTemperature(), 0.0);
    }
}
