package singleton;

public class Lazy {
    private static Lazy INSTANCE;

    public static Lazy getInstance(){

        if(INSTANCE==null){
            INSTANCE=new Lazy();
        }
        return INSTANCE;
    }

    private Lazy(){

    }

}
