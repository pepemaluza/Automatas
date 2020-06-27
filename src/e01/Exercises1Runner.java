package e01;

import e01.enums.E01_Inputs;

import java.util.*;

public class Exercises1Runner {

    public static void main(String[] args) {
        executeProgram();
    }

    public static void executeProgram() {
        VendingMachine vendingMachine = new VendingMachine();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            List<String> possibleActions = new ArrayList<>(vendingMachine.getCurrentState().getPossibleActions());

            if (possibleActions.size() == 1) {
                vendingMachine.receiveInput(E01_Inputs.START_SERVING);
                if (possibleActions.get(0) == "Empezando a servir") {
                    System.out.println("Empezando a servir cafe, aguarde porfavor");
                    for (int i = 0; i <= 200; i = i + 20) {
                        progressPercentage(i, 200);
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                        }
                    }
                    System.out.println("Cafe servido");
                }
                vendingMachine.receiveInput(E01_Inputs.FINISH_SERVING);
                break;
            } else {
                System.out.println("Posibles acciones: ");
                System.out.println(" ");
                System.out.println("0- Terminar programa");
                for (int i = 0; i < possibleActions.size(); i++) {
                    System.out.println((i + 1) + "- " + possibleActions.get(i));
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
                    vendingMachine.receiveInput(action);
                    break;

                default:
                    System.out.println("Input invalido, reintente.");

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
        System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * 10 + "%");
        if (remain == total) {
            System.out.print("\n");
        }
    }
}
