package com.systemdesign.systemdesign.ObserverPattern.observable;

import com.systemdesign.systemdesign.ObserverPattern.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

//Concrete class Observable
public class WeatherStation implements WeatherObservable {

    // List of observers registered for updates
    private final List<WeatherObserver> observers;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    // Observable Data
    private float temperature;
    private float humidity;
    private float pressure;


    @Override
    public void addObserver(WeatherObserver obsvr) {
        observers.add(obsvr);
        System.out.println("[+] observer registered: " + obsvr.getClass().getSimpleName());
    }

    @Override
    public void removeObserver(WeatherObserver obsvr) {

        observers.remove(obsvr);
        System.out.println("[-] observer removed: " + obsvr.getClass().getSimpleName());
    }

    @Override
    public void notifyObserver() {
        for(WeatherObserver obs:observers){
            obs.update();
        }
    }

    @Override
    public void setWeatherReadings(float temperature, float humidity, float pressure) {

        this.pressure=pressure;
        this.temperature=temperature;
        this.humidity=humidity;
        notifyObserver();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString(){
        return "WeatherStation:{ "+
                "temperature= "+temperature+
                ", humidity= " +humidity+
                ", pressure= " +pressure + " }";
    }
}
