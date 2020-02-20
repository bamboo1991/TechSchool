import org.testng.annotations.BeforeTest;

public class SingletonObject {

    //  1- We want to create only one object other user can not create no more  than one object.
    //  2- you need to create one object private static and final
    // 3- you need to create constructor. this constructor needs to be private.

    private static final SingletonObject instance= new SingletonObject();
    private SingletonObject(){
    }
    public static SingletonObject getInstance(){
        return instance;

    }
public void displayMessage(){
    System.out.println("this is a message in display method");
}
    public static void main(String[] args) {
        SingletonObject object = SingletonObject.getInstance();
        object.displayMessage();
    }
}
