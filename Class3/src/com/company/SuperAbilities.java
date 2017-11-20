package com.company;

public class SuperAbilities {
    private String regenaration ="regeneration";
    private String power ="power";

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Usual SuperAbilities{");
        sb.append("regenaration='").append(regenaration).append('\'');
        sb.append(", power='").append(power).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
