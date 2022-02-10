package by.epam.jwd.task01;

import java.util.Scanner;

public class TaskInput {


    public int getIntFromConsole(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public double[] getThreeNums(){
        Scanner scanner = new Scanner(System.in);
        double [] nums = new double[3];
        nums[0] = scanner.nextDouble();
        nums[1] = scanner.nextDouble();
        nums[2] = scanner.nextDouble();
        return nums;
    }
}
