// Generic class definition
class GenericClass<T> {
    private T data;   // Declare a variable of type T

    // Constructor
    public GenericClass(T data) {
        this.data = data;
    }

    // Getter method
    public T getData() {
        return data;
    }

    // Setter method
    public void setData(T data) {
        this.data = data;
    }

    // Display method
    public void showType() {
        System.out.println("Type of T is: " + data.getClass().getName());
    }
}

// Main class to test generics
public class Generic {
    public static void main(String[] args) {
        // Creating generic objects of different data types

        GenericClass<Integer> intObj = new GenericClass<>(100);
        intObj.showType();
        System.out.println("Value: " + intObj.getData());

        System.out.println();

        GenericClass<String> strObj = new GenericClass<>("Hello Generics");
        strObj.showType();
        System.out.println("Value: " + strObj.getData());

        System.out.println();

        GenericClass<Double> doubleObj = new GenericClass<>(45.67);
        doubleObj.showType();
        System.out.println("Value: " + doubleObj.getData());
    }
}
