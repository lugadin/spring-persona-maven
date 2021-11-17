/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kochetov
 */
@XmlRootElement(name = "answer")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaOperationAnswer {
    private int answerId;
    private int personaId;
    private int persona2Id;
    private int abonentUploadFileId;
    private String answerText;
    private String personaText;

    public PersonaOperationAnswer(int answerId, String answerText, int result) {
        this.answerId = answerId;
        this.answerText = answerText;
        this.result = result;
    }

    public PersonaOperationAnswer() {
    }
    
    
    private PersonaResultOperationBind prob;
    
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

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
    
    public int getAbonentUploadFileId() {
        return abonentUploadFileId;
    }

    public void setAbonentUploadFileId(int abonentUploadFileId) {
        this.abonentUploadFileId = abonentUploadFileId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    

    public String getPersonaText() {
        return personaText;
    }

    public void setPersonaText(String personaText) {
        this.personaText = personaText;
    }

    public PersonaResultOperationBind getProb() {
        return prob;
    }

    public void setProb(PersonaResultOperationBind prob) {
        this.prob = prob;
    }

    
    
}
