package Observers;

import Observable.WeatherData;

public class CurrentWeather implements Observer, DisplayData
{
    private double temperature, pressure, humidity;
    private WeatherData weatherData;
    
    public CurrentWeather(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    
    @Override
    public void update(double temperature, double pressure, double humidity)
    {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        
        display();
    }

    @Override
    public void display()
    {
        System.out.println("Current Weather:");
        System.out.println("Temperature: " + temperature + ", pressure: " + pressure + ", humidity: " + humidity);
    }
}
