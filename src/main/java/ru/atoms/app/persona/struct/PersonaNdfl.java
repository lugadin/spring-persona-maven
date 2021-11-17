/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.struct;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kochetov
 */
@XmlRootElement(name = "ndfl")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaNdfl extends PersonaAddress {
    private String pseria;
    private String pnumber;
    private String datep;
    private String pvidan;
    private String pcode;
    private String dateb;
    private String inn;
    private int scan1;
    private int scan2;
    private int scan3;

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

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public int getScan1() {
        return scan1;
    }

    public void setScan1(int scan1) {
        this.scan1 = scan1;
    }

    public int getScan2() {
        return scan2;
    }

    public void setScan2(int scan2) {
        this.scan2 = scan2;
    }

    public int getScan3() {
        return scan3;
    }

    public void setScan3(int scan3) {
        this.scan3 = scan3;
    }
}
