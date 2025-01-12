public class App {
    public static void main(String[] args) throws Exception {
        WeatherStation weatherStation = new WeatherStation();
        DisplayScreen screen1 = new DisplayScreen("Screen 1");
        DisplayScreen screen2 = new DisplayScreen("Screen 2");
        weatherStation.addObserver(screen1);
        weatherStation.addObserver(screen2);
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
    }
}
