package com.company;
import com.company.Animal;

    public class Cat extends Animal {


        public Cat(String color, Integer legs, Boolean mamal, String Name) {
            super(color, legs, mamal, Name);
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

        @Override
        public String getName() {
            return super.getName();
        }
    }
