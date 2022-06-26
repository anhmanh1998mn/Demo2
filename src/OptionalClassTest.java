import java.util.Optional;

public class OptionalClassTest {
    public static void main(String[] args) {
        processResult();
    }

    public static void processResult() {
        String[] listData = new String[10];
        Optional<String> optional = Optional.ofNullable(listData[2]);
        String result = optional.isPresent() ? listData[2] : "String value is not present";
        System.out.printf(result);
    }
}
