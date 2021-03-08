package org.knoldus.main.ques3

class Stack {
  var top:Int = -1
  var list:List[Any] = List()

  def push(element:Any):Unit={
    top = top + 1
    list = list ::: List(element)

  }

  def isEmpty:Boolean = {
    if(top < 0) true
    false
  }

  def peek():Any={
    if(!isEmpty) list(top)
    else "Stack is Empty"
  }

  def pop():Unit= {
    if (top < 0) "Stack is Underflow"
    else{
      top = top - 1
      list = list.dropRight(1)
    }

  }

  def display():Any={
    if (top < 0) "Stack is Underflow"
    else {
      var temp:Int = top
      while (temp > 0) {
        print(list(temp)+"->")
        temp = temp - 1;
      }
    }
  }


}
