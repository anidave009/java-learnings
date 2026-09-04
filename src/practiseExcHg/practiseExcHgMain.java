package practiseExcHg;

import java.sql.SQLException;

public class practiseExcHgMain {

    public static int numReturn(){
        try{
            return 10;
        }catch(Exception e){
            System.out.println("Error in method");
        }
        finally {
            return 5;
        }
    }

    public static void main(String[] args){
    UsefulClass obj=new UsefulClass(200);

//    try{
//        obj.amountDikhao();
//        try{
//            System.out.println("230 rs diya hai tuje yad rakhna");
//            obj.paisaKato(230);
//            System.out.println("230 rs diya hai tuje yad rakhna");
//        }catch(Exception e){
//            e.printStackTrace();
//            System.out.println("amount is > then current deposit");
//    }
//    obj.amountDikhao();//agar inner catch does not handle the exc this line is skipped then.
//    }
//    catch(ArithmeticException e){
//        System.out.println("Kuch to exception aya iske liye mai(program flow) bahar aya !");
//    }

//        try{
//            System.out.println("first try");
//            try{
//                int arr[]={2,3,4,5,6};
//                if(arr[1]==3){
//                    throw new ArithmeticException("hehehehe");
//                }
//                System.out.println("did not caught exception , just executing the try block");
//            }catch(ArithmeticException e){
//                System.out.println("I am accessing the 5th element deliberately by arithmetic exception");
//            }catch(NullPointerException e){
//                System.out.println("I am accessing the 5th element deliberately by null pointer");
//            }catch(RuntimeException e){
//                System.out.println("I am accessing the 5th element deliberately by runtime exception");
//            }
//            finally {
//                System.out.println("This block will execute");
//            }
//        }catch(Exception e){
//            System.out.println("corresponding first outer catch");
//        }
//        System.out.println("BYE bye COME back");


        int numReturned=practiseExcHgMain.numReturn();
        System.out.println(numReturned);
    }
}
