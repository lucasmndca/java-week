package classes;

import interfaces.TodoElement;

public class Reminder implements TodoElement {

    private String name;
    private String description;
    private String date;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public void printSavedMessage() {

    }
}
