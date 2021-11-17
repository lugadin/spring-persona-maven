/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kochetov
 */

@XmlRootElement(name = "answer")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaSessionInitAnswer implements Serializable{
    private String pid;
    private int pabonentId;
    private int result;
    
    @JsonProperty("sid")
    private int abonentSessionId;
    private String hashCode;
    
    private int answerId;
    private String answerText;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    
    
    
    

    public PersonaSessionInitAnswer(String pid, int pabonentId, int result, int abonentSessionId, String hashCode) {
        this.pid = pid;
        this.pabonentId = pabonentId;
        this.result = result;
        this.abonentSessionId = abonentSessionId;
        this.hashCode = hashCode;
    }

    public PersonaSessionInitAnswer(String pid, int pabonentId, int result, int abonentSessionId, String hashCode, int answerId, String answerText) {
        this.pid = pid;
        this.pabonentId = pabonentId;
        this.result = result;
        this.abonentSessionId = abonentSessionId;
        this.hashCode = hashCode;
        this.answerId = answerId;
        this.answerText = answerText;
    }

    public PersonaSessionInitAnswer() {
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }
    
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getPabonentId() {
        return pabonentId;
    }

    public void setPabonentId(int pabonentId) {
        this.pabonentId = pabonentId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getAbonentSessionId() {
        return abonentSessionId;
    }

    @XmlAttribute(name="sid")
    public void setAbonentSessionId(int abonentSessionId) {
        this.abonentSessionId = abonentSessionId;
    }
    
    
    
}
