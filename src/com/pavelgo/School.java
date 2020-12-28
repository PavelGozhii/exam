package com.pavelgo;

import java.util.List;

/**
 * Клас школи, що містить набір школярів, адрес і назву
 */
public class School {

    /**
     * Список всіх школярів, що навчаються в цій школі
     */
    private List<SchoolChild> schoolChildren;

    /**
     * Адресс школи
     */
    private String address;

    /**
     * Назва школи школи
     */
    private String name;

    /**
     * Конструктор нової школи
     *
     * @param schoolChildren - список школярів школи
     * @param address        - адрес
     * @param name           - назва
     */
    public School(List<SchoolChild> schoolChildren, String address, String name) {
        this.schoolChildren = schoolChildren;
        this.address = address;
        this.name = name;
    }

    /**
     * Стврорення нової школи
     *
     * @param address - адрес
     * @param name    - назва
     */
    public School(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public School() {
    }


    public List<SchoolChild> getSchoolChildren() {
        return schoolChildren;
    }

    public void setSchoolChildren(List<SchoolChild> schoolChildren) {
        this.schoolChildren = schoolChildren;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolChildren=" + schoolChildren +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
