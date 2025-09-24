


'''
- i say make the user write first score
- i say make the user write another score
- make the user write the third score
- then add the three score together 
- make e divide the result from the addition of the three scores by 3 naso to get the average
- come use the average compare to grades 'A to F'
'''

first_score = int(input('Enter score one '))
second_score = int(input('Enter score two '))
third_score = int(input('Enter score three '))


addition_scores = first_score + second_score + third_score 
print(addition_scores)

average_score = addition_scores // 3


if 90 <=  average_score and 100 <= average_score  :
	print('A')
elif average_score <= 80 and average_score < 90 :
	print('B')
elif average_score <= 70 and average_score < 80:
	print('C')
elif average_score <= 60 and average_score < 70 :
	print('D')
else : average_score <= 0 and average_score < 60 
print('F')





