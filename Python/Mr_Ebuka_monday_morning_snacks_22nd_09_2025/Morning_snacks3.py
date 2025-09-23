number_one = int(input('Enter an integer '))
number_two = int(input('Enter an integer '))
number_three = int(input('Enter an integer '))
number_four = int(input('Enter an integer '))

largest_number = number_one 

if number_two > largest_number:
	largest_number = number_two
if number_three > largest_number:
	LARGEST_NUMBER = number_three
if number_four > largest_number:
	LARGEST_NUMBER = number_four
print('The largest is ' ,largest_number)

smallest_number = number_one

if number_two < smallest_number:
	smallest_number = number_two
if number_three < smallest_number:
	smallest_number = number_three
if number_four < smallest_number:
	smallest_number = number_four
print('The smallest is ' ,smallest_number)
	
sum_of_number = number_one + number_two + number_three + number_four
print('The sum of all four numbers ', sum_of_number)

sum_of_number_of_smallest_and_largest = smallest_number + largest_number
print('The sum of the smallest and largest number ', sum_of_number_of_smallest_and_largest)

median_number = (sum_of_number - sum_of_number_of_smallest_and_largest) // 2
print('The median of the numbers are' , median_number)

mean_number = sum_of_number // 4
print('The mean of the numbers are ' ,mean_number)