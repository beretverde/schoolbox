#include <iostream>
#include "fraction.h"
using namespace std;

int main()
{
	char	choice;
	fraction left;
	fraction right;
	fraction result;

	do
	{
		cout << "A\tAdd\n";
		cout << "S\tSub\n";
		cout << "M\tMult\n";
		cout << "D\tDiv\n";
		cout << "E\tExit\n";
		cout << "\nChoice?: ";

		cin >> choice;
		cin.ignore();
		switch (choice)
		{
			
		case 'A':
		case 'a':
			cin >> left;
			cin >> right;
			result = left + right;
			cout << result << endl;
			break;

		case 'S':
		case 's':
			cin >> left;
			cin >> right;
			result = left - right;
			cout << result << endl;
			break;

		case 'M':
		case 'm':
			cin >> left;
			cin >> right;
			result = left * right;
			cout << result << endl;
		
			break;

		case 'D':
		case 'd':
			cin >> left;
			cin >> right;
			result = left / right;
			cout << result << endl;
	
			break;

		case 'e':
		case 'E':
			break;

		default:
			cerr << "Unrecognized choice: " <<
				choice << endl;
			break;
		}
	} while (choice != 'e' && choice != 'E');

	fraction f1 = fraction(2, 3);
	fraction f2 = fraction(2, 3);
	
	fraction f3 = f1 + f2;
	cout << f3 << " = " << f1 << " + " << f2 << endl;

	fraction f4 = f2 + 2;
	cout << f4 << " = " << f2 << " + " << 2 << endl;

	fraction f5 = 2 + f1;
	cout << f5 << " = 2 + " << f1 << endl;
	return 0;
}
