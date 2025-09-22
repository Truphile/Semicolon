number_one = int(input('Enter first integer: '))
number_two = int(input('Enter second integer: '))
number_three = int(input('Enter third integer: '))

sum_0f_three_numbers = number_one + number_two + number_three
average_of_three_numbers = (number_one + number_two + number_three) / 3
product_0f_three_numbers = number_one * number_two * number_three

print('The sum of the three numbers is:' ,sum_0f_three_numbers)
print('The average of the three numbers is:' ,average_of_three_numbers)
print('The product of the three numbers is:' ,product_0f_three_numbers)

lowest = number_one

if(lowest > number_two):
	lowest = number_two

if(lowest > number_three):
	lowest = number_three

print("the smallest number is:",lowest)

highest = number_one

if(highest < number_two):
	highest = number_two

if(highest < number_three):
	highest = number_three

print("the largest number is:",highest)
