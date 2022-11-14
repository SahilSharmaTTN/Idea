import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws FileNotFoundException {

        //System.out.println("Hello world!");

        String filename = "/home/sahils/abc.txt";
        File textfile = new File(filename);

        Scanner in =  new Scanner(textfile);

        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(line);
        }

        in.close();

    }
}