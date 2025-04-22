package basic0421.ch07.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
// 자식 타입 객체 생성;
    Child child = new Child();
//  부모타입 -> child를 업케스팅 부모인데 애를 덮어씌움
    Parent parent = child;
    parent.method1();  // Parent-method1() 이거 실행
    parent.method2(); // Child-method2() 이거 실행
//    parent.method3();
}

}
