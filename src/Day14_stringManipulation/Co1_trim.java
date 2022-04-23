package Day14_stringManipulation;

public class Co1_trim {
    public static void main(String[] args) {

        String str="   Siz ne derseniz deyin, Java bildigini okur.   ";


        str.trim();
        System.out.println(str);    //siz ne derseniz deyin,Java bidigini okur.Bosluklu
        System.out.println(str.length());  //49


        str=str.trim();
        System.out.println(str); //Siz ne derseniz deyin, Java bildigini okur.
        System.out.println(str.length()); // 43














    }











}
