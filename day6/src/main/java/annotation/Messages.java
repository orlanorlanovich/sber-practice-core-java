package annotation;

import static annotation.Colors.*;

@Print(style = "arrow", color = RED)
public class Messages {

    @Print(style = "hurray", color = PURPLE)
    public String happyBirthday() {
        return "С днём рождения!";
    }

    @Print(style = "!", color = YELLOW)
    public String warning() {
        return "Предупреждение";
    }

    public String error() {
        return "Ошибка";
    }
}