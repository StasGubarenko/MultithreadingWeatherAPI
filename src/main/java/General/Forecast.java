package General;

import java.util.Arrays;

public class Forecast {
    Forecastday[] forecastday;

    public Forecastday[] getForecastday() {
        return forecastday;
    }

    public void setForecastday(Forecastday[] forecastday) {
        this.forecastday = forecastday;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "forecastday=" + Arrays.toString(forecastday) +
                '}';
    }
}

