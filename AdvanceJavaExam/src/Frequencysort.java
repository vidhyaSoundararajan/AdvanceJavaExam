
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

		  public class Frequencysort {
		    public static void main(String[] args) {
		     int array[] = {5,2,8,8,5,5,8,1,1,2};
		     HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

		     for (int i = 0; i < array.length; i++) {
		        if (data.containsKey(array[i])) {
		            Integer count = data.get(array[i]) + 1;
		            data.put(array[i], count);
		        } else {
		            data.put(array[i], 1);
		        }
		    }
		     
	//System.out.println(data);
	/*set s=data.entrySet();
	Iterator e=s.iterator();
	while(e.hasNext()){
		Map.Entry me=(Entry) e.next();
		int c= (int) me.getValue();
		while(c>=0) {
			//System.out.print(me.getKey());	
		//System.out.println("map key="+me.getKey()+"map value="+me.getValue());
		c--;
		}
	}*/
		

	//================================================================
		    Set<Entry<Integer, Integer>> set = data.entrySet();
		    ArrayList<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
		    Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
		       
		    	public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
		            return (o2.getKey()).compareTo(o1.getKey());
		        }
		    });
		    for (Entry<Integer, Integer> entry : list) {
		    	int c =entry.getValue();
		    	while(c>0)
		    	{
		    		System.out.print(entry.getKey()+"  " );
		    		c--;
		    	}
		        //System.out.println(entry.getKey() + " <-> " + entry.getValue());
		    }

		 }
		}



