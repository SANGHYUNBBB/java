package advanced0421;

public class EmployeeDTO extends PersonDTO {

        public int salary;
        public String dept;
        public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
            super(name, age, height, weight);
            this.salary =salary;
            this.dept = dept;
            System.out.println("새로 호출!");

        }

    }
