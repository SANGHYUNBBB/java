package Solve.lecture.ch11.sec02.exam03;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        String[] array = {"100", "1oo", null, "200"};
        for(int i=0; i<=array.length; i++) {

            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (NumberFormatException e) {
                System.out.println("형식이 숫자가 아님: "+ e);
            } catch( NullPointerException e ) {
                System.out.println("값이 null 입니다.: " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열의 범위를 초과했습니다.: " +e);
            }

        }

    }

}