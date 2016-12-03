package com;

import java.util.Comparator;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 * Created by sagittarius on 12/3/2016.
 */
public class StringStreamFiltering {
    public static void main(String[] args) {
        new StringStreamFiltering().solution("a0Ba");
    }

    public int solution(String S) {
        Pattern p = Pattern.compile("\\d");

        Optional<String> max = p.splitAsStream(S)
                .filter(line -> line.matches("^.*[A-Z].*$"))
                .max(Comparator.comparingInt(String::length));

        return max.isPresent() ? max.get().length() : -1;
    }

}

