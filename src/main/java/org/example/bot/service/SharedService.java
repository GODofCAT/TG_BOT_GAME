package org.example.bot.service;

import org.example.bot.statemachine.State;
import org.example.bot.statemachine.TransmittedData;
import org.example.bot.util.DialogStringsStorage;
import org.example.bot.util.InlineKeyboardsMarkupStorage;
import org.example.bot.util.SystemStringsStorage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

public class SharedService {
    public static SendMessage goToProcessClickInMenuMain(TransmittedData transmittedData) {

        SendMessage message = new SendMessage();
        message.setChatId(transmittedData.getChatId());
        message.setText(DialogStringsStorage.CommandStartHello);
        message.setReplyMarkup(InlineKeyboardsMarkupStorage.getMenuMain());

        transmittedData.getDataStorage().clear();
        transmittedData.setState(State.ClickOnButtonStart);
        return message;
    }

}
