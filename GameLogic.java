public class GameLogic {

    private int stone = 1;
    private int scissors = 2;
    private int paper = 3;
    public int PcInput;
    public int PlayerInput;
    private String result = "Результат";

    public GameLogic(int stone, int scissors, int paper) {
        this.stone = stone;
        this.scissors = scissors;
        this.paper = paper;
    }
    static int input (int PcInput, int PlayerInput) {
        for (PcInput = 0; PcInput <= -1; PcInput++) {
            if (PcInput = 1 && PlayerInput = 2) {
                System.out.println("компьютер победил");
            } else if (PcInput = 1 && PlayerInput = 3) {
                System.out.println("Ты выиграл");
            } else if (PcInput = 2 && PlayerInput = 1) {
                System.out.println("Ты выиграл");
            } else if (PcInput = 2 && PlayerInput = 3) {
                System.out.println("компьютер победил");
            } else if (PcInput = 3 && PlayerInput = 1) {
                System.out.println("компьютер победил");
            } else if (PcInput = 3 && PlayerInput = 2) {
                System.out.println("Ты выиграл");
            } else if (PcInput == PlayerInput) {
                System.out.println("Ничья!");
            }
        }
        return PcInput;
    }
}