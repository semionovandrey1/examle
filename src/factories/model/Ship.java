package factories.model;

public class Ship extends Vehicle{

    public Ship(){
        model = "Titanic";
    }
    @Override
    public void move() {
        System.out.println("Walk like a ship");
    }
}
