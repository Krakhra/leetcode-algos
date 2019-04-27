class heap(object):
  size = 10
  #initialize heap
  def __init__(self):
    self.heap = [0]*size
    self.current = -1

  #helper funtion which checks if heap is full
  def isFull(self):
    if self.current >= size:
      return True
    else:
      return False

  def getMax(self):
    max = self.heap[0]
    self.current -= 1
    self.heap

  #helper function which performs upheap
  def upHeap(self,index):
    parent_index = int((index-1)/2)

    while parent_index >=0 and self.heap[parent_index] < self.heap[index]:
      temp = self.heap[index]
      self.heap[index] = self.heap[parent_index]
      self.heap[parent_index] = temp
      index = parent_index
      parent_index = int((index-1)/2)

  #method to insert item into heap
  def insert(self,item):
    if self.isFull():
      print("heap is full")
      return
    else:
      self.current += 1 
      self.heap[current] = item
      self.upHeap(self.current)