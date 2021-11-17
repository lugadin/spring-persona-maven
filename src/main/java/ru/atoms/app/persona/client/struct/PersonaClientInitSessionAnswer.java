/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.client.struct;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



/**
 *
 * @author kochetov
 */
@XmlRootElement(name = "answer")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaClientInitSessionAnswer implements Serializable {
    private int result;
    private int answerId;
    private String answerText;
    @JsonProperty("loc")
    private String personaLocationUrl;
    @JsonProperty("sid")
    private int abonentSessionId;
    private String pid;
    private String hashCode;
    private int httpStatus;
    
    @JsonIgnore
    private String exceptionMsg;

    public int getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(int httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
    
    

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
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

    public String getPersonaLocationUrl() {
        return personaLocationUrl;
    }

    @XmlElement(name = "loc")
    public void setPersonaLocationUrl(String personaLocationUrl) {
        this.personaLocationUrl = personaLocationUrl;
    }

    public int getAbonentSessionId() {
        return abonentSessionId;
    }

    @XmlAttribute(name="sid")
    public void setAbonentSessionId(int abonentSessionId) {
        this.abonentSessionId = abonentSessionId;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
