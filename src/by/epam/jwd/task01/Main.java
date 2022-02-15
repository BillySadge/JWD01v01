package by.epam.jwd.task01;

public class Main {

    public static void main(String[] args) {
        TaskInput input = new TaskInput();
        TaskOutput output = new TaskOutput();

        // task1
        output.printBool(TaskLogic.compareNumsInNum(input.readIntFromConsole()));
        // task 5
        output.printThreeNums(TaskLogic.powDefineNums(input.readThreeNums()));
        // task 6
        output.printDouble(TaskLogic.sumOfMinAndMax(input.readThreeNums()));
        // task10
        output.printMatrix(TaskLogic.fillMatrix(input.readIntFromConsole()));

    }
}
