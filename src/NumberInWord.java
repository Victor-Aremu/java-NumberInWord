public class NumberInWord {
    public static void printNumberInWord(int num){
        String number;
        if (0 == num) {
            number = "ZERO";
        } else if (1 == num) {
            number = "ONE";
        } else if (2 == num) {
            number = "TWO";
        } else if (3 == num) {
            number = "THREE";
        } else if (4 == num) {
            number = "FOUR";
        } else if (5 == num) {
            number = "FIVE";
        } else if (6 == num) {
            number = "SIX";
        } else if (7 == num) {
            number = "SEVEN";
        } else if (8 == num) {
            number = "EIGHT";
        } else if (9 == num) {
            number = "NINE";
        } else {
            number = "OTHER";
        }
        System.out.println(number);
    }
}
//Victor.Aremu
