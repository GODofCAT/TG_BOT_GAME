package org.example.bot.util;

public class ButtonsStorage {
    public static class Button {
        private String name;
        private String callBackData;

        public Button(String name, String callBackData) {
            this.name = name;
            this.callBackData = callBackData;
        }

        public String getName() {
            return name;
        }

        public String getCallBackData() {
            return callBackData;
        }

    }

    public final static Button ButtonStart = new Button("Начать игру", "ButtonStart");

    public final static Button ButtonAttack = new Button("Атаковать", "ButtonAttack");
    public final static Button ButtonDefense = new Button("Защитить", "ButtonDefense");
    public final static Button BackToMenuMain = new Button("В главное меню", "BackToMenuMain");



}
