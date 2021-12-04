package alx.rogatko.mainActivity;

public class Field {
    private char[][] field = new char[10][10];
    public static char empty = ' ';
    public static char busy = 'X';
    public static char shotEmpty = '*';
    public static char shotOk = 'o';
    char getPoint(int a, int b){
        return field[a][b];


    }
    char[][] getField() {
        return field;
    }

    boolean possibility(int a, int b) {

        return true;
    }

    public boolean getStatus(int a, int b) {
        if (field[a][b] != empty) return false;
        return true;
    }

    public void setBusy(int a, int b) {
        field[a][b] = busy;
    }



    public void setShotEmpty(int a, int b) {
        field[a][b] = shotEmpty;
    }



    public void setShotOk(int a, int b) {
        field[a][b] = shotOk;
    }

    void initial() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = empty;

            }


        }


    }

    boolean winCheck(char[][] field) {

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
