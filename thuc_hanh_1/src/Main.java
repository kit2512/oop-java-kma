import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
    }


    /// code các hàm khác dùng static
    static void bai_1() {
        System.out.println("Welcome to the world of Java");
    }

    static int bai_2() {
        return 1;
    }

    static void giai_pt_bac_hai() {
        int a, b, c;
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = inputScanner.nextInt();
        System.out.print("Nhap b: ");
        b = inputScanner.nextInt();
        System.out.print("Nhap c: ");
        c = inputScanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem duy nhat: " + (-c / b));
            }
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep: " + (-b / (2 * a)));
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet: " + ((-b + Math.sqrt(delta)) / (2 * a)) + " va " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }

    static void bai_3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    static void bai_5() {
        int sum = 0;
        for (int i=0; i<=7; i++) {
            int factorialSum = 1;
            for (int j = 1; j<=i; j++) {
                factorialSum *= j;
            }
            sum += factorialSum;
        }
        System.out.println(sum);
    }

    static void fibonanci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void bai_7() {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // bài 9 không rõ yêu ầu
    static void HCF(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("UCLN: " + a);
    }

    static void so_thuan_nghich(int n) {
        int temp = n, reverse = 0;
        while (n != 0) {
            reverse += n % 10;
            n /= 10;
        }
        if (temp == reverse) {
            System.out.println("So thuan nghich");
        } else {
            System.out.println("Khong phai so thuan nghich");
        }
    }

    static void thua_so_nguyen_to(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (count > 1) {
                    System.out.print(i + "^" + count);
                } else {
                    System.out.print(i);
                }
                if (n > i) {
                    System.out.print(" x ");
                }
            }
        }
        System.out.println();
    }

    static void swap(Integer[] arr, int i, int k) {

    }

    static void sinh_hoan_vi(int n) {
        Integer[] a = new Integer[n];
        for (int i=0; i<n; i++) a[i] = i + 1;

        while (true) {
            // print current configuration
            for (int k = n - 1; k >= 0; k --) {
                System.out.print(a[k]);
            }
            System.out.println();

            int i = n - 2;
            while (i > -1 && a[i] > a[i+1]) i--;
            if (i == -1) break;
            int k = n-1;
            while (a[k] < a[i]) {
                k--;
            }
            Integer tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;
            int q = n - 1;
            int p = i + 1;
            while (p < q) {
                Integer tmp2 = a[p];
                a[p] = a[q];
                a[q] = tmp2;
                p++; q--;
            }
        }
    }
}