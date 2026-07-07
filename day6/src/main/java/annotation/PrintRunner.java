package annotation;

import java.lang.reflect.Method;

public class PrintRunner {

    public static void print(Object obj) {
        Class<?> clazz = obj.getClass();

        Print classPrint = clazz.getAnnotation(Print.class);
        String classColor = classPrint != null ? classPrint.color() : Colors.WHITE;
        String classStyle = classPrint != null ? classPrint.style() : "";

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            Print methodPrint = method.getAnnotation(Print.class);

            String color = classColor;
            String style = classStyle;

            if (methodPrint != null) {
                color = methodPrint.color();
                style = methodPrint.style();
            }

            try {
                Object result = method.invoke(obj);
                if (result != null) {
                    String text = result.toString();
                    String styledText = styleText(text, style);
                    System.out.println(color + styledText + Colors.RESET);
                }
            } catch (Exception e) {
                // пропускаем
            }
        }
    }

    private static String styleText(String text, String style) {
        switch (style) {
            case "arrow":
                return "→ " + text + " ←";
            case "hurray":
                return "!!! " + text + " !!!";
            case "!":
                return "! " + text + " !";
            default:
                return text;
        }
    }
}