/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kochetov
 */


@XmlRootElement(name = "resultrequest")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaResultOperationRequest implements Serializable {
    private int personaId;
    private int persona2Id;
    @JsonProperty("sid")
    private int abonentSessionId;
    
    @JsonProperty("order")
    private String orderNo;
    private String hashCode;
    private int sessionTypeId;
    
    private String personaText;
    
    private List <PersonaSessionInitAdditionValue> additionValue;

    public int getPersonaId() {
        return personaId;
    }

    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }

    public int getPersona2Id() {
        return persona2Id;
    }

    public void setPersona2Id(int persona2Id) {
        this.persona2Id = persona2Id;
    }
    
    

    public int getAbonentSessionId() {
        return abonentSessionId;
    }

    @XmlElement(name="sid")
    public void setAbonentSessionId(int abonentSessionId) {
        this.abonentSessionId = abonentSessionId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    @XmlElement(name="order")
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getPersonaText() {
        return personaText;
    }

    public void setPersonaText(String personaText) {
        this.personaText = personaText;
    }

    public List<PersonaSessionInitAdditionValue> getAdditionValue() {
        return additionValue;
    }
    
    @XmlElementWrapper(name="addvalues")
    @XmlElement(name="addvalue")
    @JsonProperty("addvalues")
    public void setAdditionValue(List<PersonaSessionInitAdditionValue> additionValue) {
        this.additionValue = additionValue;
    }

    public int getSessionTypeId() {
        return sessionTypeId;
    }

    public void setSessionTypeId(int sessionTypeId) {
        this.sessionTypeId = sessionTypeId;
    }
    
    
}
