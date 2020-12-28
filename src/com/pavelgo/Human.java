package com.pavelgo;

/**
 * Класс людини
 *
 * @author PavelGozhii
 */
public class Human {

    /**
     * Прізвище
     */
    private String firstName;

    /**
     * Ім'я
     */
    private String lastName;

    /**
     * Вік
     */
    private int age;

    /**
     * Стать
     */
    private String gender;

    /**
     * Створює нову людину
     */
    public Human() {

    }

    /**
     * Створює нову людину
     *
     * @param firstName - прізвище
     * @param lastName  - ім'я
     * @param age       - вік
     */
    public Human(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
