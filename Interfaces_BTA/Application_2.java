
public class Application_2 {

	public static void main(String[] args) {
		Process p1 = new Process("Garbage collection");
		Process p2 = new Process("Free extra space");
		Task t1 = new Task("Paint fence");
		Task t2 = new Task("Cook dinner");
		
		p1.setPriority(5);
		p2.setPriority(5);
		t1.setPriority(10);
		t2.setPriority(1);
		
		if (p1.compareTo(p2) == 0)
		{
			System.out.println("p1 and p2 ARE equal priority");
		}
		else System.out.println("p1 and p2 ARE NOT equal priority");
		
		t1.setStatus(Task.Status.COMPLETE);
		t2.setStatus(Task.Status.NOT_STARTED);
		System.out.println("Task 1 is " + t1.getStatus());
		System.out.println("Task 2 is " + t2.getStatus());
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}//end main
}//end class