package Observers;

import Observable.WeatherData;

public class WeatherStatistics implements Observer, DisplayData
{
    private double maxTemp, minTemp, sumTemp;
    private int numberOfReadings;
    private WeatherData weatherData;
    
    public WeatherStatistics(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
        
        maxTemp = -9999999999.0;
        minTemp = 9999999999.0;
        sumTemp = 0.0;
        numberOfReadings = 0;
    }
    
    @Override
    public void update(double temperature, double pressure, double humidity)
    {
        maxTemp = Math.max(maxTemp, temperature);
        minTemp = Math.min(minTemp, temperature);
        sumTemp = sumTemp + temperature;
        numberOfReadings++;
        
        display();
    }

    @Override
    public void display()
    {
        System.out.println("Weather Statistics:");
        System.out.println("Minimum temperature: " + minTemp + ", Maximum temperature: " + maxTemp + ", Average temperature: " + (sumTemp / (double)numberOfReadings));
    }
}
