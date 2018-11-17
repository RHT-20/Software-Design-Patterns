package Observers;

import Observable.WeatherData;

public class ForecastWeather implements Observer, DisplayData
{
    private double curTemp, prevTemp;
    private WeatherData weatherData;
    
    public ForecastWeather(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
        curTemp = prevTemp = 24.0;
    }
    
    @Override
    public void update(double temperature, double pressure, double humidity) 
    {
        prevTemp = curTemp;
        curTemp = temperature;
        
        display();
    }

    @Override
    public void display() 
    {
        System.out.println("Forecast Weather:");
        if(prevTemp > curTemp)  System.out.println("Temperature is decreasing.");
        else if(prevTemp == curTemp)    System.out.println("Same weather.");
        else    System.out.println("Temperature is increasing.");
    }
}
