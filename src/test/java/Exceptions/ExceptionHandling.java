package Exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        String str ="Word";


        try{
            System.out.println(str.charAt(200));
        }catch (StringIndexOutOfBoundsException e){
            e.printStackTrace();
        }




    }
}
