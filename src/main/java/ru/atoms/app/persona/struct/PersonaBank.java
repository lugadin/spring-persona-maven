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
@XmlRootElement(name = "bank")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaBank implements Serializable {
    
    
    @JsonProperty("abonentid")
    private int pabonentId;
    private String inn;
    private String bankrs;
    private String bankname;
    private String bankaccount;
    private String bankbik;
    private String bankinn;
    private String bankkoraccount;
    private String bankpaymentdetails;
    private String f;
    private String i;
    private String o;
    private int projectId;
    
    @JsonProperty("sid")
    private int abonentSessionId;
    private String hashcode;

    

    public int getPabonentId() {
        return pabonentId;
    }

    @XmlAttribute(name="abonentid")
    public void setPabonentId(int pabonentId) {
        this.pabonentId = pabonentId;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getBankrs() {
        return bankrs;
    }

    public void setBankrs(String bankrs) {
        this.bankrs = bankrs;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    public String getBankbik() {
        return bankbik;
    }

    public void setBankbik(String bankbik) {
        this.bankbik = bankbik;
    }

    public String getBankinn() {
        return bankinn;
    }

    public void setBankinn(String bankinn) {
        this.bankinn = bankinn;
    }

    public String getBankkoraccount() {
        return bankkoraccount;
    }

    public void setBankkoraccount(String bankkoraccount) {
        this.bankkoraccount = bankkoraccount;
    }

    public String getBankpaymentdetails() {
        return bankpaymentdetails;
    }

    public void setBankpaymentdetails(String bankpaymentdetails) {
        this.bankpaymentdetails = bankpaymentdetails;
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

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getAbonentSessionId() {
        return abonentSessionId;
    }

    @XmlAttribute(name="sid")
    public void setAbonentSessionId(int abonentSessionId) {
        this.abonentSessionId = abonentSessionId;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }
    
    
}
