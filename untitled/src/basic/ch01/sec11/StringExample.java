package basic.ch02.sec11;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
// "따옴표 표시, ' 얘도 가능
        String str = "나는 \" 자바\" 를 배웁니다. ";
        System.out.println("str = "+ str);
// 탭
        str = "나는 \t 자바\t 를 배웁니다.";
        System.out.println("str = "+ str);
        //줄바꿈
        str = "나는 \n 자바\n 를 배웁니다.";
        System.out.println("str = "+ str);
    }
}


