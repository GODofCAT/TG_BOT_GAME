package org.example.bot.statemachine;

public class TransmittedData {

    private org.example.bot.statemachine.State state;
    private final org.example.bot.statemachine.DataStorage dataStorage;
    private final long chatId;

    public TransmittedData(long chatId) {
        this.chatId = chatId;
        state = org.example.bot.statemachine.State.CommandStart;
        dataStorage = new org.example.bot.statemachine.DataStorage();
    }

    public void setState(org.example.bot.statemachine.State state) {
        this.state = state;
    }

    public org.example.bot.statemachine.State getState() {
        return state;
    }

    public org.example.bot.statemachine.DataStorage getDataStorage() {
        return dataStorage;
    }

    public long getChatId() {
        return chatId;
    }
}
