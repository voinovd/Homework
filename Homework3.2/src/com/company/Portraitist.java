package com.company;

public class Portraitist extends Artist {
    @Override
    public void draw(String args) {
        super.draw("Художник "+ name +" - отличный портретист");
    }
}
