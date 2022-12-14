package org.example.bot.statemachine;

import com.google.common.util.concurrent.ServiceManager;
import org.example.bot.service.SharedService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.HashMap;
import java.util.Map;

public class ChatRouter {

    private static final Logger logger = LoggerFactory.getLogger(ChatRouter.class);

    private final Map<Long, TransmittedData> chats;
    private final ServiceManager serviceManager;

    public ChatRouter() throws Exception {
        chats = new HashMap<>();
        serviceManager = new ServiceManager();
    }

    public SendMessage route(long chatId, String textData) throws Exception {
        if (!chats.containsKey(chatId)) {
            chats.put(chatId, new org.example.bot.statemachine.TransmittedData(chatId));
        }

        org.example.bot.statemachine.TransmittedData transmittedData = chats.get(chatId);

        logger.info(String.format("ROUTE: %d %s", chatId, transmittedData.getState()));

    }

}
