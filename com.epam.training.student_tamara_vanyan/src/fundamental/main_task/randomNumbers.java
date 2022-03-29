package main_task;

public class randomNumbers {
    public static void main(String[] args) {
        int min = 15;
        int max = 55;
        int count = Integer.parseInt(args[0]);
        for (int i = 0; i < count; i++) {
            int random_number = min + (int)(Math.random() * max);
            System.out.println(" "+ random_number);
        }
    }

}
