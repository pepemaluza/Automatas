package e05.states;

import abstract_clases.State;
import e01.enums.E01_Inputs;
import e01.enums.E01_States;
import e05.enums.E05_Inputs;
import e05.enums.E05_States;

import java.util.HashMap;

public class EwGo extends State {

    public EwGo() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E05_Inputs.CAR_NS, E05_States.EW_GO_CHANGE);
        map.put(E05_Inputs.TIMER,E05_States.EW_GO_READY);
        setPossibleOutcomes(map);
        setDescription("Autos EW avanzando");
    }

}

