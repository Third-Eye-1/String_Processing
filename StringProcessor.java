import java.util.regex.*;

public class StringProcessor {

    public boolean isStrongPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$";
        return password.matches(regex);
    }

    public int calculateDigits(String sentence) {
        Pattern digitPattern = Pattern.compile("\\d");
        Matcher matcher = digitPattern.matcher(sentence);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public int calculateWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    public double calculateExpression(String expression) {
        javax.script.ScriptEngineManager manager = new javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = manager.getEngineByName("js");

        try {
            return (double) engine.eval(expression);
        } catch (javax.script.ScriptException e) {
            throw new IllegalArgumentException("Invalid expression: " + expression, e);
        }
    }

    public static void main(String[] args) {
        StringProcessor stringProcessor = new StringProcessor();

        System.out.println("Test case for isStrongPassword:");
        System.out.println("Case 1: " + stringProcessor.isStrongPassword("Strong@123"));
        System.out.println("Case 2: " + stringProcessor.isStrongPassword("WeakPassword"));
        System.out.println("Case 3: " + stringProcessor.isStrongPassword("NoDigitsOrSymbols"));
        System.out.println("Case 4: " + stringProcessor.isStrongPassword("MissingSymbol!"));
        System.out.println("Case 5: " + stringProcessor.isStrongPassword("12345@abcdeFGH"));

        System.out.println("\nTest case for calculateDigits:");
        System.out.println("Case 1: " + stringProcessor.calculateDigits("There is 1 digit in this sentence."));
        System.out.println("Case 2: " + stringProcessor.calculateDigits("No digits here!"));
        System.out.println("Case 3: " + stringProcessor.calculateDigits("1234567890"));
        System.out.println("Case 4: " + stringProcessor.calculateDigits("Digit1Digit2Digit3"));
        System.out.println("Case 5: " + stringProcessor.calculateDigits("Special@123Characters"));

        System.out.println("\nTest case for calculateWords:");
        System.out.println("Case 1: " + stringProcessor.calculateWords("This is a sentence."));
        System.out.println("Case 2: " + stringProcessor.calculateWords("SingleWord"));
        System.out.println("Case 3: " + stringProcessor.calculateWords("   Spaces   between   words   "));
        System.out.println("Case 4: " + stringProcessor.calculateWords(""));
        System.out.println("Case 5: " + stringProcessor.calculateWords("Word1 Word2 Word3"));

        System.out.println("\nTest case for calculateExpression:");
        System.out.println("Case 1: " + stringProcessor.calculateExpression("2 + 3 * 4"));
        System.out.println("Case 2: " + stringProcessor.calculateExpression("(5 - 2) / 2"));
        System.out.println("Case 3: " + stringProcessor.calculateExpression("10 / (2 + 3)"));
        System.out.println("Case 4: " + stringProcessor.calculateExpression("sqrt(25)"));
        System.out.println("Case 5: " + stringProcessor.calculateExpression("1.5 * 2.5"));
    }
}
