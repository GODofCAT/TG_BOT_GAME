package org.example.bot.util;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboardsMarkupStorage {
    public static InlineKeyboardMarkup getMenuMain() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorage.ButtonStart.getName());
        button.setCallbackData(ButtonsStorage.ButtonStart.getCallBackData());
        row.add(button);
        keyboard.add(row);

        //row = new ArrayList<>();
        //button = new InlineKeyboardButton();
        //button.setText(ButtonsStorage.ButtonAttack.getName());
        //button.setCallbackData(ButtonsStorage.ButtonAttack.getCallBackData());
        //row.add(button);
        //keyboard.add(row);

        //row = new ArrayList<>();
        //button = new InlineKeyboardButton();
        //button.setText(ButtonsStorage.ButtonDefense.getName());
        //button.setCallbackData(ButtonsStorage.ButtonDefense.getCallBackData());
        //row.add(button);
        //keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);



        return replyKeyboardMarkup;
    }

    public static InlineKeyboardMarkup getStart() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row;
        InlineKeyboardButton button;

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorage.ButtonAttack.getName());
        button.setCallbackData(ButtonsStorage.ButtonAttack.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(ButtonsStorage.ButtonDefense.getName());
        button.setCallbackData(ButtonsStorage.ButtonDefense.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup replyKeyboardMarkup = new InlineKeyboardMarkup();
        replyKeyboardMarkup.setKeyboard(keyboard);



        return replyKeyboardMarkup;
    }
}