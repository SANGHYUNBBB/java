package advanced0421;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        StudentDTO st1 = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        StudentDTO st2 = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        StudentDTO st3 = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
//        System.out.println("이름: " + st1.name + " 나이: " + st1.age + " 키: " + st1.height + " 몸무게: " + st1.weight + " 학년: " + st1.grade + " 전공: " + st1.major);

        StudentDTO[] students = {st1, st2, st3};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 키: " + students[i].height + " 몸무게: " + students[i].weight + " 학년: " + students[i].grade + " 전공: " + students[i].major);
        }


    }}