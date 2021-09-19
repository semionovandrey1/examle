package singleton;

public class SynchSingle {

    private static SynchSingle INSTANCE;

    public static synchronized SynchSingle getInstance(){

        return INSTANCE;
    }


    private  SynchSingle(){}
}
