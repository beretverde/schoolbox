#Tyler Jacox
#Lab 1 – Hello World
#CS 2705 

# This program prints your first and last name. Input is the system call to put the prompt on the screen
firstName = input('Enter the first name: ')

lastName = input('Enter the last name: ')

# Display the name
print('Hello {0} {1} '.format(firstName, lastName))


# This program prompts for the first two numbers. 
number1 = input('Enter first number: ')
number2 = input('Enter second number: ')

# Create a variable called “sum” and add two numbers together. Converts the numbers to a float data type.
sum = float(number1) + float(number2)

# Display the sum on the screen. The numbers in curly braces are the variables
print('The sum of {0} and {1} is {2}'.format(number1, number2, sum))
