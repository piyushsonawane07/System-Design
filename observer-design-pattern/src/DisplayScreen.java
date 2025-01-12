public class DisplayScreen implements Observer {
    
    private String screenName;
    
    public DisplayScreen(String screenName) {
        this.screenName = screenName;
    }
    
    @Override
    public void update(float temperature) {
        System.out.println(screenName + ": Temperature is " + temperature + "°C");
    }
}
