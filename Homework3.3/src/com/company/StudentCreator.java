package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.company.Main.getDisciplinesByNames;

public class StudentCreator {
    public List<Discipline> disciplines;

    public List<Student> create() {
        List<Student> students = new ArrayList<>();

        Student alex = new Student();
        alex.setName("Alex");
        alex.setSource(3);

        List<Discipline> alexDisciplineList = getDisciplinesByNames(
                disciplines,
                Arrays.asList("Math", "Biology")
        );
        alex.setDisciplines(alexDisciplineList);
        students.add(alex);

        //////////////

        Student mary = new Student();
        mary.setName("Mary");
        mary.setSource(1);

        List<Discipline> maryDisciplineList = getDisciplinesByNames(
                disciplines,
                Arrays.asList("Art")
        );
        mary.setDisciplines(maryDisciplineList);
        students.add(mary);

        ////////////////

        Student sam = new Student();
        sam.setName("Sam");
        sam.setSource(6);

        List<Discipline> samDisciplineList = getDisciplinesByNames(
                disciplines,
                Arrays.asList("Math", "Computer science")
        );
        sam.setDisciplines(samDisciplineList);
        students.add(mary);

        ////////////

        return students;
    }
}

