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
public class Abonent implements Serializable {
    private PersonaLoginResponse attr;

    public PersonaLoginResponse getAttr() {
        return attr;
    }

    public void setAttr(PersonaLoginResponse attr) {
        this.attr = attr;
    }
    
    private PersonaResultOperationBind prob;

    public PersonaResultOperationBind getProb() {
        return prob;
    }

    public void setProb(PersonaResultOperationBind prob) {
        this.prob = prob;
    }
    
}
