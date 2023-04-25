package Astronomy;

import General.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AsynchGet {

    public void run() throws IOException {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("key", "58017c49095544888d3141958231204");
        requestParams.put("q", "London");

        Request request = Utils.createRequest("http://api.weatherapi.com/v1/astronomy.json", requestParams);
        OkHttpClient client = new OkHttpClient();

        Call call = client.newCall(request);

        Response response = call.execute();


        if (response.isSuccessful()) {

            String json = response.body().string();
            ObjectMapper objectMapper = new ObjectMapper();
            AstronomyInfo astronomyInfo = objectMapper.readValue(json, AstronomyInfo.class);
            System.out.println(astronomyInfo);

        } else {
            System.out.println(response.code() + " " + response.body());
        }
    }
}
