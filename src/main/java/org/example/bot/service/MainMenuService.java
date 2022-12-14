package org.example.bot.service;


import org.example.bot.statemachine.State;
import org.example.bot.statemachine.TransmittedData;
import org.example.bot.util.*;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

public class MainMenuService {

    public SendMessage processCommandStart(String command, TransmittedData transmittedData) throws Exception {
        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (!command.equals(SystemStringsStorage.CommandStart)) {
            message.setText(DialogStringsStorage.CommandStartError);
            return message;
        }

        return SharedService.goToProcessClickInMenuMain(transmittedData);
    }

    public SendMessage processClickInMenuMain(String callBackData, TransmittedData transmittedData) throws Exception {
        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());

        if (callBackData.equals(ButtonsStorage.ButtonAttack.getCallBackData())) {
            message.setText(DialogStringsStorage.CommandAttack);
            transmittedData.setState(State.ClickAttack);
            return message;
        } else if (callBackData.equals(ButtonsStorage.ButtonDefense.getCallBackData())) {
            message.setText(DialogStringsStorage.CommandDefense);
            transmittedData.setState(State.ClickDefense);
            return message;
        }

            throw new Exception("Ошибка распознавания callBackData");
        }
    }