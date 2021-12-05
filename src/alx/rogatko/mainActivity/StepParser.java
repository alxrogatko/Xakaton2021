package alx.rogatko.mainActivity;

public class StepParser {//парсим ход и возвращаем его массивом
    static String[] array = new String[2];
    public static String[] stepParser(String a){
        a = a.toUpperCase();
    array[0]= (String.valueOf(a.charAt(0)));
    array[1]=String.valueOf(a.charAt(1));
    return array;

    }



}
