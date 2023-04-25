package Forecast;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainAsynchForecast {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new AsynchForecast());
        executorService.shutdown();
    }
}
