package by.epam.jwd.task01;

public class TaskOutput {

    public  void printMatrix(int[][] matrix){
        for(int[] row : matrix){
            for(int el : row){
                System.out.print(el+ " ");
            }
            System.out.println();
        }
    }

    public void printThreeNums(double[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.println((i + 1) + ".: " + nums[i]);
        }
    }

    public void printBool(boolean bool){
        System.out.println(bool);
    }

    public void printDouble(double num){
        System.out.println(num);
    }
}
