package alx.rogatko.mainActivity;

public class Field {
    private char[][] field = new char[10][10];
    private char empty = ' ';
    private char busy = 'X';
    private char shotEmpty = '*';
    private char shotOk = 'o';
    char[][] getField(){return field;}
    boolean possibility(int a, int b) {

        return true;
    }

    public boolean getStatus(int a, int b) {
        if(field[a][b]!=empty)return false;
        return true;
    }

    public void setBusy(int a,int b) {
        field[a][b] = busy;
    }

    public char getShotEmpty() {
        return shotEmpty;
    }

    public void setShotEmpty(int a,int b) {
        field[a][b]=shotEmpty;
    }

    public char getShotOk() {
        return shotOk;
    }

    public void setShotOk(int a, int b) {
       field[a][b]=shotOk;
    }

    void initial() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = empty;

            }


        }


    }

    boolean winCheck() {
        boolean win = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == busy) {
                    win = false;
                    break;
                }

            }
            if (win = false) {
                return false;
            }


        }
        return true;

    }
}
