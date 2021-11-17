/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.client.utils;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import ru.atoms.app.persona.client.struct.PersonaClientInitSessionAnswer;
import ru.atoms.app.persona.struct.PersonaProperties;
import ru.atoms.app.persona.struct.PersonaSessionInit;

/**
 *
 * @author kochetov
 */
public class InitClientPersonaSession {
    private PersonaProperties personaProperties;
    private PersonaSessionInit personaSessionInit;

    public InitClientPersonaSession(PersonaProperties personaProperties, PersonaSessionInit personaSessionInit) {
        this.personaProperties = personaProperties;
        this.personaSessionInit = personaSessionInit;
    }
    
    public PersonaClientInitSessionAnswer getSession() {
        RestTemplate restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory rf = (SimpleClientHttpRequestFactory) restTemplate.getRequestFactory() ;
        rf.setConnectTimeout(10000);
        rf.setReadTimeout(10000);
        String exceptionStr = null;
        
        PersonaClientInitSessionAnswer answer = null;
        
        int http_status = 0;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType( MediaType.APPLICATION_JSON );
        HttpEntity request= new HttpEntity( personaSessionInit, headers );
        try {       
            answer = restTemplate.postForObject(personaProperties.getPersonaViewURL() + personaProperties.getPersonaRestUrl(), 
                    request, PersonaClientInitSessionAnswer.class);
            http_status = 200;
        } catch (HttpClientErrorException | HttpServerErrorException httpErrorException) {
            http_status = httpErrorException.getStatusCode().value();            
            exceptionStr = httpErrorException.getMessage();            
        } catch (ResourceAccessException resourceAccessException) {            
            exceptionStr = resourceAccessException.getMessage();
        } catch (RestClientException restClientException) {        
            // другие ошибки
            exceptionStr = restClientException.getMessage();
        }
        
        if(answer==null) {
            answer = new PersonaClientInitSessionAnswer();
            answer.setResult(0);
            answer.setAnswerId(1000);
            answer.setAnswerText(http_status + " - " + exceptionStr);
            answer.setExceptionMsg(exceptionStr);
        }
        answer.setHttpStatus(http_status);
        
        return answer;
    }

    public PersonaProperties getPersonaProperties() {
        return personaProperties;
    }

    public void setPersonaProperties(PersonaProperties personaProperties) {
        this.personaProperties = personaProperties;
    }

    public PersonaSessionInit getPersonaSessionInit() {
        return personaSessionInit;
    }

    public void setPersonaSessionInit(PersonaSessionInit personaSessionInit) {
        this.personaSessionInit = personaSessionInit;
    }
    
    
    
    
    
}
