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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kochetov
 */

@XmlRootElement(name = "sessioninit")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaSessionInit implements Serializable {
    
    private int projectId;
    private int personaSessionType;
    private String resultUrl;
    private String resultMethod;
    private String successUrl;
    private String failUrl;
    private String orderNo;
    private String processDatetime;
    private String hashCode;
    private String phone;
    private String cssUrl;
    
    private List <PersonaSessionInitAdditionValue> additionValue;

    public List<PersonaSessionInitAdditionValue> getAdditionValue() {
        return additionValue;
    }


    @XmlElementWrapper(name="addvalues")
    @XmlElement(name="addvalue")
    @JsonProperty("addvalues")
    public void setAdditionValue(List<PersonaSessionInitAdditionValue> additionValue) {
        this.additionValue = additionValue;
    }

    public int getProjectId() {
        return projectId;
    }
    @XmlAttribute
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getPersonaSessionType() {
        return personaSessionType;
    }
    @XmlAttribute(name="sessiontypeid")
    @JsonProperty("sessiontypeid")
    public void setPersonaSessionType(int personaSessionType) {
        this.personaSessionType = personaSessionType;
    }

    public String getResultUrl() {
        return resultUrl;
    }

    public void setResultUrl(String resultUrl) {
        this.resultUrl = resultUrl;
    }

    public String getResultMethod() {
        return resultMethod;
    }

    public void setResultMethod(String resultMethod) {
        this.resultMethod = resultMethod;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getFailUrl() {
        return failUrl;
    }

    public void setFailUrl(String failUrl) {
        this.failUrl = failUrl;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProcessDatetime() {
        return processDatetime;
    }

    public void setProcessDatetime(String processDatetime) {
        this.processDatetime = processDatetime;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCssUrl() {
        return cssUrl;
    }

    public void setCssUrl(String cssUrl) {
        this.cssUrl = cssUrl;
    }
    
    
    
}
