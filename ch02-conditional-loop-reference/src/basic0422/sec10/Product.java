package basic0422.sec10;

public abstract class Product {
    private int nonStaticField;
    private static int staticField;
    public Product() {

    }
    public abstract void abstMethod();
    public void nonStaticMethod(){
        System.out.println("추상 클래스 인데 ");
    }
    public static void staticMethod(){
        System.out.println("추상 클래스 인데 ");
    }
}
