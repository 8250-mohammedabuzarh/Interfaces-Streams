package streamAPI;

@FunctionalInterface
public interface CustomInterface {
    void square(int a);
    default void print()
    {
        System.out.println("Hello");
    }
}
class implementation implements CustomInterface{
    public void square(int a)
    {
        System.out.println("Square of a number: "+a*a);
    }
    public static void main(String[] args) {
        implementation obj = new implementation();
        obj.square(5);
        obj.print();
    }
}
