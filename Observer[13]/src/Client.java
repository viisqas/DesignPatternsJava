import java.util.LinkedList;
import java.util.List;

/**
 * Created by viktoriya on 08.03.17.
 */
public class Client {
    public static void main(String[] args) {
        List<Order> orders = new LinkedList<>();
        PostOffice postOffice = new PostOffice();
        postOffice.reqEdition(orders);
    }
}
