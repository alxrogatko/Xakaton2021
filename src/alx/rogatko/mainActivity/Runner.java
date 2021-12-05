package alx.rogatko.mainActivity;

public class Runner {
    public static void shot(char a, int b, Field f) {//отправляем букву клетки, цифру и класс с полем для выстрела

        int a1;
        a1 = (int) (a) - 65;

        b--;
        if (f.getPoint(a1, b) == Field.empty) {
            f.setShotEmpty(a1, b);
        } else if (f.getPoint(a1, b) == Field.busy) {
            f.setShotOk(a1, b);
        } else {
            shot(a, b++, f);
        }


    }
}
