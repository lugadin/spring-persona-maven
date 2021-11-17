/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.atoms.app.persona.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kochetov
 */
@XmlRootElement(name = "card")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaCard implements Serializable {
    
    @JsonProperty("abonentid")
    private int pabonentId;
    private int subjectId;
    private long subjectRegionId;
    private long subjectRegionNpId;
    
    private String address;    
    private String zip;
    private String f;
    private String i;
    private String o;
    
    private String subjectname;
    private String subjectregionname;
    private String subjectregionnpname;
    
    private int projectId;
    
    @JsonProperty("sid")
    private int abonentSessionId;
    private String hashcode;
    
    private String pseria;
    private String pnumber;
    private String datep;
    private String pvidan;
    private String pcode;
    private String dateb;
    
    private String phone;
    private String barea;
    private String cardnum;

    public int getPabonentId() {
        return pabonentId;
    }

    public void setPabonentId(int pabonentId) {
        this.pabonentId = pabonentId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public long getSubjectRegionId() {
        return subjectRegionId;
    }

    public void setSubjectRegionId(long subjectRegionId) {
        this.subjectRegionId = subjectRegionId;
    }

    public long getSubjectRegionNpId() {
        return subjectRegionNpId;
    }

    public void setSubjectRegionNpId(long subjectRegionNpId) {
        this.subjectRegionNpId = subjectRegionNpId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
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

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getSubjectregionname() {
        return subjectregionname;
    }

    public void setSubjectregionname(String subjectregionname) {
        this.subjectregionname = subjectregionname;
    }

    public String getSubjectregionnpname() {
        return subjectregionnpname;
    }

    public void setSubjectregionnpname(String subjectregionnpname) {
        this.subjectregionnpname = subjectregionnpname;
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

    public void setAbonentSessionId(int abonentSessionId) {
        this.abonentSessionId = abonentSessionId;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    public String getPseria() {
        return pseria;
    }

    public void setPseria(String pseria) {
        this.pseria = pseria;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getDatep() {
        return datep;
    }

    public void setDatep(String datep) {
        this.datep = datep;
    }

    public String getPvidan() {
        return pvidan;
    }

    public void setPvidan(String pvidan) {
        this.pvidan = pvidan;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getDateb() {
        return dateb;
    }

    public void setDateb(String dateb) {
        this.dateb = dateb;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBarea() {
        return barea;
    }

    public void setBarea(String barea) {
        this.barea = barea;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }
    
    
    
    
    
    
}
