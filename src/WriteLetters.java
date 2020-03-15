import java.io.*;
public class WriteLetters
{
    public static void main(String[] args) throws IOException
    {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                            'v', 'w', 'x', 'y', 'z'};

        System.out.println("Opening the file.");
        RandomAccessFile randomFile = new RandomAccessFile("Letter.txt", "rw");

        System.out.println("Wtritting to the file.");
        for(int i = 0; i < letters.length; i++)
        {
            randomFile.writeChar(letters[i]);
        }

        randomFile.close();
        System.out.println("Done.");

    }
}
