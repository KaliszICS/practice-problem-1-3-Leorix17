/*
	File Name: Lesson 1.3 - Strings
	Author: Leo
	Date Created: Feb 16, 2026
	Date Last Modified: Feb 16, 2026
*/

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		String shape1;
		String shape2;
		String shape3;
		shape1 = " * * * * * *\n" + "* * * * * *\n" + " * * * * * *\n" + "* * * * * *\n" + " * * * * * *\n" + "* * * * * *\n";
		shape2 = "* * * * *\n" + "*       *\n" + "*       *\n" + "*       *\n" + "* * * * *\n";
		shape3 = "* * * * * *\n" + " *       *\n" + "  *     *\n" + "   *   *\n" + "    * *\n" + "     *";
		System.out.println(shape1);
		System.out.println(shape2);
		System.out.println(shape3);
	}

	public static void q2() {
		//Write question 2 code here
		String cat;
		cat = "          '__'\n" + "          (oo)\n" + "  /========//\n" + " / || XX ||\n" + "*  ||----||\n" + "   VV    VV\n" + "   ''    ''";
		System.out.println(cat);
	}

	public static void q3() {
		//Write question 3 code here
		String word1;
		String word2;
		word1 = "Fortnite ";
		word2 = "is awful";
		System.out.print(word1);
		System.out.println(word2);
	}

	public static void q4() {
		//Write question 4 code here
		String word1;
		String word2;
		word1 = "Don't ";
		word2 = "@ me";
		System.out.println(word1 + word2);
	}


}
