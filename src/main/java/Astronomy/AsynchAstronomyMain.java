package Astronomy;


import java.io.IOException;

public class AsynchAstronomyMain {
    public static void main(String[] args) throws IOException {
        AsynchGet asynchGet = new AsynchGet();
        asynchGet.run();
    }
}
