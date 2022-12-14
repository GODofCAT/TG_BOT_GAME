package org.example.bot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BotInitializer extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "quest_java_bot";
    }

    @Override
    public String getBotToken() {
        return "5745133803:AAFjW-wkFnTtaDgBQG66gY3MwSL9yiAPw1c";
    }

    @Override
    public void onUpdateReceived(Update update) {
        long chatId = 0;
        int messageId = 0;
        String textData = "";
        String updateType = "";
    }
}
