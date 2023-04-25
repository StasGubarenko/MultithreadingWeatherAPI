package Current;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.*;

import java.io.IOException;

public class myThread extends Thread {
    @Override
    public void run() {
        OkHttpClient client = new OkHttpClient();

        //Настраиваем addQueryParameter для URL
        HttpUrl.Builder urlBuilder = HttpUrl.parse("http://api.weatherapi.com/v1/current.json").newBuilder();
        urlBuilder.addQueryParameter("key", "58017c49095544888d3141958231204");
        urlBuilder.addQueryParameter("q", "Омск");

        String url = urlBuilder.build().toString();

        //Создаем запрос
        Request request = new Request.Builder()
                .url(url)
                .build();

        //Совершаем запрос
        Call call = client.newCall(request);

        //Получаем ответ
        Response response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Проверяем ответ
        if (response.isSuccessful()) {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = null;
            try {
                json = response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Weather   weather = null;
            try {
                weather = objectMapper.readValue(json, Weather.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(weather);
        } else {
            try {
                System.out.println(response.code() + " " + response.body().string());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
