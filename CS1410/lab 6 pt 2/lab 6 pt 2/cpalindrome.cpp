#include <iostream>
#include <cstring>
using namespace std;

int main(int argc, char* argv[])
{
	char	palindrome[1000] = "";	
	char	palindromeRev[1000] = "";
	
	//Concatenate argv[] into a single CString 
	for (int i = 1; i < argc; i++) {
		strcat_s(palindrome, 1000, argv[i]);
	}
	
	//Check for punctuation
	for (int i = 0; i < strlen(palindrome); i++) {
		if (ispunct(palindrome[i])) {
			cout << "No punctuation please" << endl;
			return 0;
		}
	}

	//Check for a consistent casing
	int isUpper = 0;
	int isLower = 0;
	for (int i = 0; i < strlen(palindrome); i++) {

		if (isupper(palindrome[i])) {
			isUpper++;
		}
		else {
			isLower++;
		}
	}

	if (isUpper > 0 && isLower > 0) {
		cout << "Please use a single case" << endl;
		return 0;
	}

	//Create a copy of palindrome before reversing it
	strcpy(palindromeRev, palindrome);
	
	//Reverse the copy
	for (size_t i = 0; i < strlen(palindromeRev) / 2; i++)
	{
		char	temp = palindromeRev[i];
		palindromeRev[i] = palindromeRev[strlen(palindromeRev) - 1 - i];
		palindromeRev[strlen(palindromeRev) - 1 - i] = temp;
	}
	
	//Compare the two cstrings for equality
	if (strcmp(palindrome,palindromeRev)==0) {
		cout << "This is a Palindrome" << endl;
	}
	else {
		cout << "This is not a palindrome" << endl;
	}

	return 0;
}

