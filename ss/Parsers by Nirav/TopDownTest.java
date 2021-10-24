class TopDownWithoutBackTrack {
    private static final String EPSILON = "";

    private static String replaceAt(int index, String subject, String replacement, int size) {
        return subject.substring(0, index) + replacement + subject.substring(index + size);
    }

    public String parse(String equation) {
        System.out.println("Steps: ");

        String parsed = "E";
        int indexInEquation = 0, index = 0, count = 0;
        equation = equation.replaceAll(" ", "");

        while (index < parsed.length()) {
            count++;
            System.out.println(String.format("%2d", count) + ": " + parsed);

            if (parsed.charAt(index) == 'E') {
                // E''
                if (index < parsed.length() - 2 && parsed.charAt(index + 1) == '\''
                        && parsed.charAt(index + 2) == '\'') {
                    if (indexInEquation < equation.length() && equation.charAt(indexInEquation) == '+') {
                        parsed = replaceAt(index, parsed, "+E", 3);
                        indexInEquation++;
                    } else
                        parsed = replaceAt(index, parsed, EPSILON, 3);
                }
                // E
                else {
                    parsed = replaceAt(index, parsed, "TE''", 1);
                }
            } else if (parsed.charAt(index) == 'T') {
                // T''
                if (index < parsed.length() - 2 && parsed.charAt(index + 1) == '\''
                        && parsed.charAt(index + 2) == '\'') {
                    if (indexInEquation < equation.length() && equation.charAt(indexInEquation) == '*') {
                        parsed = replaceAt(index, parsed, "*T", 3);
                        indexInEquation++;
                    } else
                        parsed = replaceAt(index, parsed, EPSILON, 3);
                }
                // T
                else {
                    parsed = replaceAt(index, parsed, "VT''", 1);
                }
            } else if (parsed.charAt(index) == 'V') {
                parsed = replaceAt(index, parsed, "<id>", 1);
                indexInEquation++;
                index += 4;
            } else
                index++;
        }
        System.out.println(String.format("%2d", ++count) + ": " + parsed);
        System.out.println("Completed in " + count + " steps.");
        return parsed;
    }
}

public class TopDownTest {
    public static void main(String[] args) {
        System.out.println("TopDownWithoutBackTrack");
        TopDownWithoutBackTrack a = new TopDownWithoutBackTrack();

        String parsed = a.parse("a * b + c");

        System.out.println("Parsed: " + parsed);

        // System.out.println(a.replaceAt(1, "TE''", "+E", 3));
    }
}
