package alx.rogatko.mainActivity;

public class MainActivity {
    private Field f;

    public static void main(String[] args) {
//test
        Field f = new Field();
        f.initial();
        System.out.println(f.winCheck(f.getField()));
        PrintField.view(f.getField());
        f.setBusy(0, 0);
        PrintField.view(f.getField());
        f.setShotEmpty(1, 1);
        PrintField.view(f.getField());
        f.setShotOk(2, 2);
        PrintField.view(f.getField());
        System.out.println(f.winCheck(f.getField()));
        Runner.shot('D',1,f);
        PrintField.view(f.getField());
        Runner.shot('A',1,f);
        gf(f.getField());
        Runner.shot('J',10,f);
        gf(f.getField());
        f.initial();
        gf(f.getField());


//test end
    }
    //
   static void gf(char[][] a){PrintField.view(a);}//синтаксический сахар для вывода на печать
}
