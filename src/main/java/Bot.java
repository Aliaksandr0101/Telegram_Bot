import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendAudio;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {


    public String getBotUsername() {
        return "OverOneWoolBot";
    }

    public String getBotToken() {
        return "6542101141:AAGve2lUkPS59A2pO4khjbpELlyU1LB6Orc";
    }

    ///cristina perri - a thousand years CQACAgIAAxkBAAMKZMVR8YnNtX6iLFd3r-nVQAkGIPQAApcuAAJz6DBKN6qKDgbOwwABLwQ
    ///dba perfect the way you are  CQACAgIAAxkBAAMMZMVVPrroHd_iZ8FqZeVxx64If5IAArMuAAJz6DBKCZDb-D-shc0vBA
    /// deep koliis love  CQACAgIAAxkBAAMOZMVVhy2SmuNyN81Bf2iZ0FAvh3QAArkuAAJz6DBKQi2HaLTKSBAvBA

    public void onUpdateReceived(Update update) {
        SendAudio audio = new SendAudio();
        audio.setChatId(update.getMessage().getChatId().toString());
        audio.setAudio(new InputFile("CQACAgIAAxkBAAMMZMVVPrroHd_iZ8FqZeVxx64If5IAArMuAAJz6DBKCZDb-D-shc0vBA"));
        audio.setCaption("song for you");
        for (int i = 0; i < 3; i++) {
            try {
                execute(audio);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }


    }
}
