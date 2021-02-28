class Stack{
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

class Queue{
  var list:List[Any] = List()
  var front:Int = -1
  var rear:Int = -1


  def enqueue(key:Int):Unit={
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1
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
    this.front = this.front + 1

    // If front becomes NULL, then change rear also as NULL
    if (this.front == -1)
      this.rear = -1;
  }


}

object StackNQueueImplementation {
  def main(args: Array[String]): Unit = {
    val ob = new Stack()
    ob.push(25)
    ob.push(65)
    ob.push(11)
    ob.push(22)
    ob.push(33)
    ob.push(44)

    // print Stack elements
    ob.display()

    // print Top element of Stack
    println("\nTop element is ="+ob.peek())

    // Delete top element of Stack
    ob.pop()
    ob.pop()

    // print Stack elements
    ob.display()

    // print Top element of Stack
    println("\nTop element is ="+ob.peek())

//Queue implementation

    val q = new Queue()
    q.enqueue(10)
    q.enqueue(20)
    q.dequeue()
    q.dequeue()
    q.enqueue(30)
    q.enqueue(40)
    q.enqueue(50)
    q.dequeue()



  }



}
