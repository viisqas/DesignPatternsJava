import java.util.ArrayList;
import java.util.List;

/**
 * Created by viktoriya on 09.03.17.
 */
public class Main {
    public static void main(String[] args) {
        List<State> states = new ArrayList<State>();

        states.add(new State("Article1"));
        states.add(new State("Article2"));
        states.add(new State("Article3"));


        Originator originator = new Originator();
        originator.setState(states.get(0));
        System.out.println(originator.getState().getContent());

        Caretake caretaker = new Caretake();
        caretaker.setMemento(originator.createMemento());
        originator.setState(new State("Article1Update"));
        System.out.println(originator.getState().getContent());

        originator.setMemento(caretaker.getMemento());
        System.out.println(originator.getState().getContent());
    }
}
