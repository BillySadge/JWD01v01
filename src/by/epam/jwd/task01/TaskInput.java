package by.epam.jwd.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskInput {


    public int readIntFromConsole(){
        Scanner scanner = new Scanner(System.in);
        int value;
        while (true) {
            try {
                value = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                throw new RuntimeException("input time must be  INTEGER");
            }

        }
        return value;
    }

    public double readDoubleFromConsole(){
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            try {
                value = scanner.nextDouble();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                throw new RuntimeException("input time must be  Double");
            }

        }
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
