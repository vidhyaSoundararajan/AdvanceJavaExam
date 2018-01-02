import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
public class TreeSet1 {
	
	    public static void main(String[] args)
	    {
	        
	    	Student s1=new Student("zanu",98,4523);
			Student s2=new Student("aana",56,8985);
			Student s3=new Student("zara",95,4423);
			Student s4=new Student("ghe",65,8935);
			//Student s3=new Student("aana1","4");
			//Student s4=new Student("john","7");
			//Student s5=new Student("john1","7");
	    	//MyNameComp comparator = new MyNameComp();
	 
	        //Creating TreeSet with 'MyComparator' as Comparator.
	 
	        TreeSet<Student> hlist = new TreeSet<Student>(new CompareTot());
	 
	        //TreeSet< Student> hlist=new TreeSet<Student>();
			hlist.add(s1);
			hlist.add(s2);
			hlist.add(s3);
			hlist.add(s4);
			//System.out.println(hlist);
	 System.out.println(hlist.size());
	 //System.out.println(hlist.it(1));
	 
	        //Iterating though TreeSet
	 
	        Iterator<Student> it = hlist.iterator();
	       // System.out.println(it);
	        while (it.hasNext())
	        {
	            System.out.println(it.next());
	        }
	    }
	}
	/*class MyNameComp implements Comparator<Student>{
		 
	    @Override
	    public int compare(Student s1, Student s2) {
	        return s1.getSem().compareTo(s2.getSem());
	    }
	} */  
	class CompareTot implements Comparator<Student> {
	    @Override
	    public int compare( Student s1, Student s2) {
	        if (s1.getmarks() < s2.getmarks())
	            return 1;
	        else
	            return -1;
	    }
	}
