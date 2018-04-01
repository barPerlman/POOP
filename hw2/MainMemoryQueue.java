package hw2;

public class MainMemoryQueue {
	
	/**
	 * circular queue implementation by an array
	 */
	private Page [] arr;
	
	private int front, numOfElements,capacity;
	
	
	/**
	 * constructor to init the main memory queue
	 * @param memorySize
	 */
	public MainMemoryQueue(int capacity){
		this.capacity=capacity;
		arr= new Page[capacity];
		front=0;
		numOfElements=0;
	}
	/**
	 * getters
	 */
	public int getCapacity(){
		return capacity;
	}
	public int getFront(){
		return front;
	}
	public int getNumOfElements(){
		return numOfElements;
	}
	
	/**
	 * the standard methods of queue
	 */
	
	public void enqueue(Page page){
		arr[(numOfElements+front)%capacity]=page;
		numOfElements++;
	}
	public Page dequeue(int keyIndex){
		Page res=arr[front];
		arr[front]=null;
		front=(front+1)%capacity;
		numOfElements--;
		return res;
	}
	/**
	 * The following method returns the string of the requested page if there is or null if there is no such page.
	 * @param index
	 * @return
	 */
	public String contains(int index){
		String ans=null;
		
		
		return ans;
	}
	public boolean isEmpty(){
		return numOfElements==0;
	}
	
}
