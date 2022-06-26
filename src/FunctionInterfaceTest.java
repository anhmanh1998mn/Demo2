public class FunctionInterfaceTest {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello();
    }

    static class Hello implements ISayHelloInterface {

        @Override
        public void sayHello() {
            System.out.printf("Xin chao Ha Noi");
        }
    }

    @FunctionalInterface
    interface ISayHelloInterface {
        public void sayHello();
    }
}
