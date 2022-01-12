package School;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * My <b>Teacher class</b>
 *
 * @author AL807S
 * @see Person
 * @see Pupil
 */

public class Teacher extends Person {
    private String supervisingTeacher; // name representing class
    private Map<String, Subjects> subjectsTaught; // subjects taught and class


    /**
     * All fields are required.
     *
     * @param value for doubling.
     * @return Teacher instance.
     */

    //region Teacher - constructor
    public Teacher(String name, String surname, int age, String gender,
                   String supervisingTeacher, Map<String, Subjects> subjectsTaught) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.supervisingTeacher = supervisingTeacher;
        this.subjectsTaught = subjectsTaught;
    }
    //endregion

    //region getters
    public String getSupervisingTeacher() {
        return supervisingTeacher;
    }

    public Map<String, Subjects> getSubjectsTaught() {
        return subjectsTaught;
    }
    //endregion

    //region printTeacher
    public void printTeacher() {
        System.out.println("\n------------- teacher database -------------");
        System.out.print(this.getName() + " ");
        System.out.print(this.getSurname() + ", ");
        System.out.print(this.getAge() + "yo, ");
        System.out.print(this.getGender());

        System.out.println();

        this.printSubjectsTaught();

    }
    //endregion

    //region printSubjectsTaught
    private void printSubjectsTaught() {

        Set<Map.Entry<String, Subjects>> entries = subjectsTaught.entrySet();
        Iterator<Map.Entry<String, Subjects>> iterator = entries.iterator();

        System.out.println("Classroom / Subject thought: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Subjects> entry = iterator.next();
            String key = entry.getKey();
            Subjects value = entry.getValue();

            System.out.print("Class: " + key + " ");
            System.out.println("Subject taught: " + value);

        }
    }
    //endregion

}


