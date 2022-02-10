package by.epam.jwd.task01;

public class TaskLogic {

    // task1
    public static boolean compareNumsInNum(int num){
        return (num / 1000 + num / 100 % 10 == num % 100 / 10 + num % 10);
    }
    // task 5
    public static double[] powDefineNums(double[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                nums[i] = Math.pow(nums[i],2);
            }else{
                nums[i] = Math.pow(nums[i],4);
            }
        }
        return nums;
    }
    // task 6
    public static double sumOfMinAndMax(double[] nums){
        return arrayMax(nums) + arrayMin(nums);
    }
    // task10
    public static int[][] fillMatrix(int n){
        int [][] matrix = new int[n][n];
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    matrix[i][j] = (j+1);
                }else{
                    matrix[i][j] = (n-j);
                }
            }
        }
        return matrix;
    }



    private static double arrayMax(double[] arr) {
        double max = arr[0];
        for(double cur: arr) {
            max = Math.max(max, cur);
        }
        return max;
    }
    private static double arrayMin(double[] arr) {
        double min = arr[0];
        for(double cur: arr) {
            min = Math.min(min, cur);
        }
        return min;
    }
}
