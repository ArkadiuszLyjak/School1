package School;

public class Pupil extends Person {
    private final String classroom; // która klasa
    private final String[] subjects; // przedmioty ucznia

    //region Pupil
    public Pupil(PupilBuilder pupilBuilder) {
        classroom = pupilBuilder.classroom;
        subjects = pupilBuilder.subjects;

        name = pupilBuilder.name;
        surname = pupilBuilder.surname;
        age = pupilBuilder.age;
        gender = pupilBuilder.gender;
    }
    //endregion

    //region getters
    public String getClassroom() {
        return classroom;
    }

    public String[] getSubjects() {
        return subjects;
    }
    //endregion

    //region PupilBuilder
    static class PupilBuilder {
        private final String classroom;
        private final String[] subjects;

        // extends Person
        private String name;
        private String surname;
        private int age;
        private String gender;

        public PupilBuilder(String classroom, String[] subjects) {
            this.classroom = classroom;
            this.subjects = subjects;
        }

        public PupilBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PupilBuilder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public PupilBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PupilBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Pupil build() {
            return new Pupil(this);
        }

    }
    //endregion

    //region PrintPupil
    public static class PrintPupil {
        public static void printPupil(Pupil pupil) {
            System.out.println();
            System.out.print("Class: " + pupil.getClassroom() + "\n");
            System.out.print("Name: " + pupil.getName() + "\n");
            System.out.print("Surname: " + pupil.getSurname() + "\n");
            System.out.print("Age: " + pupil.getAge() + "\n");
            System.out.println("Gender: " + pupil.getGender());

        }
    }
    //endregion

}


