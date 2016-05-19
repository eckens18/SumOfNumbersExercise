import java.util.Scanner;

/**
 * Created by derekeckenroad on 5/19/16.
 */
public class SumOfNumbers {

    static void sumOfN(int factor) {
        int f = 1;
        for (int i = 1; i <= factor; i++) {
            f += i;
        }
        System.out.println("your result is: "+f);
    }

    public static void promptUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
    }

    public static void engine(){
        promptUser();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sumOfN(x);

    }
    public static void main(String[] args) {
        engine();
    }

}
