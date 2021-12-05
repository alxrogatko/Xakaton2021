package alx.rogatko.mainActivity;

public class MainActivity {
    private Field f;

    public static void main(String[] args) {
//test
        Field f = new Field();
        f.initial();
        gf(f.getField());
//end test
    }

    //
    static void gf(char[][] a) {
        PrintField.view(a);
    }//синтаксический сахар для вывода на печать
}
