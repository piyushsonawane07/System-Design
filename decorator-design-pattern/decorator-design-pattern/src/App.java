public class App {
    public static void main(String[] args) throws Exception {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> Cost: Rs." + coffee.getCost());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> Cost: Rs." + coffee.getCost());
        coffee = new SugarDecorator(coffee);        
        System.out.println(coffee.getDescription() + " -> Cost: Rs." + coffee.getCost());
    }
}
