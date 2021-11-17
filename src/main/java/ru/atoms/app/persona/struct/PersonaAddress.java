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
@XmlRootElement(name = "address")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaAddress implements Serializable {
    
    
    @JsonProperty("abonentid")
    private int pabonentId;
    private int subjectId;
    private long subjectRegionId;
    private long subjectRegionNpId;
    private int typeStreetId;
    private String street;
    private String house;
    private String korp;
    private String stroenie;
    private String kv;
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
    
    
    

    public long getSubjectRegionNpId() {
        return subjectRegionNpId;
    }

    public void setSubjectRegionNpId(long subjectRegionNpId) {
        this.subjectRegionNpId = subjectRegionNpId;
    }

    public int getPabonentId() {
        return pabonentId;
    }

    @XmlAttribute(name="abonentid")
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

    public int getTypeStreetId() {
        return typeStreetId;
    }

    public void setTypeStreetId(int typeStreetId) {
        this.typeStreetId = typeStreetId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getKorp() {
        return korp;
    }

    public void setKorp(String korp) {
        this.korp = korp;
    }

    public String getStroenie() {
        return stroenie;
    }

    public void setStroenie(String stroenie) {
        this.stroenie = stroenie;
    }

    public String getKv() {
        return kv;
    }

    public void setKv(String kv) {
        this.kv = kv;
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
