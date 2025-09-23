'''
favourite number guess
write out the correct number and save it 
then ask user to guess the number then save the guess
if user guess is correct
then print right number message
if the user guess is wrong 
then print wrong message
'''

favorite_number = int(7)

guess_number = int(input('Enter guess number '))

if guess_number == favorite_number:
	print('That is my favorite number!')
else :
	print('Nice try, guess again!')




