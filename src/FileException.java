import java .util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileException {
    public static void main(String[] args) {
        try{
            readFile("nila.text");
        }
        catch(FileNotFoundException e){
            System.out.println("Exception caught " + e.getMessage());
        }
    }
    public static void readFile(String FileName) throws FileNotFoundException{
        File fileObj = new File(FileName);
        Scanner input = new Scanner(fileObj);
while (input .hasNextLine()){
    String Line = input.nextLine();
    System.out.println(Line);

}

    }
}
