package e01;

import abstract_clases.State;
import e01.enums.E01_Inputs;
import e01.enums.E01_States;

import java.util.HashMap;

public class S05_E1 extends State {

    public S05_E1() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E01_Inputs.START_SERVING,E01_States.S6);
        setPossibleOutcomes(map);
        setDescription("Sirviendo cafe");
    }
}
