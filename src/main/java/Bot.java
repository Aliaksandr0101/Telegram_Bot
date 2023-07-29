import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {


    public String getBotUsername() {
        return "OverOneWoolBot";
    }

    public String getBotToken() {
        return "6542101141:AAGve2lUkPS59A2pO4khjbpELlyU1LB6Orc";
    }

    public void onUpdateReceived(Update update) {

    }
}
