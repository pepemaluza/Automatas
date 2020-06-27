package e05;

import abstract_clases.Automata;
import abstract_clases.State;
import e05.enums.E05_States;
import e05.states.*;

import java.util.HashMap;

public class TrafficController extends Automata {

    State currentState;
    HashMap<E05_States, State> statesMap;

    public TrafficController() {
        this.statesMap = new HashMap<>();
        statesMap.put(E05_States.EW_GO,new EwGo());
        statesMap.put(E05_States.EW_GO_CHANGE,new EwGoChange());
        statesMap.put(E05_States.EW_GO_READY,new EwGoReady());
        statesMap.put(E05_States.EW_STOPPING,new EwStopping());
        statesMap.put(E05_States.NS_GO,new NsGo());
        statesMap.put(E05_States.NS_GO_CHANGE,new NsGoChange());
        statesMap.put(E05_States.NS_GO_READY,new NsGoReady());
        statesMap.put(E05_States.NS_STOPPING,new NsStopping());

        setCurrentState(statesMap.get(E05_States.EW_GO));
    }

    @Override
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void setStatesMap(HashMap<E05_States, State> statesMap) {
        this.statesMap = statesMap;
    }

    @Override
    public State getCurrentState() {
        return currentState;
    }

    public HashMap<E05_States, State> getStatesMap() {
        return statesMap;
    }

    @Override
    public void receiveInput(String input) {
       E05_States currentStateEnum = (E05_States) currentState.calculateNextState(input);
       setCurrentState(statesMap.get(currentStateEnum));
    }

    @Override
    public String outPut() {
        return currentState.getDescription();
    }

//    public Output getOuput(String input){
//        switch (input) {
//            case ""
//        }
//    }
}
