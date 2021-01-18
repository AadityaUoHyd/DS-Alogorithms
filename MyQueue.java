//Write a Java program to implement Queue, using Array.

package org.aadi.test.queue;
 
public class MyQueue {
     
    private int capacity;
    int queueArr[];
    int front = 0;
    int rear = -1;
    int currSize = 0;
     
    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
 
    //adding element at the end.
    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow!! cannot add element: "+item);
        } else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            queueArr[rear] = item;
            currSize++;
            System.out.println("Element " + item+ " been pushed successfully.");
        }
    }
 
    //removes an element from the top of the queue
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow!! Can't remove element.");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Popped sucessfully. Element been removed: "+queueArr[front-1]);
                front = 0;
            } else {
                System.out.println("Popped sucessfully. Element been removed: "+queueArr[front-1]);
            }
            currSize--;
        }
    }
 
    //verifies, is queue full?
    public boolean isQueueFull(){
        boolean status = false;
        if (currSize == capacity){
            status = true;
        }
        return status;
    }
     
    //verifies, is queue empty?
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currSize == 0){
            status = true;
        }
        return status;
    }
     
    public static void main(String a[]){
         
        MyQueue queue = new MyQueue(5);
        queue.enqueue(8);
        queue.dequeue();
        queue.enqueue(901);
        queue.enqueue(28);
        queue.enqueue(0000);
        queue.enqueue(281982);
        queue.enqueue(0);
        queue.enqueue(881);
        queue.dequeue();
        queue.enqueue(-8);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
