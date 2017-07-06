#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

double mean(int count,int arr[]);

double deviation(int count, int arr[]);

void printHisto(int arr[]);

int* histogram(int* arr);

void printExtra(int arr[]);

int arrayLength(int *arr);

int main() {

	int testCase1[100] = { 100,95,90,85,80,75,70,65,60,40,20,5 };
	
	int testCase2[100] = { 30, 40, 45, 102, 35, 42, 65, 89, 55,
		                   48, 56, 46, 42, 54, 56, 51, 47, 50,
		                   51, 50, 50, 47, 52, 53, 47, 44, 69,
		                   35, 40, 45, 35, 42, 65, 55, 48, 100,
		                   56, 46, 42, 54, 56, 51, 47, 50, 51,
		                   50, 50, 47, 52, 53, 47, 78, 80,95 };
	int	scores[100] = {};
	int	count = 0;
	int temp = 0;
	cout << "Enter a score (-1 to stop): "<<endl;
	do
	{
		cin >> temp;
		if (temp < -1) {
			cout << "Please Enter a number >= 0 " << endl;
		}
		else if (temp > 0) {
			scores[count++] = temp;
		}
	} while (temp != -1);

	int length = sizeof(testCase1) / sizeof(int);

	//histogram(scores);
	//deviation(count, scores);
	
	int test[] = { 20,30,50,4,5,6 };
	cout<< sizeof(test) / sizeof(int);

	histogram(testCase1);
	deviation(12, testCase1);

	histogram(testCase2);
	deviation(54, testCase2);
		
}


int* histogram(int* arr) {


	int length=sizeof(arr) / sizeof(int);
	static int hist[10] = {};
	
	for (int x = 0; x < 100; x++) {
		if (arr[x] >= 90 & arr[x] <= 109) {
			hist[9]++;
		}
		else if (arr[x] >= 80 & arr[x] < 90) {
			hist[8]++;
		}
		else if (arr[x] >= 70 & arr[x] < 80) {
			hist[7]++;
		}
		else if (arr[x] >= 60 & arr[x] < 70) {
			hist[6]++;
		}
		else if (arr[x] >= 50 & arr[x] < 60) {
			hist[5]++;
		}
		else if (arr[x] >= 40 & arr[x] < 50) {
			hist[4]++;
		}
		else if (arr[x] >= 30 & arr[x] < 40) {
			hist[3]++;
		}
		else if (arr[x] >= 20 & arr[x] < 30) {
			hist[2]++;
		}
		else if (arr[x] >= 10 & arr[x] < 20) {
			hist[1]++;
		}
		else if (arr[x] <10 & arr[x] >0) {
			hist[0]++;
		}
	}
	printExtra(hist);
	return hist;
}

int arrayLength(int* arr) {
	
	return sizeof(arr) / sizeof(int);
}

//Single loop print function for extra credit question #1
void printExtra(int arr[]) {
	cout << "Histogram of Values" << endl;
	for (int y = 9; y >= 0; y--) {
		cout.fill('*');
		cout << " " << y << "| "<<setw(arr[y]+1)<<" "<<endl;
		cout.fill(' ');
	}
}

//Print function original implementation nested for loops
void printHisto(int arr[]) {
	cout << "Histogram of Values" << endl;
	for (int y = 9; y >= 0; y--) {
		cout<<" "<< y << "| ";
		for (int x = 0; x < arr[y]; x++) {
			cout << "*";
		}
		cout << endl;
	}
}

void printDev(double deviation) {

	cout << "SD: " << deviation << endl << endl;

}

double mean(int count,int arr[])
{
	double total = 0;
	for (int x = 0; x < 100; x++) {
		total += arr[x];
	}	
	return total /= count;
}

double deviation(int count, int arr[])
{
	double mn =mean(count, arr);
	double sum = 0, value = 0;
	for (int i = 0; i<count; i++)
	{
		value = pow(arr[i] - mn,2);
		sum += value;
	}
	double dev = sqrt(sum / count);
	printDev(dev);
	return dev;
}

