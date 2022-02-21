package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {

        String chTest = "Alice au pays des merveilles avec Tigrou.";

        Pattern regex = Pattern.compile("\\b[Aa][\\wé]");
        Matcher match = regex.matcher(chTest);

        while (match.find())
        {
            System.out.println(match.group() + " " + match.start() + " " + match.end());

        }

    }
}
