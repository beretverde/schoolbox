#include<iostream>
#include"sterling.h"

using namespace std;

int main() {
	sterling st1;
	st1 = make_sterling(278);
	sterling st2;
	st2 = make_sterling(3,5,11);

	print(add(st1, st2));

	sterling st3;
	st3 = make_sterling(1, 5, 5);

	sterling st4;
	st4 = make_sterling(1, 8, 6);

	sterling st5;
	st5 = make_sterling(1, 10, 6);

	sterling st6;
	st6 = make_sterling(1, 10, 6);

	sterling st7;
	st7 = make_sterling(5, 15, 9);

	sterling st8;
	st8 = make_sterling(6, 14, 8);
	
	print(add(st3, st4));

	print(add(st5, st6));

	print(add(st7, st8));

	sterling st9;
	sterling* ptr = &st9;

	sterling st10;
	sterling* ptr1 = &st10;
	read(ptr);
	read(ptr1);
	print(add(st9,st10));

	return 0;
}