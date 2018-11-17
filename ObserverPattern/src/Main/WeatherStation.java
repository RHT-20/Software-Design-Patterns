package Main;

import Observers.WeatherStatistics;
import Observers.ForecastWeather;
import Observers.CurrentWeather;
import Observable.WeatherData;

public class WeatherStation 
{
    public static void main(String[] args) 
    {
        WeatherData weatherData = new WeatherData();
        CurrentWeather currentWeather = new CurrentWeather(weatherData);
        ForecastWeather forecastWeather = new ForecastWeather(weatherData);
        WeatherStatistics weatherStatistics = new WeatherStatistics(weatherData);
        
        weatherData.setMeasurements(32.0, 30.5, 65.0);
        System.out.println("");
        weatherData.setMeasurements(28.0, 35.5, 64.5);
        System.out.println("");
        weatherData.setMeasurements(35.0, 29.0, 61.5);
        System.out.println("");
    }
}
