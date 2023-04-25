package Astronomy;

import General.Location;

public class AstronomyInfo {
    Location location;
    Astronomy astronomy;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Astronomy getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(Astronomy astronomy) {
        this.astronomy = astronomy;
    }

    @Override
    public String toString() {
        return "AstronomyInfo{" +
                "location=" + location +
                ", astronomy=" + astronomy +
                '}';
    }
}

