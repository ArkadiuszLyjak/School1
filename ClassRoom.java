package School;

public class ClassRoom {

    public static int numOFClasses;
    public static char[] classCountIDs = {'1', '2', '3'}; // modifiable
    public static char[] classNameIDs = {'a', 'b', 'c', 'd'}; // modifiable
    public static int sizeClassRooms = Math.multiplyExact(
            classCountIDs.length,
            classNameIDs.length);

    // przechowujemy nazwy klas np. 1a, 2b itp
    public static String[] classRooms = new String[sizeClassRooms];

    // Tworzymy stringi opisujące klasy szkolne i przekazujemy to
    // do zmiennej classRooms j.w
    //region static
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
    public static void printClassesNamesIDs() {
        int order = 1;

        System.out.println("\nThe names of the classes in the school mr Director:\n");

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
