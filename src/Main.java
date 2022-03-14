public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", true);
        Car.Engine e1 = c1.defineEngine();
        c1.ride();
        System.out.println("This is "+c1.getName());
        System.out.println(c1.getName()+ " has "+ e1.getEngineType());





    }
}
