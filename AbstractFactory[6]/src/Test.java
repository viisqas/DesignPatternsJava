import DAO.InDao;
import DAO.RealDAO;

/**
 * Created by viktoriya on 08.03.17.
 */
public class Test {
    public static void main(String[] args) {
        RealDAO realDAO = new RealDAO();
        Vitae vitae = realDAO.createVT();
        InDao inDao = new inDao();
        inDao.connectToDB();
        inDao.saveUserInfo(vitae);
    }
}