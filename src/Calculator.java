package src;


//The provided code is a simple Java program that defines a Calculator class with methods for performing basic arithmetic operations such as addition, subtraction, multiplication, division, and modulo. Here's a breakdown of the code:
public class Calculator {

    // empty constructor called Calculator

    public Calculator() {


    }

//    The add() method should accept two int parameters. For example

    public int add(int a, int b) {

        return a + b;


    }


    public int subtract(int a, int b) {


        return a - b;


    }

    public int multiply(int a, int b) {


        return a * b;


    }

    public int divide(int a, int b) {


        return a / b;


    }

    public int modulo(int a, int b) {


        return a % b;


    }


    public static void main(String[] args) {

        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5, 7));

        System.out.println((myCalculator.subtract(45, 11)));

    }


}
