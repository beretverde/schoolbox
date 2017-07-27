#include <iostream>
using namespace std;


class Clicker
{
	private:
	
		int counter;

	public:
	
		Clicker() :counter(0) {}

		void click() {
			counter++;
		}
	
		void reset() {
			counter = 0;
		}
	
		void display() {
			cout <<"Counter: "<<counter<< endl;
		}
	
};