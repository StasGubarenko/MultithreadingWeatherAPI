package General;

import java.util.Arrays;

public class Forecastday {
    String date;
    long date_epoch;
    Day day;
    Astro astro;
    Hour[] hour;

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Astro getAstro() {
        return astro;
    }

    public void setAstro(Astro astro) {
        this.astro = astro;
    }

    public Hour[] getHour() {
        return hour;
    }

    public void setHour(Hour[] hour) {
        this.hour = hour;
    }

    public String getDat() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getDate_epoch() {
        return date_epoch;
    }

    public void setDate_epoch(long day_epoch) {
        this.date_epoch = day_epoch;
    }

    @Override
    public String toString() {
        return "Forecastday{" +
                "date='" + date + '\'' +
                ", date_epoch=" + date_epoch +
                ", day=" + day +
                ", astro=" + astro +
                ", hour=" + Arrays.toString(hour) +
                '}';
    }
}
