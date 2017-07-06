#pragma once
#include<iostream>
using namespace std;

int gcd(int u, int v);

class fraction
{
private:
	int numerator;
	int denominator;
public:
	fraction(int n = 0, int d = 1);

	friend fraction operator+(fraction f1,fraction f2);
	friend fraction operator-(fraction f1,fraction f2);
	friend fraction operator*(fraction f1,fraction f2);
	friend fraction operator/(fraction f1,fraction f2);
	
	friend	ostream& operator<<(ostream& out, fraction& f);
	friend	istream& operator>>(istream& in, fraction& f);
};

