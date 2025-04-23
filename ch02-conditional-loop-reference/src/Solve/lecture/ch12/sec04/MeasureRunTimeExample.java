package Solve.lecture.ch12.sec04;

public class MeasureRunTimeExample {
static int Num = 0;


    public static void main(String[] args) {
        long time1 = System.nanoTime();
        for (int i= 0 ;i <=1000000; i= i+1){
            Num = Num+i;
        }
        long time2 = System.nanoTime();

        System.out.println("총합: "+Num +", 시작시간: "+ time1+", 종료시간: " +time2);
    }

}