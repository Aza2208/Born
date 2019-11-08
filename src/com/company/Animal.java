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
    private String Name;



    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public Integer getLegs() { return legs; }

    public void setLegs(Integer legs) { this.legs = legs; }

    public Boolean getMamal() { return mamal; }

    public void setMamal(Boolean mamal) { this.mamal = mamal; }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
