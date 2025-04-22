package advanced0421;

public class PersonDTO {
    public String name;
    public int age ;
    public double height;
    public double weight;

    public PersonDTO( String name, int age, double height, double weight){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
        System.out.println("실행");
}

}

//public String model;
//public String color;
//
//public Phone(String model, String color) {
//    this.model = model;
//    this.color = color;
//    System.out.println("Phone(String model, String color) 생성자 실행");
//}