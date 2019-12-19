package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifierExecutor = new PoemBeautifier();

        beautifierExecutor.beautify("Impossible is nothing", (txt) -> "*** "+txt+" ***");
        beautifierExecutor.beautify("Caution do not enter", (txt) -> txt.toUpperCase());
        beautifierExecutor.beautify("Super", (txt) -> txt+" "+(txt.replace('S','D')));
        beautifierExecutor.beautify("My name is", (txt) -> txt+"...");
    }
}
