package com.company;

public class Flash extends SuperAbilities {
    private String speed = "superSpeed";

    public String getSpeed() { return speed; }

    public void setSpeed(String speed) { this.speed = speed; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flash{");
        sb.append("speed='").append(speed).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
