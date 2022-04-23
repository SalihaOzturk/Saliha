package day16_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        //verilen string i tersten yazdiran bir kod yaziniz

        String str="Valla bu java cok zevkli";

        for(int i = 0; i < 10; i++) {}

        for(int i = str.length()-1 ; i >=0 ; i--){
            System.out.println(str.substring(i,i+1));
        }





    }
}
