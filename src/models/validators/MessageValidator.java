package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Message;

public class MessageValidator {
    //バリデーションを実行する
    public static List<String> validate(Message m){
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(m.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }


        return errors;
    }

    //タイトルの必須入力をチェック
    private static String validateTitle(String title) {
        if(title == null || "".equals(title.strip())) {
            return "タイトルを入力してください。";
        }
        return "";
    }

    //メッセージの必須入力をチェック
    private static String validateContent(String content) {
        if(content == null || "".equals(content.strip())) {
            return "メッセージを入力してください。";
        }
        return "";
    }
}
