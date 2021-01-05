# Amazon is running a promotion in which customers receive prizes for purchasing a secret combination of fruits. 
# The combination will change each day, and the team running the promotion wants to use a code list to make it easy to 
# change the combination. The code list contains groups of fruits. Both the order of the groups within the code list and 
# the order of the fruits within the groups matter. However, between the groups of fruits, any number, and type of fruit is 
# allowable. The term "anything" is used to allow for any type of fruit to appear in that location within the group.

# Consider the following secret code list: [[apple, apple], [banana, anything, banana]]
# Based on the above secret code list, a customer who made either of the following purchases would win the prize:
# orange, apple, apple, banana, orange, banana
# apple, apple, orange, orange, banana, apple, banana, banana

# iterate thru cart, increase codeIndex by one each time item is found in secret cart, if we reach end of secret array then return
# 1 else return 0
def solution(secret, cart):
  if len(secret) <= 0 or len(cart) <= 0:
    return 0

  codeIndex = 0
  currentGroup = 0
  groupStack=[secret[codeIndex]]
  
  for i in range(len(cart)):
    if groupStack[codeIndex] == 'anything':
      codeIndex +=1
      continue

    if cart[i] == groupStack[codeIndex]:
      codeIndex +=1

    if codeIndex == len(groupStack)-1:
      currentGroup +=1
      if currentGroup == len(secret):
        break
      codeIndex = 0
      groupStack = secret[currentGroup]
  if(currentGroup == len(secret) -1 and codeIndex == len(groupStack)):
    return 1
  return 0
   


cart = ["apple","banana","orange","banana","orange", "apple"]
code = [['apple','apple'],['banana','anything','banana']]
ret = solution(code,cart)
print(ret)