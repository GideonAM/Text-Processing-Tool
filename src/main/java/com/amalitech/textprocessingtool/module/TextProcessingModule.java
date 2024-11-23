package com.amalitech.textprocessingtool.module;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessingModule {

    public String searchRegexPattern(String inputText, String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputText);

        if (matcher.find()) {
            return String.format("Match found at index %d: %s", matcher.start(), matcher.group());
        }

        return "No match found";
    }

    public String matchTextWithRegex(String inputText, String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputText);
        return String.format("Input text matches given regex: %s", matcher.matches());
    }

    public String otherRegexPatterns(String inputText, String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputText);

        var list = new ArrayList<String>();
        while (matcher.find())
            list.add(matcher.group());

        return list.toString();
    }

    public String searchAndReplace(String inputText, String regexPattern, String replacement) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputText);
        return matcher.replaceAll(replacement);
    }
}
