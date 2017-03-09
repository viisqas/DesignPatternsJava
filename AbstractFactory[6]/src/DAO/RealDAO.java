package DAO;

/**
 * Created by viktoriya on 08.03.17.
 */
public class RealDAO implements InDao {


    @Override
    public void saveUserInfo(Object userInfo) {
        if (userInfo != null)System.out.println("Good");
        else System.out.println("Null pointer exception");
    }

    @Override
    public void connectToDB() {
        System.out.println("Ok!");
    }

}