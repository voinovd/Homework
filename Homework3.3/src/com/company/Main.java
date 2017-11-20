package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DisciplineCreator disciplineCreator = new DisciplineCreator();
        List<Discipline> disciplines = disciplineCreator.create();
        ProfessorCreator professorCreator = new ProfessorCreator();
        List<Professor> professors = professorCreator.create();
        StudentCreator studentCreator = new StudentCreator();
        List<Student> students = studentCreator.create();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter studentName");
            String studentName = br.readLine();
            Student studentFromConsole = getStudentByName(studentName, students);
            studentFromConsole.learn();

            System.out.println("Enter professorName");
            String professorName = br.readLine();
            Professor professorFromConsole = getProfessorByName(professorName, professors);
            professorFromConsole.teach();

        } catch ( IOException e){
            e.printStackTrace();
        }
    }

    private static Professor getProfessorByName(String professorName, List<Professor> professors) {
        for ( Professor student : professors ) {
            if ( professorName.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }

    private static Student getStudentByName(String studentName, List<Student> students) {

        for ( Student student : students ) {
            if ( studentName.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }
    public static List<Discipline> getDisciplinesByNames(
            List<Discipline> disciplines,
            List<String> disciplineNames
    ) {
        List<Discipline> resultList = new ArrayList<>();

        for ( Discipline discipline : disciplines ) {
            if ( disciplineNames.contains(discipline.getName() ) ) {
                resultList.add(discipline);
            }
        }
        return resultList;
    }
}
