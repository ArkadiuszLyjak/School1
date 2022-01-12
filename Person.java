package School;

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
    String name = "ENTERED_DEFAULT_NAME";
    String surname = "ENTERED_DEFAULT_LASTNAME";
    int age = 999;
    String gender = "CHOOSE: male/female";

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
