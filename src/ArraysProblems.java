import java.util.Scanner;

public class ArraysProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integers to find Min or max");
        String[] inputElements = sc.nextLine().split(" ");
        System.out.println(FindMaxOrMin.findMinOrMaxWithJavaEight(true, inputElements));
        System.out.println(FindMaxOrMin.findMinOrMax(false, inputElements));
    }

}
