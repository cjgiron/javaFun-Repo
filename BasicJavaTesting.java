
import java.util.ArrayList;
public class BasicJavaTesting {

    public static void main(String[] args) {
        BasicJava javaExercises = new BasicJava();

        // javaExercises.printNums(255);
        // javaExercises.printOdds(255);
        // javaExercises.printSums(255);

        // ***********************************

        // int[] arr = {1,3,5,7,9,13};
        // javaExercises.iterateThroughArray(arr);

        // ***********************************

        // int[] arr2 = {-3,-5,-7};
        // Integer max = javaExercises.printMax(arr2);
        // System.out.println(max); // -3

        // ***********************************

        // int[] arr3 = {-4,7,20};
        // Integer avg = javaExercises.printAvg(arr3);
        // System.out.println(avg); // 7

        // ***********************************

        // ArrayList<Integer> y = javaExercises.printOddsArr(255);
        // System.out.println(y);

        // ***********************************
        // int[] arr4 = {1,3,5,7};
        // int y = 3;
        // Integer nums = javaExercises.printNumsGreaterThanY(arr4, y);
        // System.out.println(nums);


        // ***********************************

        // ArrayList<Integer> arr5 = new ArrayList<Integer>();
        // arr5.add(1);
        // arr5.add(5);
        // arr5.add(10);
        // arr5.add(-2);
        // ArrayList<Integer> squares = javaExercises.printSquares(arr5);
        // System.out.println(squares);

        // ***********************************

        // ArrayList<Integer> arr6 = new ArrayList<Integer>();
        // arr6.add(1);
        // arr6.add(5);
        // arr6.add(10);
        // arr6.add(-2);
        // ArrayList<Integer> positives = javaExercises.eliminateNegatives(arr6);
        // System.out.println(positives);

        // **************** HELP *******************

        // int[] arr7 = {1, 5, 10, -2};
        // ArrayList<Integer> results = javaExercises.maxMinAvg(arr7);
        // System.out.println(results);

        // ***********************************

        ArrayList<Integer> arr8 = new ArrayList<Integer>();
        arr8.add(1);
        arr8.add(5);
        arr8.add(10);
        arr8.add(7);
        arr8.add(-2);
        ArrayList<Integer> shifted = javaExercises.shiftValues(arr8);
        System.out.println(shifted);
    
    }
}