public class SimpleCoffee implements Coffee {
    
    @Override
    public String getDescription() {
        return "SimpleCoffee";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
