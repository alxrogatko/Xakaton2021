package alx.rogatko.mainActivity;

public class PrintField {
   static void view(char[][] array){

        System.out.print("   A B C D E F J H I J");
        System.out.println();

for(int i = 0; i<array.length;i++){System.out.print(i+1);if(i+1<10){
    System.out.print(" ");
}
    System.out.print("|");
    for(int j=0;j<array[i].length;j++){


        System.out.print(array[i][j]+"|");
    }
    System.out.println();

}


    }
}
