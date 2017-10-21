#include <iostream>

using namespace std;

int arr[5] = { 0, 1, 2, 3, 4 };

void funFunction(unsigned int index) {
	if (index == 5)
		return;
	funFunction(index + 1);
	cout << arr[index] << " ";

}
int main() {
	int counter{ 0 };
	for (short i = 0; i != -1; i++) {
		cout << i << endl;
		counter++;
	}
	cout << "Counter: " << counter << endl;
}