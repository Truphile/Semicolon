number_one = int(input('Enter an integer '))
number_two = int(input('Enter an integer '))
number_three = int(input('Enter an integer '))


highest = number_one

if number_two > highest:
	 highest = number_two
if  number_three > highest:
	 highest = number_three
print(highest)

