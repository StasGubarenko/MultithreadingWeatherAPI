package Forecast;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainCallBack {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Weather> future = executorService.submit(new CallbackWeather());
        Weather weather = future.get();
        executorService.shutdown();

        System.out.println(weather);

    }
}
