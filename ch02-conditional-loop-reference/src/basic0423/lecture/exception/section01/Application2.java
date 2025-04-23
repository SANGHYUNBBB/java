package basic0423.lecture.exception.section01;

import java.util.Scanner;


public class Application2 {
    public static void main(String[] args){
        ExceptionTest et  = new ExceptionTest();
Scanner sc = new Scanner(System.in);


        System.out.println("물건의 가격을 입력해주세요");
        int price = sc.nextInt();
        System.out.println("지금 돈");
        int money= sc.nextInt();
try {
    et.checkEnoughMoney(price,money);
    System.out.println("상품 구입 가능");
} catch (Exception e) {
    System.out.println("상품 구입 불가능");
//예외 처리 구문과 상관없이 반드시 수행해야 하는 경우 작성
// 일반적으로 자원 반납시 많이 사용함;
    
} finally {
    sc.close();
}
    }
}
