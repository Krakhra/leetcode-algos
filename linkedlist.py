#Author Kirat Rakhra
#Learning basics of python from scratch :)

class Node(object):
  #initialize object 
  def __init__(self,data):
    self.data = data
    self.next = None
  #removes node
  def remove(self,data,previous):
    if self.data == data:
      previous.next = self.next
      del self.data
      del self.next
    else:
      if self.next is not None:
        self.next.remove(data,self)




     