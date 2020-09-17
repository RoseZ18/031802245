package com.RoseZ;
import java.io.PrintStream;
import java.io.FileNotFoundException;
public class IO {
    public static void output(String outputPath, String result) {

        try {
            System.setOut(new PrintStream(outputPath));//把创建的打印输出流赋给系统。即系统下次向 ps输出
            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
