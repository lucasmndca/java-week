package classes;

import interfaces.TodoElement;

public class Appointment implements TodoElement {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void printSavedMessage() {

    }
}
