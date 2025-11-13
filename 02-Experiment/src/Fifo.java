import java.util.Arrays;
import java.util.Scanner;

//2(b).Queue using class
class Queue{
    private int maxsize,front,rear;
    private int[] queue;

    public Queue(int size){
        maxsize=size;
        front=-1;
        rear=-1;
        queue=new int[maxsize];
    }

    boolean isFull(){
        if(front==0 && rear==maxsize-1){
            return true;
        }
        return false;
    }

    boolean isEmpty(){
        return front==-1;
    }

    void enQueue(int element){
        if(isFull()){
            System.out.println("Queue is Full");
        }

        if (front<0){
            front=0;
        }

        queue[++rear]=element;
    }

    void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        System.out.println("Dequeue Element is "+queue[front++]);
    }

    void printQueue(){
        System.out.print("[ ");
        for (int i = front; i < queue.length; i++) {
            System.out.print(queue[i]+"->");
        }
        System.out.println("null ]");
    }

    void Front(){
        System.out.println("Front --> "+queue[front]);
    }

    void Rear(){
        System.out.println("Rear --> "+queue[rear]);
    }
}

public class Fifo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue q1=new Queue(5);
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.printQueue();
        q1.Front();
        q1.Rear();
        q1.deQueue();
        q1.printQueue();
        q1.Front();
        q1.Rear();
    }
}
