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

class LinkedList(object):
  def __init__(self):
    self.head =  None
    self.counter = 0

  def insert_head(self,data):
    n = Node(data)
    self.counter += 1
    #first element
    if not self.head:
      self.head = n
    
    else:
      n.next = self.head
      self.head = n

  def insert_last(self,data):
    n = Node(data)
    iter = self.head
    if iter == None:
      self.insert_head(data)
      return
    #iterate to last node
    while iter.next:
      iter = iter.next
    #insert
    iter.next = n

  def delete(self,data):
    if self.head:
      if self.head.data == data:
        self.head = self.head.next
      else:
        self.head.remove(data,self.head)

  def size(self):
    return self.size

  def print(self):
    iter = self.head
    while iter:
      print("%d " %iter.data)
      iter = iter.next

#test implementation
linked_list = LinkedList()
linked_list.insert_last(12)
linked_list.insert_last(22)
linked_list.insert_last(56)
linked_list.insert_last(2)
linked_list.insert_last(6)
linked_list.insert_last(8)

linked_list.delete(12)

linked_list.print()
     