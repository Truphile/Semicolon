'''
step 1 - prompt user to write father's current age from age 1 to age 80
step 2 - prompt user to write collect son's current age from age 1 to age 80
step 3 - substract the son's age from the father's age
step 4 - then subtract the age of the son from the result of step 3 to get the years
step 5 - then you compare the years to be equal to or greater than zero
step 6 - print result

'''

father = int(input('Enter father current age:  '))
son = int(input('Enter son current age:  '))

age_difference = father - son

year_difference = age_difference - son

year_in_the_past = abs(year_difference > father)

if father > son and father >= 80 and son > 1:
	print('invalid input')
	if year_difference > father:
		print(abs(year_in_the_past))
elif year_difference >= 0:
	print('Number of years ago' ,year_difference)
elif year_difference <= 0:
	print('Wrong calculation!')
else :
	print('invalid input')
