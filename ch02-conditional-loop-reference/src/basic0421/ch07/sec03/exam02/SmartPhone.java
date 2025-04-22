package basic0421.ch07.sec03.exam02;

public class SmartPhone extends Phone{
//    public SmartPhone(){}
//            super();

//  부모의 생성자로 기본생성자를 호출 할 수 없음. 왜냐면 super() 이게 기본 생성자니까!!!!!!!!!!!


    public SmartPhone(String model, String color){
//        자식생성자에서는 부모 생성자를 무조건 호출
//        부모 필드를 호출하려면, 부모 생성자가 그 필드를 매개변수로 받아야하고
//        자식 생성자에서 "super(필드에 대한 값)" 을 호출해야함;
        super(model,color);
System.out.println("SmartPhone 생성자 호출됨");    }

//    
//   메소드 재정의(Overriding)
//   부모가 가지는 메소드 선언부를 그대로 사용하면서
//   자식 클래스에서 정의한 메소드대로 동작하도록 다시 작성
//   오버라이딩의 성립요건
//   -메소드 이름 동일, return 타입 동일, 매개변수의 타입, 갯수, 순서 동일;


    @Override //컴파일시 정확히 오버라이딩 되었는디 체크해줌.
    public void printModel() {
        super.printModel();
    }
}
