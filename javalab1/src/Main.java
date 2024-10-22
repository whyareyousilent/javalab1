import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення курсів
        Course math = new Course("Mathematics", 5);
        Course physics = new Course("Physics", 4);

        // Додавання курсів до списку
        List<Course> courses = new ArrayList<>();
        courses.add(math);
        courses.add(physics);

        // Створення студента за допомогою патерну Builder
        Student student = new Student.Builder()
                .setName("Ivan Ivanov")
                .setAge(20)
                .setCourses(courses)
                .build();

        // Виведення інформації про студента
        System.out.println(student);
    }
}
