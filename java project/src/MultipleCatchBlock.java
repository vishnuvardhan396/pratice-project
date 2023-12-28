public class MultipleCatchBlock {


    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("ArrayIndexOutOfBounds exception");
        }
        catch(Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("rest of the code");
    }


}
