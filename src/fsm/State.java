package fsm;
public interface State {

State next(State previous);

void printState();

}