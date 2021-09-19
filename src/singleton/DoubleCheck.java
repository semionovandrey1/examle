package singleton;

public class DoubleCheck {

    private static volatile DoubleCheck INSTANCE;
    private DoubleCheck(){

    }
    public static DoubleCheck getInstance(){
        DoubleCheck localInstance = INSTANCE;
        if(localInstance==null){
            synchronized (DoubleCheck.class){
                localInstance=INSTANCE;
                if(localInstance==null){
                    INSTANCE = new DoubleCheck();
                }
            }
        }
        return INSTANCE;
    }


}
