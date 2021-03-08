package org.knoldus.main.ques3

class Queue {

  var list:List[Any] = List()
  var front:Int = -1
  var rear:Int = -1


  def enqueue(key:Int):Unit={
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1
      list = list ::: List(key)
      return
    }
    list = list ::: List(key)
    this.rear = list.length;
  }

  // Method to remove an key from queue.
  def dequeue():Unit={
    // If queue is empty, return NULL.
    if (this.front == -1)
      return;

    // Store previous front and move front one node ahead
    list = list.drop(1)
    if(list.isEmpty) this.front = -1
    else this.front = this.front + 1

    // If front becomes NULL, then change rear also as NULL
    if (this.front == -1)
      this.rear = -1;
  }



}
