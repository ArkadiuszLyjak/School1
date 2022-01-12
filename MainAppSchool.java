package School;

public class MainAppSchool {
    public static void main(String[] args) {

        // TakeDataFromUser.takeStringFromIN();
        Pupil.createPupil();

        /*ClassRoom.printClassesNamesIDs();

        // można w konstr. wpisać dowolną klasę - w tej cwhili nie sprawdz.
        // czy jest ona poprawna - można to zrobić oczywiście ...

        Subjects[] subjects_pupil1 = new Subjects[3];
        subjects_pupil1[0] = Subjects.ETHIC;
        subjects_pupil1[1] = Subjects.GEOGRAPHY;
        subjects_pupil1[2] = Subjects.MATHEMATICS;

        Pupil pupil1 = new Pupil(
                "Pawel",
                "Gawlowski",
                12,
                "male",
                "1a",
                subjects_pupil1);

        pupil1.printPupil();

        // wyświetlanie ucznia -przy większej iliści uczniów mozńa
        // to inaczej zorganizować i ofkors pomysł jest można dorobić
        // mechaznim komunikacji z wejściem z konsoli

        Map<String, Subjects> teacher1Subjects = new LinkedHashMap<>();
        teacher1Subjects.put("1a", Subjects.MATHEMATICS);
        teacher1Subjects.put("1b", Subjects.MATHEMATICS);
        teacher1Subjects.put("1c", Subjects.MATHEMATICS);
        teacher1Subjects.put("2c", Subjects.GEOGRAPHY);

        Teacher teacher1 = new Teacher(
                "Maria",
                "Kwasik",
                55,
                "female",
                "2b",
                teacher1Subjects);

        teacher1.printTeacher();*/

    }
}
