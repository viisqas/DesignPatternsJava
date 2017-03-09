import java.util.List;

/**
 * Created by viktoriya on 08.03.17.
 */
public interface Observer {
    public boolean getEdition(boolean got);

    public void reqEdition(List<Order> orders);
}