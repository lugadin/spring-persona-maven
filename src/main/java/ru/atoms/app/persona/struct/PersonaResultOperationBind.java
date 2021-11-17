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
@XmlRootElement(name = "resultbind")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaResultOperationBind extends PersonaResultOperationResponse {
    
    @JsonProperty("sid")
    private int sessionId;

    public int getSessionId() {
        return sessionId;
    }
    @XmlElement(name="sid")
    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }
}
