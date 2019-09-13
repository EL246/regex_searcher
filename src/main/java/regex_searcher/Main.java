package main.java.regex_searcher;

public class Main {
    public static void main(String[] args) {
/*        if (args.length != 2) {
            System.out.println("Usage: regex_searcher <pattern> <string>");
        }
        // first argument is regex pattern
        String pattern = args[0];

        // second argument is string to be matched
        String stringToMatch = args[1];

        Parser parser = new Parser(pattern, stringToMatch);
        System.out.println(parser.parse());*/

        Parser p1 = new Parser("abc", "abc");
        assert p1.parse();
        Parser p2 = new Parser("abcdefg","abc");
        assert !p2.parse();
        Parser p3 = new Parser("abc","abcdefg");
        assert !p3.parse();
        Parser p4 = new Parser("abd","abc");
        assert !p4.parse();
        Parser p5 = new Parser("a.c","a.c");
        assert p5.parse();
        Parser p6 = new Parser("a.c","abc");
        assert p6.parse();
        Parser p7 = new Parser("a?bc","abc");
        assert p7.parse();
        Parser p8 = new Parser("a?bc","ac");
        assert p8.parse();
        Parser p9 = new Parser("?aab","ab");
        assert p9.parse();
        Parser p10b = new Parser("E+.","ERR");
        assert p10b.parse();
        Parser p10 = new Parser("ERROR: *.","ERROR: file not found");
        assert p10.parse();
        Parser p11 = new Parser("ERROR: *.","WARNING: file not found");
        assert !p11.parse();
        Parser p12 = new Parser("test?", "test");
        assert p12.parse();
        Parser p13 = new Parser("test*.", "test");
        assert p13.parse();
        Parser p14 = new Parser("test.","test");
        assert !p14.parse();
        Parser p15 = new Parser("abc*.gh*.", "abcdefghijklmn");
        assert p15.parse();
        Parser p16 = new Parser("abc+def?ghij*k*.","abcdefghijklmn");
        assert p16.parse();
    }
}
