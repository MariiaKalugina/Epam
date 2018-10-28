package com.company.finctional;

@FunctionalInterface
public interface Settable<C extends WithNameAndAge> {
    void set(C entity, String name, int age, String color);
}
