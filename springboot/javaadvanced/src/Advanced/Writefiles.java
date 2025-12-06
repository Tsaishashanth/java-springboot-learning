package Advanced;

import java.io.FileWriter;
import java.io.IOException;


public class Writefiles {
    public static void main(String[] args)  {
        //how to write a file using java
        //basically writefiles will create a file in java

        //file writer = good for small or medium-sized textfiles
        //bufferdwriter = bettter performance for large amounts of tet
        //printwrite = best for structured data , like reports or logs
        //fileoutputstream = best for binary files (eg - images, audio files)



        try(FileWriter writer = new FileWriter("C:\\Users\\a\\Desktop\\test.txt")){//this creates a file test.text in the desktop

            writer.write("i like pizza");
            System.out.println("file has been written");
        }
        catch(IOException e) {       //we are writing Io here because without this it gave ioexception
            System.out.println("could not write file");
        }

    }
}

