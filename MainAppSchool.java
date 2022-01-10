package School;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainAppSchool {
    public static void main(String[] args) {
        System.out.println("Otwieramy szkołę specjalną im. Roberta z Sanoka.");

        ClassRoom.printClassesNamesIDs();

        // można w konstr. wpisać dowolną klasę - w tej cwhili nie sprawdz.
        // czy jest ona poprawna - można to zrobić oczywiście  ;-)
        Pupil pupil1 = new Pupil.PupilBuilder("1a", Subjects.subj)
                .name("Arek").age(42).surname("Lyjak").gender("male").build();

        // wyświetlanie ucznia - przy większej iliści uczniów mozńa
        // to inaczej zorganizować i ofkors pomysł jest
        Pupil.PrintPupil.printPupil(pupil1); // wyświetl ucznia

        // można dorobić mechaznim komunikacji z wejściem z konsoli
        Map<String, String> subj = new LinkedHashMap<>();
        subj.put("1a", Subjects.subj[0]);
        subj.put("1b", Subjects.subj[1]);
        Teacher teacher1 = new Teacher.TeacherBuilder("2e", subj)
                .name("Robertos").surname("Homikowski").age(59).gender("kosmita").build();

        Teacher.PrintTeacher.printTeacher(teacher1);

    }
}
