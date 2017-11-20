package com.company;

public class Student extends Person  {
    public Student() {
    }
    private int source;

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public void learn() {
        if ( disciplines == null ) {
            System.out.println( "No Disciplines for student " + name );
        } else {
            System.out.println( "Disciplines for student " + name + ":");
            for (Discipline discipline : disciplines ) {
                System.out.println(discipline.getName());
            }
        }
    }
}
