//Static block → Main method → Constructor.

//Concept: Demonstrates how Java executes from class loading to object creation.

public class LifecycleOfProgram {

    private static int counter = 0;
    static {
        System.out.println("Hello from static block");
        System.out.println("Class Loaded and Static Block Executed!");

    }
    public LifecycleOfProgram(){
        System.out.println("Hello from constructor " + (counter+1));

        counter++;
    }
    public static void main(String[] args) {
        LifecycleOfProgram obj = new LifecycleOfProgram();

        System.out.println("Hello from main method");

        LifecycleOfProgram obj1 = new LifecycleOfProgram();
    }
}
