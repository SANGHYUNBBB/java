package advanced.ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("입력 문자열: ");
            String str = sc.nextLine();
            System.out.print(str);

            if (str.equals("q")) {
                break;
            }


        }

        ;
        sc.close();
    }
}
