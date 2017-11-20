package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.company.Main.getDisciplinesByNames;

public class ProfessorCreator {
    public List<Professor> create() {
        List<Professor> professors = new ArrayList<>();

        Professor einstein = new Professor();
        einstein.setName("Albert Einstein");
        einstein.setAge(75);

        List<Discipline> disciplines = null;
        List<Discipline> einsteinDisciplineList = getDisciplinesByNames(
                disciplines,
                Arrays.asList("Math", "Computer science")
        );
        einstein.setDisciplines(einsteinDisciplineList);
        professors.add(einstein);

        ///////////////

        Professor picasso = new Professor();
        picasso.setName("Pablo Picasso");
        picasso.setAge(50);

        List<Discipline> picassoDisciplineList = getDisciplinesByNames(
                disciplines,
                Arrays.asList("Art")
        );
        picasso.setDisciplines(picassoDisciplineList);
        professors.add(picasso);

        ////////////

        return professors;
    }
}
