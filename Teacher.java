package School;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Teacher extends Person {
    private String supervisingTeacher; // name representing class
    private Map<String, String> subjectsTaught; // subjects taught and class

    //region Teacher
    public Teacher(TeacherBuilder teacherBuilder) {
        supervisingTeacher = teacherBuilder.supervisingTeacher;
        subjectsTaught = teacherBuilder.subjectsTaught;

        name = teacherBuilder.name;
        surname = teacherBuilder.surname;
        age = teacherBuilder.age;
        gender = teacherBuilder.gender;
    }
    //endregion

    //region getters
    public String getSupervisingTeacher() {
        return supervisingTeacher;
    }

    public Map<String, String> getSubjectsTaught() {
        return subjectsTaught;
    }
    //endregion

    //region printSubjectsTaught
    private void printSubjectsTaught() { // wyświetla tylko value!

        /*Stream<String> stream = subjectsTaught.values().stream();
        stream.forEach((value) -> {
            System.out.print(value + " ");
        });*/

        Set<Map.Entry<String, String>> entries = subjectsTaught.entrySet();
        Iterator<Map.Entry<String, String>> iterator =
                entries.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.print("Class: " + key + " ");
            System.out.println("Subject taught: " + value);

        }
    }
    //endregion

    //region TeacherBuilder
    static class TeacherBuilder {
        private final String supervisingTeacher;
        private final Map<String, String> subjectsTaught;

        // extends Person
        private String name;
        private String surname;
        private int age;
        private String gender;

        public TeacherBuilder(String supervisingTeacher, Map<String, String> subjectsTaught) {
            this.supervisingTeacher = supervisingTeacher;
            this.subjectsTaught = subjectsTaught;
        }

        public TeacherBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TeacherBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public TeacherBuilder age(int age) {
            this.age = age;
            return this;
        }

        public TeacherBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }
    //endregion

    //region PrintTeacher
    public static class PrintTeacher {
        public static void printTeacher(Teacher teacher) {
            System.out.println();
            System.out.print("Supervising: " + teacher.getSupervisingTeacher() + "\n");
            teacher.printSubjectsTaught();
            System.out.print("Name: " + teacher.getName() + "\n");
            System.out.print("Surname: " + teacher.getSurname() + "\n");
            System.out.print("Age: " + teacher.getAge() + "\n");
            System.out.println("Gender: " + teacher.getGender());

        }
    }
    //endregion
}


