import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by viktoriya on 08.03.17.
 */
public abstract class Order implements Observable {
    private String region;
    private String editionNumb;
    private BigInteger clientId;
    private Order order;
    private List<Observer> observers;
    public Order(){
        observers = new LinkedList<>();
    }

    @Override
    public void sendEdition(Observer obj, Order order) {
        if (obj != null || order != null){
            sendEdition(obj, order);
        }
        else{
            System.out.println("Error in creating order");
        }
    }

    @Override
    public void sendEditions(List<Observer> obj) {
        if (obj != null){
            sendEditions(obj);
        }
        else{
            System.out.println("Error in creating order");
        }
    }

    @Override
    public void publicize(Observer obj) {
        publicize(obj);
    }

    @Override
    public void notifyObservers() {
        notifyObservers();
    }

    @Override
    public Object getUpdate(Observer obj) {
        return obj;
    }
}