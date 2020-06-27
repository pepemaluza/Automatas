package e05;

import abstract_clases.State;
import e05.enums.E05_Inputs;
import e05.states.EwGoChange;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Exercises5Runner {

    public static void main(String[] args) {
        executeProgram();
    }

    public static void executeProgram() {
        TrafficController trafficController = new TrafficController();
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        while (true) {
            List<String> possibleActions = new ArrayList<>(trafficController.getCurrentState().getPossibleActions());

            for (int i = 0; i < possibleActions.size(); i++) {

                if (i == 0) {
                    switch (trafficController.getCurrentState().getDescription()) {
                        case "Autos EW avanzando":
                            System.out.println("\nAutos EW avanzando");
                            System.out.println("EW: Green \nNS: Red");
                            System.out.println("Timer en curso");
                            break;
                        case "Llego un auto NS":
                            System.out.println("\nAutos EW avanzando");
                            System.out.println("EW: Green \nNS: Red");
                            System.out.println("Timer en curso");
                            break;
                        case "Se termino el timer":
                            System.out.println("\nAutos EW avanzando");
                            System.out.println("EW: Green \nNS: Red");
                            break;
                        case "Se frenan los autos EW":
                            System.out.println("\nAutos EW frenan");
                            System.out.println("EW: Yellow");
                            System.out.println("Se inicia el timer por 3 segundos");
                            break;
                        case "Autos NS avanzando":
                            System.out.println("\nAutos NS avanzando");
                            System.out.println("NS: Green \n EW: Red");
                            System.out.println("Se inicia el timer por 15 segundos");
                            break;
                        case "Se termino el Timer":
                            System.out.println("\nAutos NS avanzando");
                            System.out.println("NS: Green \n EW: Red");
                            break;
                        case "Llego un auto EW":
                            System.out.println("\nAutos NS avanzando");
                            System.out.println("NS: Green \nEW: Red");
                            System.out.println("Timer en curso");
                            break;
                        case "Se frenan los autos NS":
                            System.out.println("\nAutos NS frenan");
                            System.out.println("NS: Yellow");
                            System.out.println("Se inicia el timer por 3 segundos");
                            break;
                        default:
                            System.out.println(trafficController.getCurrentState().getDescription());
                            System.out.println("No entro en ninguno");
                    }

                    System.out.println(" ");
                    System.out.println("Posibles acciones: ");
                    System.out.println("0- Terminar programa");
                }
                System.out.println((i + 1) + "- " + possibleActions.get(i));
            }


            String action;

            int nextInt = scanner.nextInt();
            switch (nextInt) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                case 2:
                    action = possibleActions.get(nextInt - 1);
                    trafficController.receiveInput(action);
                    break;
                default:
                    System.out.println("Input invalido, reintente.");
            }
        }
    }


}
