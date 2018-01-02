import java.util.Scanner;

public class Stack1 {
	
		static int maxSize;
		static int[] a;
		static int top;
		public Stack1(int n) {
			top=-1;
			maxSize=n;
			a=new int[maxSize];
		}
		public static boolean isEmpty(){
			return top==-1;
		}
		public static boolean isFull(){
			return top==maxSize-1;
				
		}
		public static void push(int item){
			if(isFull())
				System.out.println("already full cannot insert new value");
			else 
				a[++top]=item;
		}
		public static void pop(){
			if(isEmpty())
				System.out.println("cannot remove bcz stack is empty");
			else{
				int val=a[top--];
				System.out.println(val+" has been deleted");
				}
		}
		public static void peek(){
			if(isEmpty())
				System.out.println("cannot remove bcz stack is empty");
			else{
				int val=a[top];
				System.out.println(val+"is the top value");
				}
		}
		public static void display(){
			if(isEmpty())
				System.out.println("statck is empty");
			else{
			for(int i=top;i>=0;i--)
				System.out.println(a[i]);
			}
		}
		public static void main(String[] args) {
			System.out.println("Enter the Array Size");
			Scanner in =new Scanner(System.in);
			int n1=in.nextInt();
			
			Stack1 ob=new Stack1(n1);
			for(int i =0;i<=n1;i++)
			{
				int n2=in.nextInt();
				ob.push(n2);	
			}
			ob.display();
			
			ob.peek();
			ob.display();
			ob.pop();
			ob.pop();
			ob.display();
			

		}

	}

