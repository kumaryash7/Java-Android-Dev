  // TRY AND CATCH BLOCKS TO HANDLE ERROR

public class CWh_53 {
    public static void main(String[] args) {
        int a = 6000;
        int b=0;
        try {
            int c = a/b;
            System.out.println(" the result is "+ c);

        }catch (Exception e){
            System.out.print(" we failed to divide. Reason :");
            System.out.println(e);
        }
        System.out.println(" End of the Program");
    }
}
