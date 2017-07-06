#include<iostream>
#include "fraction.h"

using namespace std;

int gcd(int u, int v)

{
	u = (u < 0) ? -u : u;			// make u non-negative
	v = (v < 0) ? -v : v;			// make v non-negative

	while (u > 0)
	{
		if (u < v)
		{
			int t = u;	// swap u and v
			u = v;
			v = t;
		}

		u -= v;
	}

	return v;				// the GCD of u and v
}

ostream & operator<<(ostream & out, fraction & f)
{
	out << f.numerator << "/" << f.denominator << endl;
	return out;
}

istream & operator>>(istream & in, fraction & f)
{
	cout << "Enter the Numerator" << endl;
	cin >> f.numerator;

	cout << "Enter the Denominator" << endl;
	cin >> f.denominator;

	return in;
}

//Uses GCD above to reduce the fraction to lowest possible terms
fraction::fraction(int n, int d):numerator(n),denominator(d) 
{
	int	common = gcd(numerator, denominator);
	numerator /= common;
	denominator /= common;
}

fraction operator+(fraction f1, fraction f2)
{
	int num = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
	int den = f1.denominator*f2.denominator;
	return fraction(num, den);
}


//subtracts a fraction object and returns a new fraction obj result
fraction operator-(fraction f1,fraction f2)
{
	int num = f1.numerator*f2.denominator -f1.denominator*f2.numerator;
	int den = f1.denominator*f2.denominator;
	return fraction(num,den);
}

//multiplies a fraction object and returns a new fraction object result
fraction operator*(fraction f1,fraction f2)
{
	int num = f1.numerator*f2.numerator;
	int den = f1.denominator*f2.denominator;
	return fraction(num,den);
}

//divides a fraction object and returns a new fraction obj result
fraction operator/(fraction f1, fraction f2)
{
	int num = f1.numerator*f2.denominator;
	int den = f1.denominator*f2.numerator;
	return fraction(num,den);
}

