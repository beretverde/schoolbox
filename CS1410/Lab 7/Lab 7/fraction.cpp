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


//Uses GCD above to reduce the fraction to lowest possible terms
fraction::fraction(int n, int d):numerator(n),denominator(d) 
{
	int	common = gcd(numerator, denominator);
	numerator /= common;
	denominator /= common;
}

//adds a fraction object and returns a new fraction obj result
fraction fraction::add(fraction f)
{
	int num = f.numerator*denominator + f.denominator*numerator;
	int den = f.denominator*denominator;
	return fraction(num,den);
}

//subtracts a fraction object and returns a new fraction obj result
fraction fraction::sub(fraction f)
{
	int num = f.denominator*numerator - f.numerator*denominator;
	int den = f.denominator*denominator;
	return fraction(num,den);
}

//multiplies a fraction object and returns a new fraction object result
fraction fraction::mult(fraction f)
{
	int num = f.numerator*numerator;
	int den = f.denominator*denominator;
	return fraction(num,den);
}

//divides a fraction object and returns a new fraction obj result
fraction fraction::div(fraction f)
{
	int den = f.numerator*denominator;
	int num = f.denominator*numerator;
	return fraction(num,den);
}

//Prints the fraction obj
void fraction::print()
{
	cout <<numerator << "/" << denominator << endl;
}

//takes the user input and stores it in the fraction obj
void fraction::read()
{
	cout << "Enter the Numerator" << endl;
	cin >> numerator;
	
	cout << "Enter the Denominator" << endl;
	cin >> denominator;
}
