/*
 *  Name: Augustus Crosby
 *  Class: CSE 360
 *  Assignment: 1
 *  Description: A test of a palindrome tester Palindrome.java that tests to see whether an input is a palindrome, 
 * 		but ignores special characters and special characters
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test1() {
		Palindrome Pal = new Palindrome("racecar");
		assertNotNull(Pal);
		
	}
	
	@Test
	void test2() {
		Palindrome Pal = new Palindrome("racecar");
		assertTrue(Pal.isPalindrome());
	}
	
	@Test
	void test3() {
		Palindrome Pal = new Palindrome("race car");
		assertTrue(Pal.isPalindrome());
	}
	
	@Test
	void test4() {
		Palindrome Pal = new Palindrome("r a c e c a r");
		assertTrue(Pal.isPalindrome());
	}
	
	@Test
	void test5() {
		Palindrome Pal = new Palindrome("ra#ceca!!r");
		assertTrue(Pal.isPalindrome());
	}
	
	@Test
	void test6() {
		Palindrome Pal = new Palindrome("r a g e c a r");
		assertFalse(Pal.isPalindrome());
	}
	
	@Test
	void test7() {
		Palindrome Pal = new Palindrome("ra c 89 ec a 7 r");
		assertTrue(Pal.isPalindrome());
	}
	

}
