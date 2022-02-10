package by.epam.jwd.task01;

public class Main {

    public static void main(String[] args) {
        TaskInput input = new TaskInput();
        TaskOutput output = new TaskOutput();

        // task1
        output.printBool(TaskLogic.compareNumsInNum(input.getIntFromConsole()));
        // task 5
        output.printThreeNums(TaskLogic.powDefineNums(input.getThreeNums()));
        // task 6
        output.printDouble(TaskLogic.sumOfMinAndMax(input.getThreeNums()));
        // task10
        output.printMatrix(TaskLogic.fillMatrix(input.getIntFromConsole()));

    }
}
