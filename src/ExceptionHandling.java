public class ExceptionHandling {
     static void checkNum(int number) {
         try {
             if (number % 2 == 0) {
                 System.out.println("The number is even");

         } else {
                 throw new ArithmeticException("The number is odd");
             }
         } catch (Exception e) {
             System.out.println("Exception caught : " + e.getMessage());
         }


     }
         public static void main( String[] args) {
checkNum(9);
     }
}

