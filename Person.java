package School;

//import lombok.Data;

import lombok.Data;

/**
 * My <b>Person class</b>
 *
 * @author AL807S
 * @see Teacher
 * @see Pupil
 */

@Data
public abstract class Person {
    String name = "ENTERED_DEFAULT_NAME";         //TODO tak się nie inicjuje zmiennych  
    String surname = "ENTERED_DEFAULT_LASTNAME";  //TODO tak się nie inicjuje zmiennych 
    int age = 999; //TODO  Tak się nie inicjujej zmiennej . do usunięcia
    String gender = "CHOOSE: male/female";  //TODO Do zrobienia enum 

    /*//region getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    //endregion*/
}
