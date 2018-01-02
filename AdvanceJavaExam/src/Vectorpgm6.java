import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

 public class Vectorpgm6 {
	
		public static void main(String[] args) {
			/*Vector ele=new Vector();
			System.out.println(ele.capacity());
			*/
			
			/*Vector ele1=new Vector(5);
			System.out.println(ele1.capacity());
			
			
			ele1.add("123");
			ele1.add("sara");
			System.out.println(ele1.size());
			
			ele1.add("banu");
			ele1.add("anu");
			ele1.add("gagan");
			System.out.println(ele1.capacity());
		
			ele1.add("ani");
			System.out.println(ele1.capacity());*/
			
			Vector ele2=new Vector(3,5);
			System.out.println(ele2.capacity());
			ele2.add("T");
			ele2.add("E");
			ele2.add("K");
			ele2.add("A");
			ele2.add("R");
			ele2.add("C");
			ele2.add("H");
			Scanner in =new Scanner(System.in);
			System.out.println("Enter the number of Zs");
			int n=in.nextInt();
			//int n=5;
			while(n>=0) {
			ele2.add(2,"Z");
			//ele2.add(2,"Z");
			n--;}
			System.out.println(ele2.capacity());
			//System.out.println(ele2);
			
	System.out.println("contents of vector are=");

			Enumeration e=ele2.elements();
			while(e.hasMoreElements()){
				System.out.print(e.nextElement());
			}
			
		ele2.remove(5);
		ele2.remove(5);
		ele2.remove(5);
		System.out.println("contents of vector are=");

		Enumeration e1=ele2.elements();
		while(e1.hasMoreElements()){
			System.out.print(e1.nextElement());
		}
		
		}


}
