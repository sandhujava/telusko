import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //practice basic refreshing java
        //array
        int[] arr = new int[4];
        arr[0]=2;
        arr[1]=5;
        arr[2]=6;
        arr[3]=2;
        System.out.println(arr[0]);
        for (int a:arr ) {
            System.out.println(a);
        }

        //multi- array
        System.out.println("This is multi array");
        int [] []multi_arr = new int[2][2];
        multi_arr[0][0]=5;
        multi_arr[0][1]=56;
        multi_arr[1][0]=5;
        multi_arr[1][1]=51;
        for (int[] a :multi_arr) {
            for (int val:a) {
                System.out.print(val+ " ");

            }
            System.out.println();
        }

        System.out.println("\nThis is math random");
        Double doub =Math.random();
        System.out.println(doub);
        factorialClaculation fc = new factorialClaculation();
        System.out.println("This is factorial\n Pas the number you want factorial for");
        Scanner scanner = new Scanner(System.in);
        int fact_num=scanner.nextInt();
        System.out.println(fc.factorial(fact_num));

    }
}