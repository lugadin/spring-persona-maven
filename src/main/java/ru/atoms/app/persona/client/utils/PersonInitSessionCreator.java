/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.client.utils;

import org.springframework.util.DigestUtils;
import ru.atoms.app.persona.struct.PersonaProperties;
import ru.atoms.app.persona.struct.PersonaSessionInit;

/**
 *
 * @author kochetov
 */
public class PersonInitSessionCreator {
    
    public static PersonaSessionInit instance(PersonaProperties personaProperties, int sessionTypeId, String orderNo, String phone) {
        PersonaSessionInit personaSessionInit = new PersonaSessionInit();        
        personaSessionInit.setProjectId(personaProperties.getProjectId());
        personaSessionInit.setSuccessUrl(personaProperties.getSuccessURL());
        personaSessionInit.setResultUrl(personaProperties.getResultURL());
        personaSessionInit.setFailUrl(personaProperties.getFailURL());
        personaSessionInit.setResultMethod("POST");
        personaSessionInit.setPhone(phone);
        personaSessionInit.setOrderNo(orderNo);
        personaSessionInit.setCssUrl(personaProperties.getCssURL());
        
        // унимальное время
        String processDateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()) + String.valueOf(System.nanoTime()).substring(7);
        
        // строим хэшь код
        String hashCode = DigestUtils.md5DigestAsHex((personaProperties.getSecretKey() + ":" + personaProperties.getProjectId() + ":" + phone + ":" + orderNo + ":" + processDateTime).getBytes());
        
        personaSessionInit.setProcessDatetime(processDateTime);
        personaSessionInit.setHashCode(hashCode);
        personaSessionInit.setPersonaSessionType(sessionTypeId);        
        
        return personaSessionInit;
    }
}
