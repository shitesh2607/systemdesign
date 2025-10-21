package com.systemdesign.systemdesign.ObserverPattern.observable;

import com.systemdesign.systemdesign.ObserverPattern.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

// Observable interface
public interface WeatherObservable {

    List<WeatherObserver> WEATHER_OBSERVER_LIST =new ArrayList<>();
    void addObserver(WeatherObserver obsvr);
    void removeObserver(WeatherObserver obsvr);
    void notifyObserver();
    void setWeatherReadings(float temperature, float humidity, float pressure);
//    void getData();
}
