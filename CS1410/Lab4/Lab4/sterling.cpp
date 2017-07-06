#include <iostream>
#include <iomanip>
#include "sterling.h"

using namespace std;

sterling make_sterling(int pounds, int shillings, int pence)
{
	sterling temp;
	temp.pounds = pounds;
	temp.shillings = shillings;
	temp.pence = pence;
	return temp;
}

//12 pence = 1 shilling
//20 shilling = 1 pound
//shilling = 12 pence;
//pound= 240 pence;

sterling make_sterling(int pence)
{
	sterling temp;
	temp.pounds = pence / 240;
	pence %= 240;
	temp.shillings = pence / 12;
	pence %= 12;
	temp.pence = pence;
	return temp;

}

sterling add(sterling x, sterling y)
{
	int i1 = x.pounds * 240 + x.shillings * 12 + x.pence;
	int i2 = y.pounds * 240 + y.shillings * 12 + y.pence;
	
	return make_sterling(i1 + i2);
}

void print(sterling& a)
{
	cout.fill('0');
	cout << (char)156 << a.pounds << "."<<setw(2)<< a.shillings << "." <<setw(2)<< a.pence << endl;
	cout.fill(' ');
}

void read(sterling* b)
{
	cout << "Please enter Pounds" << endl;
	cin >> b->pounds;
	cout << "Please enter Shillings" << endl;
	cin >> b->shillings;
	cout << "Please enter Pence" << endl;
	cin >> b->pence;
}

