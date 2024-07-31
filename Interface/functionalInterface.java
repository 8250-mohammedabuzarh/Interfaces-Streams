package Interface;
@FunctionalInterface
public interface functionalInterface {
    void display();
    //void show();
}
 class implementation implements functionalInterface{
    public void display()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        implementation obj = new implementation();
        obj.display();
    }
}
