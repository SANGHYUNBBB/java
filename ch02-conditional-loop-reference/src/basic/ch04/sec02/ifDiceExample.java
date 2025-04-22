package basic.ch04.sec02;

import java.util.Random;



public class ifDiceExample
{public static void main (String[] args){
//    1~6사이의 값을 랜덤
//    Math.random : 0.0 ~ 1.0 미만 난수변환 (double);
    int num = (int)(Math.random()*6) + 1;
    Random rand = new Random();
//    bound 0~인자로 준 값

//    num = rand.nextInt(bound:6)+1;
    if (num==1) {
        System.out.println("1이 나왔다.");
    }                    else if (num==2) {System.out.println("2가 나왔다.");}
    else if (num==3) {System.out.println("3가 나왔다.");}
    else if (num==4) {System.out.println("4가 나왔다.");}
    else if (num==5) {System.out.println("5가 나왔다.");}
    else  {System.out.println("6가 나왔다.");}
   }
}
