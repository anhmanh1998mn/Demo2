public class ReferencesMethod {
    public static void main(String[] args) {
        ISayHelloInterface hello = Hello::showHello;
        hello.sayHello();
    }

    static class Hello {
        public static void showHello() {
            System.out.printf("Xin chao Ha Noi");
        }
    }

    interface ISayHelloInterface{
        void sayHello();
    }
}

