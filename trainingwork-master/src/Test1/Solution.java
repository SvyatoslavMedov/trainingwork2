package Test1;

import java.io.*;

public class Solution {

//    public static void main(String[] args) throws IOException {
//        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
//        String file1 = "1.txt";
//        String file2 = "2.txt";
//        String file3 = "3.txt";
//
//        FileInputStream fileInputStream = new FileInputStream(file1);
//        FileInputStream fileInputStream2 = new FileInputStream(file2);
//
//        int fileData = 0;
//        byte [] buffer1 = new byte[fileInputStream.available()];
//        byte [] buffer2 = new byte[fileInputStream2.available()];
//        int file1Data = 0;
//        while (fileInputStream.available() > 0) {
//            int data = fileInputStream.read(buffer1);
//            int data2 = fileInputStream.read(buffer2);
//            file1Data = data + data2;
//        }
//
//        FileOutputStream fileOutputStream = new FileOutputStream(file1);// открыт поток для записи в 1 файл
////        FileInputStream fileInputStream2 = new FileInputStream(file2);// открыт поток для чтения 2 файл
//        FileInputStream fileInputStream3 = new FileInputStream(file3);
//        while (fileInputStream3.available() > 0) {
//            int dt = fileInputStream2.read() + fileInputStream3.read();
//            fileOutputStream.write(dt);
//        }
////        while (fileInputStream3.available() > 0) {
////            int dt = fileInputStream3.read();
////            fileOutputStream.write(dt);
////        }
//
//
//        fileOutputStream.write(buffer1, 0, file1Data);
//        fileInputStream2.close();
//        fileInputStream.close();
//        fileOutputStream.close();
//
//
//    }
//
//}

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = "1.txt";
        String file2 = "2.txt";
        String file3 = "2.txt";
//
//        String file1 = reader.readLine();
//        String file2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1);
        // сначала считываем первый файл
        int file1Data = 0;
        byte[] buffer1 = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read(buffer1);
            file1Data = data; // и записываем в како-то буффер
        }

        FileOutputStream fileOutputStream = new FileOutputStream(file1);// открыт поток для записи в 1 файл
        FileInputStream fileInputStream2 = new FileInputStream(file2); // открыт поток для чтения 2 файл
        while (fileInputStream2.available() > 0) {
            int dt = fileInputStream2.read();
            fileOutputStream.write(dt);
        }
        fileOutputStream.write(buffer1, 0, file1Data); //дописываем данные из буффера
        fileInputStream2.close();
        fileInputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream3 = new FileInputStream(file1);// сначала считываем первый файл
        int file2Data = 0;
        byte[] buffer2 = new byte[fileInputStream3.available()];
        while (fileInputStream3.available() > 0) {
            int data2 = fileInputStream3.read(buffer2);
            file2Data = data2; // и записываем в како-то буффер
        }

        FileOutputStream fileOutputStream2 = new FileOutputStream(file1);// открыт поток для записи в 1 файл
        FileInputStream fileInputStream4 = new FileInputStream(file3); // открыт поток для чтения 2 файл
        while (fileInputStream3.available() > 0) {
            int dt = fileInputStream4.read();
            fileOutputStream2.write(dt);
        }

        fileOutputStream2.write(buffer2, 0, file2Data); //дописываем данные из буффера
        fileInputStream3.close();
        fileInputStream2.close();
        fileOutputStream2.close();

    }
}