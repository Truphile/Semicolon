


'''
- prompt the user write first score
- prompt the user write another score
- prompt the user write the third score
- then add the three score together 
- make e divide the result from the addition of the three scores by 3 naso to get the average
- come use the average compare to grades 'A to F'
'''

first_score = int(input('Enter score one: '))
second_score = int(input('Enter score two: '))
third_score = int(input('Enter score three: '))


addition_scores = first_score + second_score + third_score 
print('The sum of the numbers:' ,addition_scores)

average_score = addition_scores // 3

print('The average score:' , average_score)


if 90 <= average_score <= 100:
	print('The grade is A')
elif 80 <= average_score < 90:
	print('The grade is B')
elif 70 <= average_score < 80:
	print('The grade is C')
elif 60 <= average_score < 70:
	print('The grade is D')
else:  
	print('The grade is F')





