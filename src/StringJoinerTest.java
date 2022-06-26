import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        showJoinerName();
        addingPrefixSuffix();
        mergeTwoStringJoiner();
    }

    public static void showJoinerName() {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("A");
        stringJoiner.add("B");
        stringJoiner.add("C");
        System.out.printf(stringJoiner + "\n");
    }

    public static void addingPrefixSuffix() {
        StringJoiner stringJoiner = new StringJoiner(",", "[","]");
        stringJoiner.add("A");
        stringJoiner.add("B");
        stringJoiner.add("C");
        System.out.printf(stringJoiner + "\n");
    }

    public static void mergeTwoStringJoiner() {
        StringJoiner stringJoiner1 = new StringJoiner(",","{","]");
        stringJoiner1.add("A");
        stringJoiner1.add("B");
        stringJoiner1.add("C");

        StringJoiner stringJoiner2 = new StringJoiner(",", "[","]");
        stringJoiner2.add("1");
        stringJoiner2.add("2");
        stringJoiner2.add("3");

        StringJoiner merge = stringJoiner1.merge(stringJoiner2);
        System.out.printf(merge + "\n");
    }
}
