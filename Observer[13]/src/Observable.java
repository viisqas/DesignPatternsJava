import java.util.List;

/**
 * Created by viktoriya on 08.03.17.
 */
public interface Observable {
    public void sendEdition(Observer obj, Order edition);
    public void sendEditions(List<Observer> obj);

    public void publicize(Observer obj);
    public void notifyObservers();

    public Object getUpdate(Observer obj);

}