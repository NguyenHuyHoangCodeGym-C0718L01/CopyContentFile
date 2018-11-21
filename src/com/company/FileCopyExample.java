package com.company;

import java.io.*;

public class FileCopyExample {
    public void copyFile(String fileSource, String fileDesti) {
        try {
            File source = new File(fileSource);
            if (!source.exists()) {
                throw new FileNotFoundException();
            }

            File dest = new File(fileDesti);
            if (!dest.exists()) {
                dest = new File("dest.txt");
            }

            BufferedWriter wr = new BufferedWriter(new FileWriter(dest));

            BufferedReader br = new BufferedReader(new FileReader(source));
            String line = "";
            while ((line = br.readLine()) != null) {
                wr.write(line);
                wr.newLine();
            }
            wr.close();
            br.close();
            System.out.println("Ghi file thành công");
        }catch (Exception e){
            System.out.println("Lỗi");
        }
    }

    public static void main(String[] args){
        FileCopyExample fileCopyExample = new FileCopyExample();
        fileCopyExample.copyFile("C:\\Users\\huyho\\IdeaProjects\\CopyContentFile\\source.txt", "C:\\Users\\huyho\\IdeaProjects\\CopyContentFile\\hello.txt");
    }
}
