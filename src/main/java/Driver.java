import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Counttt:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Countttt:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Counttt:" + counter.getCount());
		
	}

}
