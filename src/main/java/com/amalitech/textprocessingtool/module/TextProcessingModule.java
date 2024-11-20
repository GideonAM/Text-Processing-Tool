package com.amalitech.textprocessingtool.module;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessingModule {

    public String displayMatches(String inputText, String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputText);

        if (matcher.find()) {
            return String.format("Match found at position %d: %s", matcher.start(), matcher.group());
        }

        return "No match found";
    }

    public String searchAndReplace(String inputText, String regexPattern, String replacement) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputText);
        return matcher.replaceAll(replacement);
    }
}
