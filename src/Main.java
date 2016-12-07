import untar.fti.*;

public class Main {

	// Sample method for evaluating infix expression. Don't change this if you don't know what you do.
	public static void evaluate(String expression) throws Exception {
		if (ParenthesesChecker.checkBalance(expression)) {
			String postfix = Postfix.convertToPostfix(expression);			
			double result = Postfix.evaluatePostfix(postfix);
			System.out.println(expression + " = " + result);
		}
		else
			throw new Exception("Unmatched parentheses.");
	}

	public static void main(String[] args) throws Exception {
		// you can write any checking code here (will not affect automatic grading)
		System.out.println("Feel free to add any checking code you need here");
		evaluate("1+2+3+4+5");
		
		// don't change this line below if you want to see the checker result
		Checker.check();
	}

}
