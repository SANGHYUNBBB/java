package basic0423.lecture.exception.section01;

public class Application {
    public static void main(String[] args){
        ExceptionTest et  = new ExceptionTest();

//
//        예외 처리 방법
//        -> try-catch 처리
//        ;
        try {
            et.checkEnoughMoney(1000,10000);
            System.out.println(" 상품구입가능!");
        } catch (Exception e) {
            System.out.println(" 상품구입불가능ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ");
        }
        System.out.println("프로그램 종료!");
    }
}
