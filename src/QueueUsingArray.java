
public class QueueUsingArray {
    private int capacity;
    int Arr[];
    int front;
    int rear;
    int currentSize = 0;
    public QueueUsingArray(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        front = 0;
        rear = -1;
        Arr = new int[this.capacity];
    }
//    this function is used to add element in the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Cannot add more elements because queue is already full!!");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            Arr[rear] = data;
            currentSize++;
            System.out.println(data + " has been added to the queue!!");
        }
    }

//    this function is used to remove the element in the queue
//    data are remove from the front because  queue uses FIFO principle
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot remove elements because queue is already empty!!");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println(Arr[front - 1]
                        + " has been removed from the queue!!");
                front = 0;
            } else {
                System.out.println(Arr[front - 1]
                        + " has been removed from the queue!!");
            }
            currentSize--;
        }
    }

//    this isFull method is used to check whether the queue is full or not
//    if it is full it returns true else false

    public boolean isFull() {
        if (currentSize == capacity) {
            System.out.println("The queue is full!!");
            return true;
        }else {
            System.out.println("The queue is not full!!");
            return false;
        }
    }
    //    this isEmpty method is used to check whether the queue is empty or not
//    if it is empty it returns true else false

    public boolean isEmpty() {
        if (currentSize == 0) {
            System.out.println("The queue is empty!!");
            return true;
        }else {
            System.out.println("The queue is not empty!!");
            return false;
        }
    }

//    this peek method is used to fetch data from the front without removing the element.
    public void peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty so no any element is found!!");
        }else {
            System.out.println(Arr[front]);
        }
    }
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.isEmpty();
        queue.enqueue(10);
        queue.dequeue();
        queue.peek();
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.peek();
        queue.dequeue();
        queue.enqueue(50);
        queue.dequeue();
        queue.enqueue(60);
        queue.enqueue(70);
        queue.dequeue();
        queue.enqueue(80);
        queue.enqueue(90);
        queue.isFull();
    }
}
