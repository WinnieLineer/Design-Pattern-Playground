package pers.design.pattern.decorator3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            // 原始輸入來源（Component）
            FileInputStream fis = new FileInputStream("example.txt");

            // 指定字元編碼：UTF-8
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

            // 使用 BufferedReader 提供 readLine()
            BufferedReader br = new BufferedReader(isr);

            String line = br.readLine();
            System.out.println("讀取內容: " + line);

            br.close(); // 關閉最外層，內部也會自動關閉

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

