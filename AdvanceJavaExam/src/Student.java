import java.util.Comparator;
import java.util.Objects;
import java.util.Objects;

	public class Student {
		private String name;
		private int marks;
		private int Regno;
		
		public Student(String name,int marks,int Regno) {
			this.name=name;
			this.marks=marks;
			this.setRegno(Regno);
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getmarks() {
			return marks;
		}
		public void setSem(int marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "name = " + this.name + " Regno = "+ this.Regno +  " marks = " + this.marks
					;
		}
		public int getRegno() {
			return Regno;
		}
		public void setRegno(int regno) {
			Regno = regno;
		}
		
		
		//@Override
		//public boolean equals(Object arg0) {
		//	return (((Student) arg0).name).equals(this.name);
		//}
		

	}

