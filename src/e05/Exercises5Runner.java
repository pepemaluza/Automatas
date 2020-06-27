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
        System.out.println(trafficController.getCurrentState().getDescription());

        while (true) {
            List<String> possibleActions = new ArrayList<>(trafficController.getCurrentState().getPossibleActions());

            for (int i = 0; i < possibleActions.size(); i++) {
                if ("Se termino el timer".equals(possibleActions.get(i))) System.out.println("Timer en curso");

                if (i == 0) {
                    switch (trafficController.getCurrentState().getDescription()) {
                        case "Llego un auto NS":
                            System.out.println("EW: Yellow \n");
                            break;
                        case "Se frenan los autos EW":
                            System.out.println("EW: Red");
                            System.out.println("NS: Green \n");
                            break;
                        case "Llego un auto EW":
                            System.out.println("NS: Yellow \n");
                            break;
                        case "Se frenan los autos NS":
                            System.out.println("NS: Red");
                            System.out.println("EW: Green \n");
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
//                if ("Llego un auto NS".equals(possibleActions.get(i)) || "Llego un auto EW".equals(possibleActions.get(i))) {
//                    System.out.println(1 + "- " + possibleActions.get(i));
//                }

            }
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
                System.out.println("Invalid input. Retry!");
        }
    }

}

    private static void setTimer(int total) {
        for (int i = 0; i <= total; i++) {
            progressPercentage(i, total);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void progressPercentage(int remain, int total) {
        if (remain > total) {
            throw new IllegalArgumentException();
        }
        int maxBareSize = 10; // 10unit for 100%
        int remainProcent = ((100 * remain) / total) / maxBareSize;
        char defaultChar = '-';
        String icon = "*";
        String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
        StringBuilder bareDone = new StringBuilder();
        bareDone.append("[");
        for (int i = 0; i < remainProcent; i++) {
            bareDone.append(icon);
        }
        String bareRemain = bare.substring(remainProcent, bare.length());
        System.out.print("\r" + bareDone + bareRemain + " " + total + " segundos");
        if (remain == total) {
            System.out.print("\n");
        }
    }
}
