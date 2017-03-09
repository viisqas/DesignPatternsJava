/**
 * Created by viktoriya on 09.03.17.
 */
public class Originator {
    private State state;
    public State getState() {
        return state;
    }
    public void setState(State newState) {
        state = newState;
    }
    public Memento createMemento(){
        return new Memento(state);
    }
    public void setMemento(Memento memento){
        state=memento.getState();
    }
}
