//import java .io.File;
//import java .io.FileNotFoundException;
//import java.util.Scanner;
//public class PositiveNumbersException {
//    public static void main(String[] args) {
//        try {
//            checkNumbersFromFile("text.txt");
//            System.out.println("All numbers are negative");
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Exception caught" + e.getMessage());
//        } catch (PositiveNumbersException e) {
//            System.out.println("Exception caught " + e.getMessage());
//        }
//    }
//        public static void checkNumbersFromFile(String fileName) throws FileNotFoundException,PositiveNumbersException{
//
//        File fileObj = new File(fileName);
//            Scanner input =new Scanner(fileObj);
//
//while(input.hasNext()){
//    int Number = Integer.parseInt(input.nextLine());
//    if(Number>0){
//        throw new PositiveNumbersException(Number);
//
//    }
//}
//
//    }
//}
