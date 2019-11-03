public class Main {
    public static void main(String args[]) {
        System.out.println("This is my main function! ");

        // to print a number
        System.out.println("This is my main function! " + 2);

        // the `+` concats a varible to the string

        // to print a variable
        int num = 100;
        System.out.println("This is my main function! " + num);

        // this will create an calculator object call "using an empty constructor" . In
        // our empty constructor we set the model name as 'unknown' so this `calc`
        // object will
        // have its model name set as unknown
        Calculator calc = new Calculator();
        calc.printModelName();

        // this will call the second Calculator `constructor` which will set the model
        // name as the the argument in the constructor : Here `casio`
        Calculator calc2 = new Calculator("Casio");
        calc2.printModelName();

        // to use a function in an object use `objname.functionName()`
        // eg
        System.out.println("Sum of 2 and 3  is  -> " + calc.add(2, 3));

        System.out.println("sub of 2 and 3  is  -> " + calc.sub(2, 3));

    }
}