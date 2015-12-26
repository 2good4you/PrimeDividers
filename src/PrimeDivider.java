import java.util.Scanner;

class PrimeDivider {
    public static int isPrime(int n) {

        for ( int i = 2; i <= Math.sqrt(n); i++ ) {
            if ( n % i == 0 ) {
                return 0;
            }
        }

        return 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(1);
        for ( int i = 2; i <= number/2; i++) {
            if ( isPrime(i) == 1 && number % i == 0 ) {
                System.out.println(i);
            }
        }
        System.out.println(number);

    }
}

