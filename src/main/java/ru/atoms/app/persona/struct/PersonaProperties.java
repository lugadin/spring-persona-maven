/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.struct;

/**
 *
 * @author kochetov
 */
public class PersonaProperties {
    
    private static final long serialVersionUID = 1L;
    
    // restcontroller
    private String personaRestUrl;

    // урл адрес формы персональных данных
    private String personaViewURL;
    
    // сохранение результатов
    private String resultURL;
    
    // урл адрес если успешное заполнение
    private String successURL;
    
    // при неуспешном заполнении
    private String failURL;
    
    private String cssURL;
    
    private int projectId;
    
    private String secretKey;

    public String getCssURL() {
        return cssURL;
    }

    public void setCssURL(String cssURL) {
        this.cssURL = cssURL;
    }
    
    public String getPersonaRestUrl() {
        return personaRestUrl;
    }

    public void setPersonaRestUrl(String personaRestUrl) {
        this.personaRestUrl = personaRestUrl;
    }

    public String getPersonaViewURL() {
        return personaViewURL;
    }

    public void setPersonaViewURL(String personaViewURL) {
        this.personaViewURL = personaViewURL;
    }

    public String getResultURL() {
        return resultURL;
    }

    public void setResultURL(String resultURL) {
        this.resultURL = resultURL;
    }

    public String getSuccessURL() {
        return successURL;
    }

    public void setSuccessURL(String successURL) {
        this.successURL = successURL;
    }

    public String getFailURL() {
        return failURL;
    }

    public void setFailURL(String failURL) {
        this.failURL = failURL;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
    
}
