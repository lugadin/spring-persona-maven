/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.atoms.app.persona.client.service.PersonaStoreService;
import ru.atoms.app.persona.struct.BindPersonaSessionTypePath;
import ru.atoms.app.persona.struct.PersonaResultOperationRequest;
import ru.atoms.app.persona.struct.PersonaResultOperationResponse;

/**
 *
 * @author kochetov
 */
@Controller
@RequestMapping("/persona/store")
public class PersonaClientStoreController {
    @Autowired
    PersonaStoreService personaStoreService;    
    @RequestMapping(value = "/{type}", method = {RequestMethod.POST, RequestMethod.GET}, produces={"application/json", "application/xml"})
    public @ResponseBody PersonaResultOperationResponse bindPersonaAddressCommand(@RequestBody PersonaResultOperationRequest personaResultOperationRequest, @PathVariable String type) {
        if(type.equals(BindPersonaSessionTypePath.ADDRESS)) {
            return personaStoreService.bindPersonaAddress(personaResultOperationRequest);
        } else if(type.equals(BindPersonaSessionTypePath.NDFL)) {
            return personaStoreService.bindPersonaNdfl(personaResultOperationRequest);
        } else if(type.equals(BindPersonaSessionTypePath.NDFLADV)) {
            return personaStoreService.bindPersonaNdflAdv(personaResultOperationRequest);
        } else if(type.equals(BindPersonaSessionTypePath.BILLINGBANK)) {
            return personaStoreService.bindPersonaBank(personaResultOperationRequest);
        } else if(type.equals(BindPersonaSessionTypePath.BILLINGCARD)) {
            return personaStoreService.bindPersonaCard(personaResultOperationRequest);
        } else if(type.equals(BindPersonaSessionTypePath.ADDRESSUA)) {
            return personaStoreService.bindPersonaAddressUa(personaResultOperationRequest);
        } else {
            return null;
        }
    }    
}
