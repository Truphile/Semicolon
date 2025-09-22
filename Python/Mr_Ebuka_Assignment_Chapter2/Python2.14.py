#220 per minutes - your age
#50 - 85% highest rate

beat_per_minutes = 220
lowest_heart_target = 50/100
highest_heart_target = 85/100

number_of_years = int(input('Enter an integer '))

maximum_heart_rate = int(beat_per_minutes) - number_of_years
print('Your maximum heart rate is' ,maximum_heart_rate)

low_target = maximum_heart_rate * lowest_heart_target
high_target = maximum_heart_rate * highest_heart_target

print('Your heart low target is:' ,low_target)
print('Your heart high target is:' ,high_target)

DOCUMENTATION
''' calculating a users heart target and maximum heart rate
first ask for the users age
then to get the maximum heart rate
use the constant(heart rate in beat per minutes) which is 220 and subtract it from the the age the user provided
then get the heart target both the low point and highest point
multipy them by the the value you get for the maximum haert rate
then you print out your result


'''

