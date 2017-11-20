package com.company;

public class Superman extends SuperAbilities {
    private String laser = "superLaser";
    private String flying = "superFlying";

    public String getLaser() { return laser; }

    public void setLaser(String laser) { this.laser = laser; }

    public String getFlying() { return flying; }

    public void setFlying(String flying) { this.flying = flying; }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Custom SuperAbilities{");
        sb.append("laser='").append(laser).append('\'');
        sb.append(", flying='").append(flying).append('\'');
        sb.append('}');
        sb.append( super.toString() );
        return sb.toString();
    }
}
