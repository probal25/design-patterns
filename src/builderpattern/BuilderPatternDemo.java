package builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Vehicle car = new Vehicle.VehicleBuilder().airbags(2).engine("SPORTS").build();
        System.out.println(car);
    }
}
