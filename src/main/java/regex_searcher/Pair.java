package main.java.regex_searcher;

class Pair {
    private String pattern;
    private int index;

    Pair(String pattern, int index) {
        this.pattern = pattern;
        this.index = index;
    }

    String getPattern() {
        return pattern;
    }

    int getIndex() {
        return index;
    }
}