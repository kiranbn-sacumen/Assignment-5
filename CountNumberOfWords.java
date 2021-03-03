package com.company;
import java.io.BufferedReader;
import java.io.FileReader;

public class CountNumberOfWords {
    public static void main(String[] args) throws Exception{
        String line;
        int count=0;
        BufferedReader br;
         FileReader file = new FileReader("count.txt");
            BufferedReader br = new BufferedReader(file);

        while((line =br.readLine())!=null){
            String words[]=line.split("");
            count=count+words.length;
        }
        System.out.println("Number of words present in a given file:"+count);
        br.close();


    }
}
