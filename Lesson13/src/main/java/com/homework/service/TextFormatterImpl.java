package com.homework.service;

public class TextFormatterImpl implements TextFormatter {
    @Override
    public int getWordsCount(String text) {
        return getSplitStringArray(text).length;
    }

    @Override
    public boolean isPalindrome(String text) {
        String[] words = getSplitStringArray(text);
        for (String word : words) {
            if (word.length() > 1 && reverseString(word).equals(word)) {
                return true;
            }
        }
        return false;
    }

    public static Object reverseString(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb.toString();
    }

    public String[] getSplitStringArray(String text) {
        return text.replaceAll("[\"),:;!?{}.]", "").split("[\n\s-]");
    }
}