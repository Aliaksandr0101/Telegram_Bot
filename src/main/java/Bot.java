import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class Bot extends TelegramLongPollingBot {


    public String getBotUsername() {
        return "OverOneWoolBot";
    }

    public String getBotToken() {
        return "6542101141:AAGve2lUkPS59A2pO4khjbpELlyU1LB6Orc";
    }

    public void onUpdateReceived(Update update) {
        /*if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            String chatId = update.getMessage().getChatId().toString();
            String greetings = "Привет";

            if (messageText.equalsIgnoreCase(greetings)) {
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText("Hello!!! What is your name?");
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (!messageText.equalsIgnoreCase(greetings)) {
                Message inMess = update.getMessage();
                String chatIdTwo = inMess.getChatId().toString();
                String answerUser = inMess.getText();
                SendMessage messageForUser = new SendMessage();
                messageForUser.setChatId(chatId);
                messageForUser.setText(answerUser + ", below are the types of wool. Click the button and find out better.");
                try {
                    execute(messageForUser);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }*/
    }
}








