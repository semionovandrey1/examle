package factories.model;

public class VehicleCreator {

    private String radius;

    public VehicleCreator(String radius) {
        this.radius = radius;
    }

    public static Vehicle createVehicle(String type){
        switch (type){
            case "plate":
                return new Plane();
            case "car":
                return new Car();
        }
        return null;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }
}
