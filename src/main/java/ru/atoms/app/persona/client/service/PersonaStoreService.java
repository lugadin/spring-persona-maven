/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.atoms.app.persona.client.service;

import ru.atoms.app.persona.struct.PersonaResultOperationRequest;
import ru.atoms.app.persona.struct.PersonaResultOperationResponse;

/**
 *
 * @author kochetov
 */
public interface PersonaStoreService {
    PersonaResultOperationResponse bindPersonaAddress(PersonaResultOperationRequest personaResultOperationRequest);
    PersonaResultOperationResponse bindPersonaNdfl(PersonaResultOperationRequest personaResultOperationRequest);
    PersonaResultOperationResponse bindPersonaBank(PersonaResultOperationRequest personaResultOperationRequest);
    PersonaResultOperationResponse bindPersonaCard(PersonaResultOperationRequest personaResultOperationRequest);
    PersonaResultOperationResponse bindPersonaNdflAdv(PersonaResultOperationRequest personaResultOperationRequest);
}
