//2(a).Stack using java

import java.util.Arrays;
import java.util.Scanner;

class Stack{
    private int maxsize,top;
    private int[] stack;

    public Stack(int size){
        maxsize=size;
        top=-1;
        stack=new int[maxsize];
    }

    boolean isEmpty(){
        return top==-1;
    }

    boolean isFull(){
        return top==maxsize-1;
    }

    void push(int element){
        if (isFull()){
            System.out.println("Stack Overflow");
        }
        stack[++top]=element;
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        System.out.println("Removed Element "+stack[top]);
        top--;
    }

    void printStack(){
        System.out.println("Stack : "+ Arrays.toString(stack));
    }

    void topElement(){
        System.out.println("Top -> "+stack[top]);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack st=new Stack(5);
        boolean a=true;
        int choice;
        while(a) {
            System.out.println("Enter your Choice");
            System.out.println("1.Push  2.Pop  3.Display  4.Top  5.Exit");
            choice=sc.nextInt();

            if(choice==1){
                System.out.print("Enter the Element to Push Stack : ");
                int element=sc.nextInt();
                st.push(element);
            }

            else if (choice==2) {
                st.pop();
            }

            else if (choice==3) {
                st.printStack();
            }

            else if (choice==4) {
                st.topElement();
            }

            else if (choice==5) {
                System.out.println("Exit");
                break;
            }

            else{
                System.out.println("Invalid choice");
            }
        }
    }
}
