package main;

import java.io.*;

public class Main {
    public static void main(String[] jkl){
        String path="C:\\Users\\Baby Beast\\Desktop\\finalisima\\newFile.txt";
        File file=new File(path);
        int data;
        try {
            file.createNewFile();
            DataOutputStream out=new DataOutputStream(new FileOutputStream(path));
            out.writeInt(100);

            DataInputStream in=new DataInputStream(new FileInputStream(path));
           data= in.readInt();
            System.out.println(data);
in.close();
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
