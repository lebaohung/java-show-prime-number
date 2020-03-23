import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many prime number you want to show: ");
        int number = scanner.nextInt();
        if (number >= 0) {
            switch (number) {
                case 1:
                    System.out.println("The first prime number is 2");
                    break;
                default:
                    int count = 1;
                    int n = 3;
                    String result = "The first " + number + " prime number is 2 ";
                    while (count < number) {
                        if (isPrimeNumber(n)) {
                            result = result + n + " ";
                            count ++;
                        }
                        n += 2;
                    }
                    System.out.println(result);
            }
        } else {
            System.out.println(number + ": Invalid input! Please enter again");
            main(args);
        }
    }
    public static boolean isPrimeNumber(int x) {
        for (int i = 3; i < Math.sqrt(x); i +=2) {
            if ( x % i == 0 ) return false;
        }
        return true;
    }
}
