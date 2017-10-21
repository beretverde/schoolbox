#include <iostream>
#include <string>

using std::cin;
using std::cout;
using std::endl;
using std::string;

//structs are common to communicate that this data structure 
//ONLY has data members
template <typename T>
struct Node {
	T data{};
	Node * link{ nullptr };
};

template <typename T>
class LinkedList {
public:
	//~LinkedList();  //TODO: Fix this.
	void insertLast(const T& item);
	void insertFirst(const T& item);
	void deleteFirst();
	void deleteLast();

	unsigned int size() const { return count; }

private:
	Node<T> * first{ nullptr };
	Node<T> * last{ nullptr };
	unsigned int count{ 0 };
};

template <typename T>
void LinkedList<T>::insertLast(const T& item) {

	if (first == nullptr) {
		//Scenario #1 - The list is empty
		first = new Node<T>;
		first->data = item;

		last = first;
		count++;
		return;
	}
	else {
		//Scenario #2 - The list has at least one item
		Node<T> * tempPtr = new Node<T>();
		tempPtr->data = item;

		last->link = tempPtr;

		last = tempPtr;

		count++;

	}
}

template <typename T>
void LinkedList<T>::insertFirst(const T& item) {
	//ALWAYS BE PARANOID ABOUT SCENARIOS

	//Scenario #2 The list has at least one item in it
	if (first == nullptr) {
		//Scenario #1 The list is empty

		first = new Node<T>();
		first->data = item;

		last = first;

	}
	else {

		Node<T> * tempPtr = new Node<T>();
		tempPtr->data = item;

		tempPtr->link = first;

		first = tempPtr;

	}

	count++;
}

template <typename T>
void LinkedList<T>::deleteFirst() {

	//Empty list 
	if (first == nullptr) {
		cout << "List is already empty" << endl;
		return;
	}

	//Scenario 1 or more nodes
	Node<T> * tempPtr{ nullptr }; //This is a plain pointer, nothing more.
	tempPtr = first;

	first = first->link;

	if (first == nullptr) {
		//Must have been only 1 node in the list
		last = nullptr;
	}

	delete tempPtr;
	tempPtr = nullptr;

	count--;

}

template <typename T>
void LinkedList<T>::deleteLast() {

	//2 or more node scenario
	Node<T> * curr{ nullptr };
	curr = first;

	//advance curr to the second to last node
	while (curr->link != last) {
		curr = curr->link;
	}
	//curr is now at the second to last node
	delete last;
	last = curr;
	last->link = nullptr;


}

int main() {

	LinkedList<string> pets;
	pets.insertLast("Jasper");
	pets.insertLast("Skeletor");
	pets.insertLast("Chikita");
	pets.insertLast("Lloyd");
	pets.insertLast("FSBO");
	pets.insertLast("Zoloft");

	pets.deleteFirst();
	pets.deleteFirst();
	pets.deleteFirst();
	pets.deleteFirst();
	pets.deleteFirst();
	pets.deleteFirst();
	pets.deleteFirst();

	cin.get();
	return 0;
}
