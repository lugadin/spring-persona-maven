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
@XmlRootElement(name = "answer")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaLoginResponse implements Serializable {
    
    private int abonentSessionId;
    private int projectId;
    private int pabonentId;
    private String phone;
    private int sessionTypeId;
    private int reqScanNdfl;
    private String confirmText;
    private String resultUrl;
    private String resultMethod;
    private String successUrl;
    private String failUrl;
    private String cssUrl;
    private String orderNo;
    private String hashCode;
    private String params;
    private String storeSuccessText;    
    private String f;
    private String i;
    private String o;
    
    private int result;
    private int answerId;
    private String answerText;

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

    public int getAbonentSessionId() {
        return abonentSessionId;
    }

    public void setAbonentSessionId(int abonentSessionId) {
        this.abonentSessionId = abonentSessionId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getPabonentId() {
        return pabonentId;
    }

    public void setPabonentId(int pabonentId) {
        this.pabonentId = pabonentId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSessionTypeId() {
        return sessionTypeId;
    }

    public void setSessionTypeId(int sessionTypeId) {
        this.sessionTypeId = sessionTypeId;
    }

    public int getReqScanNdfl() {
        return reqScanNdfl;
    }

    public void setReqScanNdfl(int reqScanNdfl) {
        this.reqScanNdfl = reqScanNdfl;
    }

    public String getConfirmText() {
        return confirmText;
    }

    public void setConfirmText(String confirmText) {
        this.confirmText = confirmText;
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

    public String getCssUrl() {
        return cssUrl;
    }

    public void setCssUrl(String cssUrl) {
        this.cssUrl = cssUrl;
    }
    
    

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getStoreSuccessText() {
        return storeSuccessText;
    }

    public void setStoreSuccessText(String storeSuccessText) {
        this.storeSuccessText = storeSuccessText;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }
    
    
    
}
