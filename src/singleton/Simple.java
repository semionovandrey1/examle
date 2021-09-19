package singleton;

public class Simple {

    private static final Simple INSTANCE = new Simple();



    public static Simple getInstance(){
        return INSTANCE;
    }

    private Simple(){

    }
}
