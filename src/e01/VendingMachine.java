package e01;

import abstract_clases.Automata;
import abstract_clases.State;
import enums.E01_Inputs;
import enums.E01_States;

import java.util.HashMap;

public class VendingMachine extends Automata {

    State currentState;
    HashMap<E01_States, State> statesMap;

    public VendingMachine() {
        this.statesMap = new HashMap<>();
        statesMap.put(E01_States.S0,new S00_E1());
        statesMap.put(E01_States.S1,new S01_E1());
        statesMap.put(E01_States.S2,new S02_E1());
        statesMap.put(E01_States.S3,new S03_E1());
        statesMap.put(E01_States.S4,new S04_E1());
        statesMap.put(E01_States.S5,new S05_E1());
        statesMap.put(E01_States.S6,new S06_E1());

        setCurrentState(statesMap.get(E01_States.S0));
    }

    @Override
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void setStatesMap(HashMap<E01_States, State> statesMap) {
        this.statesMap = statesMap;
    }

    @Override
    public State getCurrentState() {
        return currentState;
    }

    public HashMap<E01_States, State> getStatesMap() {
        return statesMap;
    }

    @Override
    public void receiveInput(String input) {
       E01_States currentStateEnum = currentState.calculateNextState(input);
       setCurrentState(statesMap.get(currentStateEnum));
       outPut();
    }

    @Override
    public String outPut() {
        return currentState.getDescription();
    }
}
