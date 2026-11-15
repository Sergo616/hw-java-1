package guru.qa;

public class HomeWork {

    public  static void main(String... args) {
        int intA = 7;
        int intB = 3;
        double doubleA = 6.5;
        double doubleB = 1.5;
        double result = (intA + intB) / doubleB;

        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        System.out.println(intA + intB);
        System.out.println(intA - intB);
        System.out.println(intA * intB);
        System.out.println(intA / intB);

        //применить несколько арифметических операций над int и double в одном выражении
        System.out.println((doubleA + doubleB) * 10);
        System.out.println((doubleA + doubleB) - (intA + intB));
        System.out.println(result);

        //применить несколько логических операций ( < , >, >=, <= )
        if (intA < intB) {
            System.out.println(intB);
        } else {
            System.out.println(intA);
        }

        if (intA == 7 && intB == 3) {
            System.out.println("well done");
        } else {
            System.out.println("fail");
        }

        String line = doubleA >= 6.5 ? "it's more or equal than 6.5" : "it's less than 6.5";
        System.out.println(line);

    }

}






