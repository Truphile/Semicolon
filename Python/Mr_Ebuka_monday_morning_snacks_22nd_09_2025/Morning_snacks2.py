number_one = int(input('Enter an integer '))
number_two = int(input('Enter an integer '))
number_three = int(input('Enter an integer '))

second_largest_number = number_two

if number_one < number_two and number_one > number_three or number_one > number_three and number_one < number_two :
	 second_largest_number = number_one
elif number_two > number_one and number_two < number_three or number_two > number_three and number_two < number_one:
	 second_largest_number = number_two
else :
	second_largest_number = number_two
print(second_largest_number)