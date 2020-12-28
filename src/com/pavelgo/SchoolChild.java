package com.pavelgo;

/**
 * Класс школяра, є дочірнім класом людини
 */
public class SchoolChild extends Human {

    /**
     * Класс
     */
    private String clazz;

    /**
     * Середній рейтинг
     */
    private double averageRating;

    /**
     * Конструтор створення школяра без вказання атрибутів людини
     *
     * @param clazz         клас
     * @param averageRating середній рейтинг
     */
    public SchoolChild(String clazz, double averageRating) {
        this.clazz = clazz;
        this.averageRating = averageRating;
    }

    /**
     * Конструктор створення школяра з усіма атрибутами
     *
     * @param firstName     прізвище
     * @param lastName      ім'я
     * @param age           вік
     * @param gender        стать
     * @param clazz         клас
     * @param averageRating середній рейтинг
     */
    public SchoolChild(String firstName, String lastName, int age, String gender, String clazz, double averageRating) {
        super(firstName, lastName, age, gender);
        this.clazz = clazz;
        this.averageRating = averageRating;
    }

    public SchoolChild() {

    }

    /**
     * Get info about schoolchild class
     *
     * @return class
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Set info abount schoolchild class
     *
     * @param clazz - new class for schoolchild
     */
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    /**
     * @return average rating of student
     */
    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    /**
     * Метод, що повертає інформацію про школяра
     *
     * @return інформація про школяра
     */
    public String getInfo() {
        return "SchoolChild: " +
                "firstName: " + getFirstName() +
                ", lastName: " + getLastName() +
                ", age: " + getAge() +
                ", gender: " + getGender() +
                ", class: " + getClazz() +
                ", averageRating: " + getAverageRating() + ".";
    }




}

