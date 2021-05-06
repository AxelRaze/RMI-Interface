package model;

import java.io.Serializable;

public class Contact implements Serializable {

    private String name;
    private String telefono;

    public Contact (String name, String telefono) {
        this.name = name;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return telefono;
    }

    public void getTelefono(String telefono) {
        this.telefono = telefono;
    }

}
