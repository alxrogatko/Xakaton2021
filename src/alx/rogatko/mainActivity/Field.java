package alx.rogatko.mainActivity;

public class Field {
    private char[][] field = new char[10][10];//игровое поле двумерный массив
    public static char empty = ' ';//символ пустой ячейки
    public static char busy = 'X';//корабля
    public static char shotEmpty = '*';//попадания по пустой ячейке
    public static char shotOk = 'o';//попадания по кораблю
    char getPoint(int a, int b){//получаем символ из ячейки ab
        return field[a][b];


    }
    char[][] getField() {//получаем массив с полем
        return field;
    }

    boolean possibility(int a, int b) {

        return true;
    }

    public boolean getStatus(int a, int b) {//проверка, пустая ли клетка
        if (field[a][b] != empty) return false;
        return true;
    }

    public void setBusy(int a, int b) {//установка части корабля в ячейку ab
        field[a][b] = busy;
    }



    public void setShotEmpty(int a, int b) {//установка статуса попал в пустую ячейку
        field[a][b] = shotEmpty;
    }



    public void setShotOk(int a, int b) {//установка статуса попадания по кораблю
        field[a][b] = shotOk;
    }

    void initial() {//возврат всего поля к пустому значению
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = empty;

            }


        }


    }

    boolean winCheck(char[][] field) {//проверка поля на конец игры

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == busy) {
                    return false;
                }

            }
        }
        return true;

    }
}
