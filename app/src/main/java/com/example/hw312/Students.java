package com.example.hw312;

import java.io.Serializable;

public class Students implements Serializable {
    String name;
    String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Students(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
