#include <iostream>
#include <string>

using namespace std;

string noSpace(string str);

bool noPunctuation(string str);

bool oneCase(string str);

string readString();

string reverse(string s);

void isPalindrome(string str);

//driver
int main() {
		
	isPalindrome(readString());

	return 0;
}

//Compare the string to its reverse to determine Palindrome
void isPalindrome(string str){
	if (str == reverse(str)) {
		cout << "This is a Palindrome" << endl;
	}
	else {
		cout << "This is not a Palindrome" << endl;
	}
}

//Take a String and reverse it
string reverse(string s)
{
	string r;

	for (int i = 0; i < s.length(); i++)
		r += s[s.length() - 1 - i];
	return r;
}

//Read and validate user input
string readString() {
	string str;
	cout << "Please Enter a string without punctuation, in a single case" << endl;
	do
	{
		getline(cin, str);
		str=noSpace(str);
		if (!noPunctuation(str)) {
			cout << "Please Remove the punctuation characters." << endl;
		}
		else if (!oneCase(str)) {
			cout << "Enter a Single Case." << endl;
		}
	} while (!noPunctuation(str) || !oneCase(str));
	return str;
}

//return true if there is no puctuation in a string
bool noPunctuation(string str) {

	for (int i = 0; i < str.length(); i++) {
		if (ispunct(str[i])) {
			return false;
		}
	}
	return true;
}

//return true if there is a single case throughout a string
bool oneCase(string str) {

	int isUpper = 0;
	int isLower = 0;
	for (int i = 0; i < str.length(); i++) {

		if (isupper(str[i])) {
			isUpper++;
		}
		else {
			isLower++;
		}
	}

		if (isUpper > 0 && isLower > 0) {
			return false;
		}
		else {
			return true;
		}
}

//Remove spaces from a string
string noSpace(string str) {
	for (int i = 0; i < str.length(); i++) {
		while (str[i] == ' ') {
			str.erase(i, 1);
		}
	}
	return str;
}