package Forecast;

import General.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class CallbackWeather implements Callable<Weather> {
    @Override
    public Weather call() throws InterruptedException {

        Weather weather = null;

        Map<String, String> requestParams = new HashMap<>();

        requestParams.put("key", "58017c49095544888d3141958231204");
        requestParams.put("q", "London");
        requestParams.put("days", "1");
        requestParams.put("api", "no");

        Request request = Utils.createRequest("http://api.weatherapi.com/v1/forecast.json", requestParams);


        OkHttpClient client = new OkHttpClient();


        Call call = client.newCall(request);

        Response response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Засыпаем на 15 секунд");
        Thread.sleep(15000);


        if (response.isSuccessful()) {

            String json = null;
            try {
                json = response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ObjectMapper objectMapper = new ObjectMapper();

            try {
                weather = objectMapper.readValue(json, Weather.class);
            } catch (IOException e) {
                e.printStackTrace();
            }


        } else {
            System.out.println(response.code() + " " + response.body());
        }

        return weather;
    }
}
