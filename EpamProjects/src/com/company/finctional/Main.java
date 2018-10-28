package com.company.finctional;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
        Settable<Cat> settable = (obj, name, age, color) -> {
            obj.setAge(age);
            obj.setName(name);
            obj.setColor(color);
        };

        changeEntity((cat), settable);
        System.out.println(cat);
    }

    private static <T extends WithNameAndAge> void changeEntity(T entity, Settable<T> s) {
        s.set(entity, "Chermander", 2, "Grey");
    }
}
