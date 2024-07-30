package app;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {


    public static void main(String[] args) {

        MathOperation operationMath1=new MathOperation() {
            @Override
            public int keepNum(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println("1) Summ result :" +operationMath1.keepNum(3,4));
       /* num1=78;
        num2=95;
        operationMath = (num1, num2) -> (num1 + num2);
        res = operationMath.keepNum(num1, num2);
        System.out.println("1) Lambda-sum :" + res);*/
   //=================================================
      StringManipulator upperWordReg=word -> word.toUpperCase();
        System.out.println("2) Word Upper Register :"+upperWordReg.keepString("I am happy"));
   //==================================================
        Function<String, Integer> countUppercaseFunc = StringListProcessor::countUppercase;
        System.out.println("3) Uppercase count: " + countUppercaseFunc.apply("I AM HAPPY"));
     //==================================================
        // Використання Supplier для генерації випадкового числа
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("4) Random number: " + randomSupplier.get());

    }

}

