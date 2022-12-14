package org.example.bot.service;

import org.example.bot.statemachine.State;
import org.example.bot.statemachine.TransmittedData;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.HashMap;
import java.util.Map;

public class ServiceManager {
    private final Map<State, Service> methods;

    private final MainMenuService mainMenuService;

    public ServiceManager() throws Exception {
        methods = new HashMap<>();

        mainMenuService = new MainMenuService();

        methods.put(State.CommandStart, mainMenuService::processCommandStart);
        methods.put(State.ClickInMenuMain, mainMenuService::processClickInMenuMain);
        methods.put(State.ClickAttack, mainMenuService::processClickInMenuMain);
        methods.put(State.ClickDefense, mainMenuService::processClickInMenuMain);


    }

    public SendMessage processUpdate(String textData, TransmittedData transmittedData) throws Exception {
        return methods.get(transmittedData.getState()).processUpdate(textData, transmittedData);
    }

}
