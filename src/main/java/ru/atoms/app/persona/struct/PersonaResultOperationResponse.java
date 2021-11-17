/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kochetov
 */
@XmlRootElement(name = "resultresponce")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaResultOperationResponse implements Serializable {
    
    private int result;
    private int answerId;
    private String answerText;
    
    public PersonaResultOperationResponse(int result, int answerId, String answerText) {
        this.result = result;
        this.answerId = answerId;
        this.answerText = answerText;
    }

    public PersonaResultOperationResponse() {
    }

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

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
    
    
}
