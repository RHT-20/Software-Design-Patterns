package Observable;

import java.util.ArrayList;
import Observers.Observer;

public class WeatherData implements Subject
{
    private double temperature, pressure, humidity;
    ArrayList<Observer> observers;
    
    public WeatherData()
    {
        observers = new ArrayList<>();
    }
    
    @Override
    public void addObserver(Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o)
    {
        try 
        {
            observers.remove(o);
        }
        catch (Exception e) {}
    }

    @Override
    public void notifyObserver()
    {
        for(Observer observer : observers)
        {
            observer.update(temperature, pressure, humidity);
        }
    }
    
    public void weatherChanged()
    {
        notifyObserver();
    }
    
    public void setMeasurements(double temperature, double pressure, double humidity)
    {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        
        weatherChanged();
    }

    public double getTemperature() 
    {
        return temperature;
    }

    public double getPressure() 
    {
        return pressure;
    }

    public double getHumidity() 
    {
        return humidity;
    }
}
