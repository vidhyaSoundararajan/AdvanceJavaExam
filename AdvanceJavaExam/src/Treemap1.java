
	import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

	public class Treemap1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TreeMap<Student,String> ele=new TreeMap<Student,String>(new MyNameComp());
			ele.put(new Student("Gaya",45,56)," Student1");
			ele.put(new Student("John",33,50)," Student2");
			//ele.put("111","john");
			//ele.put("11.4","aana");
			//ele.put("11.3",null);
			//ele.put("divya",null);
			//ele.put(null,"aanana");
			/*ele.put(3,33);
			ele.put(2,22);
			ele.put(5,55);
			ele.put(4,44);*/
			System.out.println(ele);
			Set<Student> keys = ele.keySet();
	        for(Student key:keys){
	            System.out.println(key+" ==> "+ele.get(key));
	        }
			//for(Object e:ele)
				//System.out.println(e);
		}

	}
	class MyNameComp implements Comparator<Student>{
		 
	    @Override
	    public int compare(Student e1, Student e2) {
	        return e1.getName().compareTo(e2.getName());
	    }
	}
