import java.util.ArrayList;
import java.util.List;

public class CollectorsTest {
    public static void main(String[] args) {
        ArrayList<StreamFilterAndForEachTest.Student> listStudent = StreamFilterAndForEachTest.processListStudent();
        List<String> listStudentMap = listStudent.stream().map(student -> student.studentName).collect(java.util.stream.Collectors.toList());
        listStudentMap.forEach(System.out::println);

        Long sumStudent = listStudent.stream().map(student -> student.studentName).collect(java.util.stream.Collectors.counting());
        System.out.printf("Total Student: " + sumStudent);
    }
}
