package Advanced;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Readfiles {
    public static void main(String[] args) {
        //this topic tells about how to read files in java

        //Bufferedreader + filereader : best for reading text fiels line-by-line
        //fileinputstream: best for binary files (eg : images, audio files)
        //randomacessfile: best for read/write specific portions of a large file

        //we will copy the location of text file and store it in string;

        String filepath = "C:\\Users\\a\\Desktop\\test.txt";

        //BufferedReader reader = new BufferedReader(new FileReader(filepath)); -> this will show io exception so we use updated java
        //when reading files we have to use both bufferedreader and Filereader

        //when reading and writting files we need try and catch blocks
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){ //this is the enhanced one
            System.out.println("that file exists");

            //now below is the reading of files -> we use while loop for that
            String line;
            while((line = reader.readLine()) != null) { //we use while loop because we dont know how many lines we have in the file
                System.out.println(line);
            }

        }
        catch(FileNotFoundException e) {
            System.out.println("could not find file");
        }
        catch(Exception e) {
            System.out.println("something went wrong");
        }

    }
}
