// Calculate sum of non prime index values//
class CalculateSumOfNonPrimeIndexValues {
	public int sumOfNonPrimeIndexValues(int[] input1,int input2){
		// Read only region end
		int sum = 0;
		
		for (int i = 0; i < input2; i++) {
			if (!isPrime(i)) {
				System.out.print(i + ":: " + input1[i] + " ");
				sum += input1[i];
			}
		}
		
		return sum;
	}
	
	public static boolean isPrime (int input1) {
		if (1 == input1 || 0 == input1) return false;
		
		for (int i = 2; i < input1; i++) {
			if (i == input1) continue;
			if (input1 % i == 0) {
				//System.out.println("1");
				return false;
			}
		}
		//System.out.println("2");
		
		return true;
	}
}

// Find the one digit to be removed form palindrome//

public int digitRemove_Palin(int input1){
		// Read only region end
		StringBuilder num = new StringBuilder(String.valueOf(input1));
		//System.out.println(num);
		
		for (int i = 0; i < num.length(); i++) {
			if (palindromeCheck(num.toString())) return -1;
			
			char removedChar = num.charAt(i);
			String newNum = num.deleteCharAt(i).toString();
			//System.out.println(i + ":: " + newNum);
			if (palindromeCheck(newNum)) {
			    System.out.println(i + ":: " + newNum + " :: " + removedChar);
				return Integer.parseInt(String.valueOf(removedChar));
			} else {
				num.insert(i, removedChar);
			}				
		}
		
		return -1;
	}
	
	public static boolean palindromeCheck(String input1) {
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;

		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;

		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}

		return isPalindrome;
	}
}