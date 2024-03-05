package com.ajmal.anagrams;


// Given an array of strings, group anagrams together.
// For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Return:
// [
//   ["ate", "eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]
// Note: All inputs will be in lower-case.

import java.util.*;

public class Annagrams {

    public static String TEST = "111111";

    public static void main(String[] args) {
        //System.out.println("Hello world!"); eat, eet, eeat, teae
        String[] anagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<Set> anagaramsGroups = new ArrayList<>();

        for (int i = 0; i < anagrams.length; i++) {
            Set<String> anagramSet = new HashSet<>();
            if (!anagrams[i].equals(TEST)) {
                anagramSet.add(anagrams[i]);

                for (int j = i + 1; j < anagrams.length; j++) {
                    if (validateAnagram(anagrams[i], anagrams[j])) {
                        anagramSet.add(anagrams[j]);
                        anagrams[j] = TEST;
                    }
                }
                anagaramsGroups.add(anagramSet);
            }
        }


        System.out.println(anagaramsGroups);


    }


    public static boolean validateAnagram(String firstAnagram, String anagramToValidate) {
        int sizeFirst = firstAnagram.length();
        int sizeSecond = anagramToValidate.length();

        if (sizeSecond == sizeFirst) {
            char[] sortedStringFirst = firstAnagram.toCharArray();
            Arrays.sort(sortedStringFirst);

            char[] sortedStringSecond = anagramToValidate.toCharArray();
            Arrays.sort(sortedStringSecond);

            String first = Arrays.toString(sortedStringFirst);
            String second = Arrays.toString(sortedStringSecond);
            if (!first.equals(second)) {
                return false;
            }
            return true;
            /*for (int i = 0; i < sizeFirst; i++) {
               if(sortedStringFirst[i] != sortedStringSecond[i]){
                   return false;
               }

            }*/

        }
        return false;

    }
}