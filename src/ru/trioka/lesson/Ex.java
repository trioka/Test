package ru.trioka.lesson;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) throws Exception{
        byte[] buffer = new byte[30];
        FileInputStream sourceFile = new FileInputStream("d:\\data2.txt");
        FileOutputStream destFile = new FileOutputStream("d:\\output.txt");
        while (true)
        {
            int size = sourceFile.read(buffer);   // читаем данные из файла в буфер

            destFile.write(buffer, 0, size);      // записываем данные из буфера в файл

            // прекращаем копирование, если буфер заполнен не полностью
            if (size < buffer.length) break;
        }

        System.out.println(Arrays.toString(buffer));
        sourceFile.close();
        destFile.close();
    }
}
