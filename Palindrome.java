/*
 *  Name: Augustus Crosby
 *  Class: CSE 360
 *  Assignment: 1
 *  Description: A palindrome tester that tests to see whether an input is a palindrome, 
 * 		but ignores special characters and special characters
 */


public class Palindrome {
	
	private String testString;
	
	//constructor
	public Palindrome(String inputTestString) {
		testString = inputTestString;
	}
	
	//tests to check if testString is a palindrome. ignores spaces, special characters
	public boolean isPalindrome() {
		int index = 0; //Index for character array
		boolean palTruth = true; //default true so the while loop works
		int backwardsIndex = testString.length() - 1; //start of backwards index
		
		if(testString == null) {
			System.out.print("There is no Palindrome given");
			return false;
		}
		
		while(index < testString.length() && palTruth == true) {
			char testChar = testString.charAt(index);
			char secondTestChar = testString.charAt(backwardsIndex);
			
			int asciiFirst = (int) testChar;
			int asciiSecond = (int) secondTestChar;
			
			 // is it a uppercase or lowercase character
			if(asciiFirst <= 122 && asciiFirst >= 65 && (asciiFirst <= 90 || asciiFirst >= 97)){
				
				 // is the second a uppercase or lowercase character
				if (asciiSecond <= 122 && asciiSecond >= 65 && (asciiSecond <= 90 || asciiSecond >= 97)) {
					
					//at this point we can finally compare
					
					//are the 2 either the same character or upper/lower of one another
					if(asciiFirst == asciiSecond || asciiFirst == asciiSecond - 32 || asciiFirst == asciiSecond + 32 ) { 
						//if so, move on to others
						index++;
						backwardsIndex--;
					} else {
						//if not, done with while loop; return false
						palTruth = false;
					}
				} else {
					//if second character isn't a letter, move that index only
					backwardsIndex--;
				}
				//if first character is not, we'll still check the next too
			} else {
				index++;
				if (asciiSecond <= 122 && asciiSecond >= 65 && (asciiSecond <= 90 || asciiSecond >= 97)) {
					//nothing here, as we don't want to move index
				} else {
					//if not, move the other index as well
					backwardsIndex--;
				}
				
			}
			
			if (index >= backwardsIndex) {
				index = testString.length(); //if gets to the middle of word and it's all good; 
											 //while loop need not continue							
			}
			
		}
		
		if (palTruth == false) {
			return false;
		} else {
			return true;
		}
	}
	

}
