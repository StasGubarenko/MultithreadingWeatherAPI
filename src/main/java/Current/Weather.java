package Current;

import General.Current;
import General.Location;

public class Weather {
    Location location;
    Current current;

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

    @Override
    public String toString() {
        return "Weather{" +
                "location=" + location +
                ", current=" + current +
                '}';
    }
}

