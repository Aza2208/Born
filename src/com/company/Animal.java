package com.company;

public class Animal {
    public Animal (String color, Integer legs, Boolean mamal, String Name){
        this.color = color;
        this.legs = legs;
        this.mamal = mamal;
        this.Name = Name;
    }

    private String color;
    private Integer legs;
    private Boolean mamal;
    private static String Name;

    public static String getName() { return Name; }

    public static void setName(String name) { Name = name; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public Integer getLegs() { return legs; }

    public void setLegs(Integer legs) { this.legs = legs; }

    public Boolean getMamal() { return mamal; }

    public void setMamal(Boolean mamal) { this.mamal = mamal; }
}
