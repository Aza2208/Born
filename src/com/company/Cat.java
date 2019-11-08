package com.company;
import com.company.Animal;

    public class Cat extends Animal {


        public Cat(String color, Integer legs, Boolean mamal) {
            super(color, legs, mamal);
        }

        @Override
    public Boolean getMamal() {
        return true;
    }

    @Override
    public Integer getLegs() {
        return 4;
    }

    @Override
    public String getColor() {
        return "Brown";
    }
}
