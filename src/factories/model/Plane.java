package factories.model;

    public class Plane extends Vehicle{

        public Plane(){
            model = "Sport Cruizer";
        }
        @Override
        public void move() {
            System.out.println("Walk like a plane");
        }
    }

