package Core.MernisValidation;

import Adapters.MernisValidationManager;

public class MernisValidationManagerAdapter implements MernisValidationService {

    @Override
    public boolean ifCheckRealUser(String id, String name, String surName, String birdthDate) {
        MernisValidationManager manager = new MernisValidationManager();
        if(manager.validation(id, name, surName, birdthDate) == true) {
            return true;
        }
        else {
            return false;
        }


    }


}