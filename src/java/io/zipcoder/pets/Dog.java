package io.zipcoder.pets;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }
/*
    @Override
    public String Speak(String speak) {
         speak = "Why must I be like that?";
        return speak;
    }
*/

    @Override
    public String Speak() {
       return "bark.";
    }


}
