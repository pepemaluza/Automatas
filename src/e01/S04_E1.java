package e01;

import abstract_clases.State;
import enums.E01_Inputs;
import enums.E01_States;

import java.util.HashMap;

public class S04_E1 extends State {

    public S04_E1() {
        HashMap<String, Enum> map = new HashMap<>();
        map.put(E01_Inputs.DOLLAR_1,E01_States.S5);
        map.put(E01_Inputs.DOLLAR_2,E01_States.S5);
        setPossibleOutcomes(map);
        setDescription("Esperando dinero");
    }
}
