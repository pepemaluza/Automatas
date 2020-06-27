package abstract_clases;

import enums.E01_Inputs;
import enums.E01_States;

import java.util.HashMap;

public abstract class Automata {

    State currentState;

    HashMap<String, E01_States> possibleOutcomes;

    public abstract void receiveInput(String input);

    public abstract String outPut();

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public HashMap<String, E01_States> getPossibleOutcomes() {
        return possibleOutcomes;
    }

    public void setPossibleOutcomes(HashMap<String, E01_States> possibleOutcomes) {
        this.possibleOutcomes = possibleOutcomes;
    }


}
