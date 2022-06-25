public class LambdaExpression {
    public static void main(String[] args) {
        System.out.printf(showHello());
        System.out.printf(showResultAddNumber());
    }

    public static String showHello() {
        IHelloInterface hello = (name) -> {
            return "Hello " + name;
        };
        return hello.sayHello("Ha Noi");
    }

    public static String showResultAddNumber() {
        IAddNumberInterface addNumberInterface = (numberA, numberB) -> {
            return (numberA + numberB);
        };
        return "\nResult: " +addNumberInterface.addNumber(1,2);
    }

    @FunctionalInterface
    interface IHelloInterface {
        public String sayHello(String name);
    }

    @FunctionalInterface
    interface IAddNumberInterface {
        public int addNumber(int numberA, int numberB);
    }
}


