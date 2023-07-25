
public class Task implements Priority, Comparable<Task>
{
	protected String name;
	protected int priority;
	enum Status {NOT_STARTED, IN_PROCESS, COMPLETE}
	protected Status curStatus;
	
	public Task() 
	{
		name = "";
		priority = 0;
	}//end empty argument constructor
	
	public Task(String name) 
	{
		super();
		this.name = name;
	}//end preferred constructor

	@Override
	public int compareTo(Task value) 
	{
		if (this.priority == value.priority)
		{
		return 0;
		}
		else return 1;
	}//end compareTo

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
	
	public void setStatus(Status position)
	{
		curStatus = position;
	}
	
	public Status getStatus()
	{
		return curStatus;
	}

	public String getName() 
	{
		return name;
	}//end getName

	public void setName(String name) {
		this.name = name;
	}//end setName

	@Override
	public String toString() 
	{
		return "Task [name=" + name + ", priority=" + priority + ", getPriority()=" + getPriority() + ", getName()="
				+ getName() + "]";
	}//end toString
}//end class
