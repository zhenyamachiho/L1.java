import java.util.Scanner;
public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        char operation = scanner.next().charAt(0);

        int res = 0;

        switch (operation){
            case '+':
                res = num1+num2;
                break;
            case '-':
                res = num1-num2;
                break;
            case '*':
                res = num1*num2;
                break;
            case '/':
                res = num1/num2;
                break;
            default:
                break;
        }

    System.out.println(res);

    }
}
