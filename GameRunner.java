import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        GameLogic gameLogic = new GameLogic() {
            while(true) {
                System.out.print("Ваш выбор: ");
                int field = new Scanner(System.in).nextInt();
                GameLogic.input(PcInput);
            }

        };
    }
}
