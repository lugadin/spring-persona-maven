/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.atoms.app.persona.client.service.PersonaStoreService;
import ru.atoms.app.persona.struct.BindPersonaSessionTypePath;
import ru.atoms.app.persona.struct.PersonaResultOperationRequest;
import ru.atoms.app.persona.struct.PersonaResultOperationResponse;

/**
 * @author kochetov
 */
@Controller
@RequestMapping("/persona/store")
public class PersonaClientStoreController {

    @Autowired
    PersonaStoreService personaStoreService;

    @PostMapping(value = "/{type}", produces = {"application/json;charset=UTF-8", "application/xml;charset=UTF-8"})
    public @ResponseBody PersonaResultOperationResponse bindPersonaAddressCommand(
            @RequestBody PersonaResultOperationRequest personaResultOperationRequest,
            @PathVariable("type") String type
    ) {

        return switch (type) {
            case BindPersonaSessionTypePath.ADDRESS ->
                    personaStoreService.bindPersonaAddress(personaResultOperationRequest);
            case BindPersonaSessionTypePath.NDFL -> personaStoreService.bindPersonaNdfl(personaResultOperationRequest);
            case BindPersonaSessionTypePath.NDFLADV ->
                    personaStoreService.bindPersonaNdflAdv(personaResultOperationRequest);
            case BindPersonaSessionTypePath.BILLINGBANK ->
                    personaStoreService.bindPersonaBank(personaResultOperationRequest);
            case BindPersonaSessionTypePath.BILLINGCARD ->
                    personaStoreService.bindPersonaCard(personaResultOperationRequest);
            default -> null;
        };
    }
}
