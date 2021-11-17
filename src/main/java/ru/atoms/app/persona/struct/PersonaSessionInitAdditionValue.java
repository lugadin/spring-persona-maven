/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.struct;


import java.io.Serializable;

/**
 *
 * @author kochetov
 */

public class PersonaSessionInitAdditionValue implements Serializable {
    
    private String name;
    private String value;

    public PersonaSessionInitAdditionValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public PersonaSessionInitAdditionValue() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
