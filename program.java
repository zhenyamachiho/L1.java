import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long sumN = 0;
        long productN = 1;

        for (int i = 1; i < n + 1; i++) {
            sumN = sumN + i;
            productN = productN * i;
        }

        System.out.println(sumN);
        System.out.println(productN);
    }
}