package School;

/**
 * <p>School classes are made up of a combination of the <tt>numbers<tt/> representing
 * those classes and the <tt>letters</tt>.</br></p>
 * @author AL807S
 * @see Teacher
 */

// TODO to za klasa i Kontrukcja.....Klasa ClassRoom mam byc encją a kreowanie jej z ajkiś
// przypsanych ciąfów metodamy w niej zawartymi to jest słabe
// todo generalnie do wyrzucenia:(

public class ClassRoom {

    public static int numOFClasses;
    public static char[] classCountIDs = {'1', '2', '3'}; // modifiable
    public static char[] classNameIDs = {'a', 'b', 'c', 'd'}; // modifiable
    public static int sizeClassRooms = Math.multiplyExact(
            classCountIDs.length,
            classNameIDs.length);

    // przechowujemy nazwy klas np. 1a, 2b itp
    public static String[] classRooms = new String[sizeClassRooms];

    //region static block // >> TODO   to mam byc fabryka to jest do bani

    static {
        int order = 0;

        //region try
        try {
            for (Character i : classCountIDs) {
                for (Character j : classNameIDs) {
                    StringBuilder sb = new StringBuilder();
                    classRooms[order] = sb.append(i).append(j).toString();
                    order++;

                    if (order > classRooms.length)
                        throw new MyOwnException("Coś nie pykło Szefie ...");
                }
            }
        } catch (MyOwnException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //endregion
    }
    //endregion

    // display class names in school
    //region printClassesNamesIDs
    public static void printClassesNamesIDs() {   //TODO  do usunięcia calssRoom jest encją
        int order = 1;

        System.out.println("The names of the classes in the school:\n");

        for (String s : ClassRoom.classRooms) {
            System.out.print(s + " ");
            if ((order % classNameIDs.length) == 0)
                System.out.println();
            ++order;
        }

        System.out.println("\nThere are " + getClassRoomsSize() + " classes in the school.");
    }
    //endregion

    // display the number of classes in the school
    //region Description
    public static int getClassRoomsSize() {
        return sizeClassRooms;
    }
    //endregion

    //region MyOwnException
    static class MyOwnException extends Exception {
        private final String message;

        MyOwnException(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

    }
    //endregion
}
