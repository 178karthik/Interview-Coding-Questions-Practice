package org.example.Practice2;

public class countOfOccurenceOfSubstring {
    public static void main(String[] args) {
        String str = "abababc";
        String substr = "ab";
        int index = 0;
        int count = 0;
        while (index != -1) {
            index = str.indexOf(substr, index);
            if(index!=-1) {
                index = index + substr.length();
                count++;
            }
        }
        System.out.println(count);
    }
    }

