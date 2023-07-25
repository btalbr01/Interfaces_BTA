
public class Process implements Priority, Comparable<Process> 
{
	protected String processID;
	protected int priority;
	
	public Process() {
		super();
		processID = "";
		priority = 0;
	}//end empty argument constructor
	
	public Process(String processID) {
		super();
		this.processID = processID;
	}//end preferred constructor

	@Override
	public void setPriority(int priority) 
	{
		this.priority = priority;		
	}//end setPriority

	@Override
	public int getPriority() 
	{
		return priority;
	}//end getPriority

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + ", getPriority()=" + getPriority() + "]";
	}//end toString

	@Override
	public int compareTo(Process value) 
	{
		if (this.priority == value.priority)
		{
		return 0;
		}
		else return 1;
	}//end compareTo
}//end class


