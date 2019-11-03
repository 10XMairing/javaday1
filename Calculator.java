public class Calculator {

    // this is a variable where the model name will be stored
    // the empty constructor will set this as unknown
    // while the 2nd constructor will set the model name as given args
    private String modelName;

    // this is the no args constructor
    // In case you dont create any constructor , a default constructor will be
    // created for you automatically. But in that case your `modelName` will be
    // `null`
    public Calculator() {
        this.modelName = "unknown";
    }

    // we can see that two constructors can co - exist: this is known as
    // `Constructor Overloading`

    // this is our custom constructor which takes a String argument and sets the
    // modelName of the Calculator
    // remember that if you create a custom Constructor , you will NOT be able to
    // use the Default Constructor eg : Calculator calc = new Calculator()
    // to be able to use it you will have to manually create a no arg constructor as
    // above
    public Calculator(String modelName) {
        this.modelName = modelName;
        // `this` is the context which refers to the current calling class.
        // here we are setting the modelName declared above `private String modelName;`
        // as the modelName given as argument in the constructor.
    }

    public void printModelName() {
        System.out.println("This calculator has model : " + this.modelName);
    }

    // add function will return an `int` data type after adding two numbers x and y
    public int add(int x, int y) {
        return x + y;
    }

    // sub function will return an `int` data type after subtracting two numbers x
    // and y
    public int sub(int x, int y) {
        return x - y;
    }
}