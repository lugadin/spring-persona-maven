/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kochetov
 */

@XmlRootElement(name = "ndfladv")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaNdflAdv extends PersonaNdfl {    
    
    @JsonProperty("address2")    
    private PersonaAddress personaAddress;

    public PersonaAddress getPersonaAddress() {
        return personaAddress;
    }

    @XmlElement(name = "address2")
    public void setPersonaAddress(PersonaAddress personaAddress) {
        this.personaAddress = personaAddress;
    }
    
}
