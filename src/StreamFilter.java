import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    static class Student {
        String studentName;

        String studentAddress;

        public Student(String name, String address) {
            this.studentName = name;
            this.studentAddress = address;
        }
    }

    public static void main(String[] args) {
        List<Student> listStudent = processListStudent().stream().filter(student -> student.studentAddress.toLowerCase().contains("ha noi")).collect(Collectors.toList());
        for (Student student: listStudent) {
            System.out.printf(student.studentName +"\n");
        }

    }

    public static ArrayList<Student> processListStudent() {
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Nguyen Van A","Ha Noi"));
        listStudent.add(new Student("Nguyen Van B","Ha Noi"));
        listStudent.add(new Student("Nguyen Van V","Nam Dinh"));
        return listStudent;
    }
}
