package School;

/**
 * My <b>Pupil class</b>
 *
 * @author AL807S
 * @see Person
 * @see Teacher
 */

public class Pupil extends Person {
    private final String classroom; // która klasa
    private final Subjects[] subjects; // przedmioty ucznia

    /**
     * All constructor fields are required.
     *
     * @return Pupil instance.
     */

    //region Pupil - constructor
    public Pupil(String name, String surname, int age, String gender,
                 String classroom, Subjects[] subjects) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.classroom = classroom;
        this.subjects = subjects;
    }
    //endregion

    /**
     * A static method that creates an instance of the class.
     *
     * @return Pupil instance.
     */

    //region createPupil with specjalised method
    public static String /*Pupil*/ createPupil() {
        System.out.print("Wpisz kolejno oddzielone przecinkiem:\nimię, nazwisko, wiek, płeć\n");
        // String s = TakeDataFromUser.takeStringFromIN();
        String s = "   Arkad iusz,  Lyjak,42,male ";
        String trimmed = s.trim().replaceAll(" ", "");

        try {
            String[] str_splitted = trimmed.split("[ ,.]|\\s");
            String name = str_splitted[0];
            String surname = str_splitted[1];
            int age = Integer.parseInt(str_splitted[2]);
            String gender = str_splitted[3];

            System.out.print("Wprowadziłeś: ");
            for (String str : str_splitted)
                System.out.print(str + " ");

            System.out.println("\n\nWprowadz klasę ze zbioru poniżej: ");
            ClassRoom.printClassesNamesIDs();

            boolean kreciolek = false;

            do {
                String classroom = TakeDataFromUser.takeStringFromIN();
                for (String s2 : ClassRoom.classRooms) {
                    if (classroom.equalsIgnoreCase(s2)) {
                        kreciolek = true;
                        break;
                    } else System.out.println("Nie ma takiej klasy matole!");
                }
            } while (!kreciolek);

            System.out.println("Wybierz przedmioty: ");
            for (Subjects subjects : Subjects.values())
                System.out.println(subjects);

            // String classroom = TakeDataFromUser.takeStringFromIN();

        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return s;
    }
    //endregion

    public String getClassroom() {
        return classroom;
    }

    public Subjects[] getSubjects() {
        return subjects;
    }

    //region printPupil
    public void printPupil() {
        System.out.println("\n------------- pupil database -------------");
        System.out.print(this.getName() + " ");
        System.out.print(this.getSurname() + ", ");
        System.out.print(this.getAge() + ", ");
        System.out.println(this.getGender());

        this.printClassroom();
    }
    //endregion

    //region printClassroom
    private void printClassroom() {
        System.out.print("Classroom: " + this.getClassroom() + "\n");
        System.out.print("Subjects: \n");

        for (Subjects s : subjects) {
            System.out.println("Ordinal: " + s.ordinal() + " - " + s + "\t(LEVEL: " + s.getLevel() + ")");
        }
    }
    //endregion


}


