package Forecast;

import General.Location;
import General.Current;
import General.Forecast;


public class Weather {
    Location location;
    Current current;
    Forecast forecast;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "location=" + location +
                ", current=" + current +
                ", forecast=" + forecast +
                '}';
    }
}
