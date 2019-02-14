package algorithms;

import java.util.*;
import java.io.*;

class LongestWord {
    public static String LongestWord(String sen) {

        // code goes here
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        int len = sen.length();
        int longest = 0;
        int count = 0;
        StringBuffer longestWord =null;
        StringBuffer currentWord= new StringBuffer();
        for(int i=0 ;i<len ; i++) {
            char c = sen.charAt(i);
            if(c!=' ') {
                if(c!='!' && c!='@' && c!='#' && c!='&') {
                    count++;
                    currentWord.append(c);
                }
            }
            else {

                if(count>longest){
                    longest=count;
                    longestWord = new StringBuffer(currentWord);
                }
                currentWord.delete(0,currentWord.length());
                count=0;
            }

        }
        return longestWord.toString();
    }
    }

