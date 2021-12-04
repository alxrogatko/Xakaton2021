package alx.rogatko.mainActivity;

public class MainActivity {
    private Field f;

    public static void main(String[] args) {
//test
        Field f = new Field();
        f.initial();
        PrintField.view(f.getField());
        f.setBusy(0, 0);
        PrintField.view(f.getField());
        f.setShotEmpty(1, 1);
        PrintField.view(f.getField());
        f.setShotOk(2, 2);
        PrintField.view(f.getField());

//test end
    }
}
