package General;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.Request;

import java.util.Map;

public class Utils {
    public static Request createRequest(String endpoint, Map<String, String> requestParams) {

        HttpUrl.Builder builder = HttpUrl.parse(endpoint).newBuilder();
        for (String key : requestParams.keySet()) {
            builder.addQueryParameter(key, requestParams.get(key));
        }

        String url = builder.build().toString();

        return new Request.Builder().url(url).build();
    }
}

