package builderpattern;

public class Vehicle {
    private String engine;
    private int wheel;
    private int airbags;

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbags() {
        return airbags;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", wheel=" + wheel +
                ", airbags=" + airbags +
                '}';
    }

    private Vehicle(VehicleBuilder vehicleBuilder) {
        this.engine = vehicleBuilder.engine;
        this.wheel = vehicleBuilder.wheel;
        this.airbags = vehicleBuilder.airbags;
    }

    public static class VehicleBuilder {
        private String engine;
        private int wheel;
        private int airbags;

        public VehicleBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public VehicleBuilder wheel(int wheel) {
            this.wheel = wheel;
            return this;
        }

        public VehicleBuilder airbags(int airbags) {
            this.airbags = airbags;
            return this;
        }

        public Vehicle build() {
            Vehicle vehicle = new Vehicle(this);
            return vehicle;
        }
    }
}
