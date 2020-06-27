package e01;

import abstract_clases.State;
import enums.E01_Inputs;
import enums.E01_States;

import java.util.HashMap;

public class S05_E1 extends State {

    public S05_E1() {
        HashMap<String, E01_States> map = new HashMap<>();
        map.put(E01_Inputs.START_SERVING,E01_States.S6);
        setPossibleOutcomes(map);
        setDescription("Sirviendo cafe");
    }
}
