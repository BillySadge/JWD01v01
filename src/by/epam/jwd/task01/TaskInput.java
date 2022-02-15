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

    public double[] readThreeNums(){
        Scanner scanner = new Scanner(System.in);
        double [] nums = new double[3];
        nums[0] = scanner.nextDouble();
        nums[1] = scanner.nextDouble();
        nums[2] = scanner.nextDouble();
        return nums;
    }
}
