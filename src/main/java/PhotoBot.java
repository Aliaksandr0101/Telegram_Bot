import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PhotoBot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "OverOneWoolBot";
    }

    @Override
    public String getBotToken() {
        return "6542101141:AAGve2lUkPS59A2pO4khjbpELlyU1LB6Orc";
    }
    /*
AgACAgIAAxkBAAOIZMrLt2k9rwNsbOSOrDeyVtyonHAAAk7TMRv4sllK5ZMTN5-R0gwBAAMCAAN4AAMvBA альпака
AgACAgIAAxkBAAOJZMrLtz1IEifH30O4brASbBkUcB8AAk_TMRv4sllKPmnrLzXaCH0BAAMCAAN4AAMvBA ангорская коза
AgACAgIAAxkBAAOKZMrLt7FyPi4uQtXDFKZBPp--qjgAAlDTMRv4sllK2At2CGwYs9oBAAMCAAN5AAMvBA кашимирская коза
AgACAgIAAxkBAAOLZMrLt7n2aYNt78GVFGryhYcSa1YAAlHTMRv4sllKMDQkfvTm3mIBAAMCAAN4AAMvBA ангарский кролик
AgACAgIAAxkBAAOMZMrLtxneTnOH9nbTNsCoL0rsm2YAAlLTMRv4sllKaSr_yq7ij_IBAAMCAAN5AAMvBA лама
AgACAgIAAxkBAAONZMrLt8_zUSHITp8oGWuAJH7_OywAAlPTMRv4sllKAAHxXoijVusZAQADAgADeAADLwQ овца
AgACAgIAAxkBAAOOZMrLt5SV7OKTauFQ4vq3Fq5BWXwAAlTTMRv4sllKt0qRCSCnCp0BAAMCAAN5AAMvBA верблюд
AgACAgIAAxkBAAOPZMrLt68Mv-YuRmtCDNF_c-oMDwcAAlXTMRv4sllKB-5XIrIDlfUBAAMCAAN5AAMvBA викуньи
AgACAgIAAxkBAAP_ZMvX1KaLZskhxpKCpOlbLV3uaq4AAlrOMRt8rmFK4EYz-L8UmeQBAAMCAAN5AAMvBA попробуй снова */

    @Override
    public void onUpdateReceived(Update update) {
      /*  загрузка фото*/
        if (update.hasMessage() && update.getMessage().hasPhoto()) {
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(update.getMessage().getChatId().toString());
            List<PhotoSize> photos = update.getMessage().getPhoto();
            String idPhoto = photos.stream().sorted(Comparator.comparing(PhotoSize::getFileSize)
                    .reversed()).findFirst().orElse(null).getFileId();
            sendMessage.setText(idPhoto);
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
                KeyboardRow keyboardRowOne = new KeyboardRow();
                keyboardRowOne.add(new KeyboardButton("Alpaca"));
                keyboardRowOne.add(new KeyboardButton("Angora goat"));
                keyboardRowOne.add(new KeyboardButton("Cashmere goat"));
                keyboardRowOne.add(new KeyboardButton("Angora rabbit"));
                KeyboardRow keyboardRowTwo = new KeyboardRow();
                keyboardRowTwo.add(new KeyboardButton("lama"));
                keyboardRowTwo.add(new KeyboardButton("Sheap"));
                keyboardRowTwo.add(new KeyboardButton("Camel"));
                keyboardRowTwo.add(new KeyboardButton("Vicuñas"));
                List<KeyboardRow> animalForWool = new ArrayList<>();
                animalForWool.add(keyboardRowOne);
                animalForWool.add(keyboardRowTwo);
                ReplyKeyboardMarkup buttonWithAnimal = new ReplyKeyboardMarkup();
                buttonWithAnimal.setKeyboard(animalForWool);
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(update.getMessage().getChatId().toString());
                sendMessage.setText(update.getMessage().getText());
                sendMessage.setReplyMarkup(buttonWithAnimal);

                SendPhoto answerPhoto = new SendPhoto();
                answerPhoto.setChatId(update.getMessage().getChatId().toString());
                InputFile answerInputFile = new InputFile();

                switch (update.getMessage().getText()){

                    case "Alpaca":
                        answerInputFile.setMedia("AgACAgIAAxkBAAOIZMrLt2k9rwNsbOSOrDeyVtyonHAAAk7TMRv4sllK5ZMTN5-R0gwBAAMCAAN4AAMvBA");
                        break;
                    case "Angora goat":
                        answerInputFile.setMedia("AgACAgIAAxkBAAOJZMrLtz1IEifH30O4brASbBkUcB8AAk_TMRv4sllKPmnrLzXaCH0BAAMCAAN4AAMvBA");
                        break;
                    case "Cashmere goat":
                        answerInputFile.setMedia("AgACAgIAAxkBAAOKZMrLt7FyPi4uQtXDFKZBPp--qjgAAlDTMRv4sllK2At2CGwYs9oBAAMCAAN5AAMvBA");
                        break;
                    case "Angora rabbit":
                        answerInputFile.setMedia("AgACAgIAAxkBAAOLZMrLt7n2aYNt78GVFGryhYcSa1YAAlHTMRv4sllKMDQkfvTm3mIBAAMCAAN4AAMvBA");
                        break;
                    case "lama":
                        answerInputFile.setMedia("AgACAgIAAxkBAAOMZMrLtxneTnOH9nbTNsCoL0rsm2YAAlLTMRv4sllKaSr_yq7ij_IBAAMCAAN5AAMvBA");
                        break;
                    case "Sheap":
                        answerInputFile.setMedia("AgACAgIAAxkBAAONZMrLt8_zUSHITp8oGWuAJH7_OywAAlPTMRv4sllKAAHxXoijVusZAQADAgADeAADLwQ");
                        break;
                    case "Camel":
                        answerInputFile.setMedia("AgACAgIAAxkBAAOOZMrLt5SV7OKTauFQ4vq3Fq5BWXwAAlTTMRv4sllKt0qRCSCnCp0BAAMCAAN5AAMvBA");
                        break;
                    case "Vicuñas":
                        answerInputFile.setMedia("AgACAgIAAxkBAAOPZMrLt68Mv-YuRmtCDNF_c-oMDwcAAlXTMRv4sllKB-5XIrIDlfUBAAMCAAN5AAMvBA");
                        break;
                    default:
                        answerInputFile.setMedia("AgACAgIAAxkBAAP_ZMvX1KaLZskhxpKCpOlbLV3uaq4AAlrOMRt8rmFK4EYz-L8UmeQBAAMCAAN5AAMvBA");
                        break;
                }
                answerPhoto.setPhoto(answerInputFile);
                try {
                    execute(answerPhoto);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }




