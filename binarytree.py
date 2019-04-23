class Node(object):
  def __init__(self,data):
    self.data = data
    self.left = None
    self.right = None 

  #method which inserts data into the tree
  def insert(self,data):
    if data < self.data:
      if not self.left:
        self.left.data = data 
      else:
        self.left.insert(data)
    else:
      if not self.right:
        self.right.data = data
      else:
        self.right.insert(data)
  #method to remove node
  def remove(self,data,node):
    if data < self.data:
      if self.left:
        self.left.remove(data,self)
    elif data > self.data:
      if self.right:
        self.right.remove(data,self)
    else:
      #2 childs
      if self.right and self.left:
        self.data = self.right.get_min()
        self.right.remove(self.data,self)
      #if node is left leaf
      elif node.left == self:
        if self.left:
          temp = self.left
        else:
          temp = self.right
        parent = self.right
      #if node is right leaf
      elif node.right == self:
        if self.right:
          temp = self.left
        else:
          temp = self.right
        parent.right = temp

  
  #method to get min element
  def get_min(self):
    if self.left is None:
      return self.data
    else:
      return self.left.get_min()
  #method to get max element
  def get_max(self):
    if self.right is None:
      return self.data
    else:
      return self.right.get_max()
  #method which traverses tree in order
  def inorder(self):
    if self.left:
      self.left.inorder()
    print(self.data)
    if self.right:
      self.right.inorder()


  
  