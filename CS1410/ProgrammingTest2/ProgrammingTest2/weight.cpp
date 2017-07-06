#include<iostream>
using namespace std;

//Tyler Jacox CS1410 Programming Test 2

struct weight
{
	int stone;
	int pound;
	int ounce;
};

weight add(weight w1, weight w2) {
	static weight sum;
	sum.ounce = w1.ounce + w2.ounce;
	sum.pound = w1.pound + w2.pound;
	sum.stone = w1.stone + w2.stone;
	return sum;
}

void read(weight* w1) {
	cout << "Enter stones" << endl;
	cin >> w1->stone;
	cout << "Enter pounds" << endl;
	cin >> w1->pound;
	cout << "Enter ounces" << endl;
	cin >> w1->ounce;
	
}

void reduce(weight &w1) {

	int ounces = 0;

	//convert to lowest denomination
	ounces += w1.ounce;
	ounces += w1.pound * 16;
	ounces += w1.stone * 224;

	//distribute by greatest denomination
	w1.stone = ounces / 224;
	ounces %= 224;
	w1.pound = ounces / 16;
	ounces %= 16;
	w1.ounce = ounces;
}

void print(weight &w1) {
	reduce(w1); //Reduces to greatest denomination just for fun
	cout << w1.stone << " stones, " << w1.pound << " pounds, " << w1.ounce << " ounces" << endl;
}

//int main() {
//	weight w1, w2;
//
//	read(&w1);
//	read(&w2);
//	print(add(w1, w2));
//	
//	return 0;
//}