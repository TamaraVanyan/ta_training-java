package optional_task1;

public class the_shortest_longest {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int copyOfNumber = number;
        while (copyOfNumber != 0) {
            int currentDigit = copyOfNumber % 10;
            copyOfNumber = copyOfNumber / 10;
            System.out.println(currentDigit);
        }

    }
}
