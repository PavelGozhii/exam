package com.pavelgo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<SchoolChild> schoolChildList = new ArrayList<>();
        SchoolChild schoolChild = new SchoolChild("Гожий", "Павло", 20, "Чоловік", "11-Б", 11.2);
        System.out.println("Info about me " + schoolChild.getInfo());
        schoolChildList.add(schoolChild);
        School school = new School(schoolChildList, "Шевченка 1", "ЗОШ 4");
        System.out.println(school);
    }
}
