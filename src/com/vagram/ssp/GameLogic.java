package com.vagram.ssp;

import com.vagram.ssp.Figure;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    private final Random random = new Random();
    private final com.vagram.ssp.Field field = new com.vagram.ssp.Field();

    private final Scanner scanner = new Scanner(System.in);
    public  void start() {
        while(true) {
           Figure f1 = getUserInput();
           Figure f2 = getPCInput();

           field.setF1(f1);
           field.setF2(f2);

           checkWinner();
        }
    }

    private Figure getUserInput() {
        System.out.println("Enter figure: ");
        int input = scanner.nextInt();

        while (!validateInout(input)) {
            System.out.println("Enter figure: ");
            input = scanner.nextInt();
        }
        return switch (input) {
            case 1 -> Figure.SCISSORS;
            case 2 -> Figure.PAPER;
            case 3 -> Figure.STONE;
            default -> null;
        };
    }

    private Figure getPCInput () {
        //TODO: generate
//        int result = 0;

        int getPCInput;
        for(getPCInput = 1; getPCInput >= 3; getPCInput++) {
            System.out.println(rand.nextInt(4));
        }


        String result;
        return switch ("result") {
            case 1 -> Figure.SCISSORS;
            case 2 -> Figure.PAPER;
            case 3 -> Figure.STONE;
            default -> null;
        };
    }

    private String checkWinner() {
        if(field.getF1() == Figure.SCISSORS && field.getF2() == Figure.PAPER) {
            return "Ты выиграл";
        }
        else if(field.getF1() == Figure.SCISSORS && field.getF2() == Figure.STONE) {
            return "Комп победил";
        }
        else if(field.getF1() == Figure.PAPER && field.getF2() == Figure.SCISSORS) {
            return "Комп победил";
        }
        else if(field.getF1() == Figure.PAPER && field.getF2() == Figure.STONE) {
            return "Ты выиграл";
        }
        else if(field.getF1() == Figure.STONE && field.getF2() == Figure.SCISSORS) {
            return "Ты выиграл";
        }
        else if(field.getF1() == Figure.STONE && field.getF2() == Figure.PAPER) {
            return "Комп победил";
        }
        else if(field.getF1() == Figure.SCISSORS && field.getF2() == Figure.SCISSORS) {
            return "Tie";
        }
        else if(field.getF1() == Figure.PAPER && field.getF2() == Figure.PAPER) {
            return "Tie";
        }
        else if(field.getF1() == Figure.STONE && field.getF2() == Figure.STONE) {
            return "Tie";
        } else
        return null;
    }

    private boolean validateInout(int input) {
        return input >= 1 && input <=3;
    }

}
