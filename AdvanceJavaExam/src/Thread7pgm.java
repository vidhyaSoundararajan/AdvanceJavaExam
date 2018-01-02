
public class Thread7pgm extends Thread{
		
		String name;
		Thread7pgm(String name){
			this.name=name;
		}
	public void run(){
		//System.out.println(Thread.currentThread().getName());
		System.out.println(this.name+ " running");
		System.out.println("hello "+this.name);
		System.out.println("completed"+ this.name);
		
	}
		public static void main(String[] args) throws InterruptedException {
			//System.out.println(Thread.currentThread().getName());
			
			Thread7pgm t1=new Thread7pgm("thread1");
			Thread7pgm t2=new Thread7pgm("thread2");
			Thread7pgm t3=new Thread7pgm("thread3");
			t1.start();
			try{  
				  t1.join(1500);  
				 }catch(Exception e){System.out.println(e);}  
				  
				 t2.start();  
				 t3.start();  
			
System.out.println("All Threads Completed");
		}

	}



