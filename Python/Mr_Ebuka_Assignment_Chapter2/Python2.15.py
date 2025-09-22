number_one = float(input('Enter first number '))
number_two = float(input('Enter second number '))
number_three = float(input('Enter third number '))

if number_one <= number_two and number_two <= number_three:
	print('Increasing order is ', number_one , number_two , number_three)
if number_one <= number_three and number_three <= number_two:
	print('Increasing order is ', number_one , number_three , number_two)
if number_two <= number_one and number_one <= number_three:
	print('Increasing order is ', number_two , number_one , number_three)
if number_two <= number_three and number_three <= number_one:
	print('Increasing order is ', number_two , number_three , number_one)
if number_three <= number_one and number_one <= number_two:
	print('Increasing order is ', number_three , number_one , number_two)
if number_three <= number_two and number_two <= number_one:
	print('Increasing order is ', number_three , number_two , number_one)























#for i in range(number_one, number_two, number_three):
	#print (i)