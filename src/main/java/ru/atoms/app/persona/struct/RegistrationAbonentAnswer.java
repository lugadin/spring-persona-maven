/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.atoms.app.persona.struct;

/**
 *
 * @author kochetov
 */
public class RegistrationAbonentAnswer {
    private int answerId;
    private int result;
    private String answerText;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    @Override
    public String toString() {
        return "RegistrationAbonentAnswer{" + "answerId=" + answerId + ", result=" + result + ", answerText=" + answerText + '}';
    }
    
    
    
}
