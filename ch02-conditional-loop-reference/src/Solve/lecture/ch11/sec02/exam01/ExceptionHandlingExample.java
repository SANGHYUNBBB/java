package Solve.lecture.ch11.sec02.exam01;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for(int i=0; i<=array.length; i++) {

            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아님: " + e);
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("배열의 범위를 넘어섬: " + e);
            }

        }

    }

}