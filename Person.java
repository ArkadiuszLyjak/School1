package School;

public abstract class Person {
    String name = "XXX";
    String surname = "YYY";
    int age = 999;
    String gender = "male/female";

    //region getters
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
    //endregion
}
