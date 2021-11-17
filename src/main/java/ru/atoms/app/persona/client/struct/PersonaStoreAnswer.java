/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.client.struct;

/**
 *
 * @author kochetov
 */
public class PersonaStoreAnswer {
    private int answerId;
    private int redult;
    private String answerText;

    public PersonaStoreAnswer() {
    }

    public PersonaStoreAnswer(int answerId, int redult, String answerText) {
        this.answerId = answerId;
        this.redult = redult;
        this.answerText = answerText;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getRedult() {
        return redult;
    }

    public void setRedult(int redult) {
        this.redult = redult;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }
    
    
    
}
