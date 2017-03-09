/**
 * Created by iikhsan on 09.03.17.
 */
public class Memento {
    private State state;
    public Memento(State newState){
        state=newState;
    }
    public State getState(){
        return state;
    }
}
