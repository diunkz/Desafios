/*
Write a function solution that, given a string S of length N, returns any palindrome which can be obtained by replacing all of the question marks in S by lowercase letters ('a'−'z'). If no palindrome can be obtained, the function should return the string "NO".

A palindrome is a string that reads the same both forwards and backwards. Some examples of palindromes are: "kayak", "radar", "mom".

Examples:

1. Given S = "?ab??a", the function should return "aabbaa".

2. Given S = "bab??a", the function should return "NO".

3. Given S = "?a?", the function may return "aaa". It may also return "zaz", among other possible answers.

Assume that:

N is an integer within the range [1..1,000];
string S consists only of lowercases letters ('a' − 'z') or '?'.
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.

Copyright 2009–2020 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.

*/

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S) {
        int tamanhoString = S.length();
        int indiceMeioString = S.length()/2;
        int indiceFimString = S.length()-1;
        int sobe = 0;
        int desce = 0;

        char temp = 't';


        if ( (S.charAt(0) != '?' && S.charAt(indiceFimString) != '?') && (S.charAt(0) != S.charAt(indiceFimString)) ){
            return "NO";
        }
        else if(tamanhoString % 2 == 0){
            desce = indiceMeioString-1;
            sobe = indiceMeioString;
        }
        else if(tamanhoString % 2 != 0){
            sobe = indiceMeioString+1;
            desce = indiceMeioString-1;

            if (S.charAt(indiceMeioString) == '?'){
                S = S.substring(0, indiceMeioString) + 'a' + S.substring(indiceMeioString + 1);
            }
        }

        for(int x = 0; x<indiceMeioString; x++){
            if (S.charAt(sobe) == '?' && S.charAt(desce) == '?'){
                S = S.substring(0, sobe) + 'a' + S.substring(sobe + 1);
                S = S.substring(0, desce) + 'a' + S.substring(desce + 1);
            }
            else if (S.charAt(sobe) == '?' && S.charAt(desce) != '?'){
                S = S.substring(0,sobe) + S.charAt(desce) + S.substring(sobe + 1);
            }
            else if (S.charAt(desce) == '?' && S.charAt(sobe) != '?'){
                S = S.substring(0,desce) + S.charAt(sobe) + S.substring(desce + 1);
            }

            sobe++;
            desce--;
        }
        return S;
    }
}

