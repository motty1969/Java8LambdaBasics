package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {

		StringLambdaExample myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Lambda"));
		
		printLambda(s -> s.length());
		printLambda(s -> s.lastIndexOf('g'));
	}

	public static void printLambda(StringLambdaExample sl) {
		System.out.println(sl.getLength("Hello Again"));
	}
	interface StringLambdaExample {
		int getLength(String s);
	}
}
