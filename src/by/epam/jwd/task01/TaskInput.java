package by.epam.jwd.task01;

import java.util.Scanner;

public class TaskInput {

    public int readIntFromConsole(){
        @SuppressWarnings("resources")
        Scanner scanner = new Scanner(System.in);
        int value;
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. ");
        }
        value = scanner.nextInt();

        return value;
    }

    public double readDoubleFromConsole(){
        @SuppressWarnings("resources")
        Scanner scanner = new Scanner(System.in);
        double value;
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. ");
        }
        value = scanner.nextDouble();

        return value;
    }

    public double[] readThreeNums(){
        double [] nums = new double[3];
        nums[0] = readDoubleFromConsole();
        nums[1] = readDoubleFromConsole();
        nums[2] = readDoubleFromConsole();
        return nums;
    }
}
