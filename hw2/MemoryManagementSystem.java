package hw2;
/**
 * 
 * @author Bar Perlman 305026882
 * 		   Ron Ohana 203314604
 */
import java.util.Arrays;


public class MemoryManagementSystem{
	public String[] secondaryMemory; //array of strings for second memory
	private boolean useLRU; //this value constitutes as a flag tells in which exchange method to choose
	public MainMemoryQueue mainMemmory;//initialize of main memory array of pages
	public static int updatesCounter=0;//count the amount of updates were made to pages 
	
	/**
	 * constructor
	 * @param mainMemorySize
	 * @param secondaryMemorySize
	 * @param useLRU
	 */
	public MemoryManagementSystem(int mainMemorySize, int secondaryMemorySize, boolean useLRU) {
		this.secondaryMemory=new String[secondaryMemorySize];//init secondary momory with its size
		this.useLRU=useLRU;
		
		//initialize memories:
		secondaryMemory=new String[secondaryMemorySize];
		mainMemmory=new MainMemoryQueue(mainMemorySize);
		initSecondMemory();
		initMainMemory();
	}

	@Override
	public String toString() {
		return "secondaryMemory=" + Arrays.toString(secondaryMemory);
	}
	
	public String read(int index) {
		updatesCounter++; //raise this counter in each call to read/write
		//update the page last modified
		
		//first we check if there is a page with this key=index in the main memory and if so returns its content
		if(mainMemmory.contains(index)!=null)
			return mainMemmory.contains(index);
			
		else{
		//else, we exchange with the corresponding method between the requested page to some page according to the method and then returns its content.
		 if(useLRU){
			 LRUExchange();
		 }
		 else{
			 FifoExchange();
		 }
		 return mainMemmory.contains(index);
		}
	}

	public void write(int index, char c) {
		updatesCounter++;//raise this counter in each call to read/write
		String str="";
		//first we check if there is a page with this key=index in the main memory and if so concat to the end of its content
		
			//else, we exchange with the corresponding method between the requested page to some page according to the method and then writes to its content.
		
		
		
		
		
		
		
	}
	/**
	 * the following method exchange between pages by fifo strategy
	 */
	public void FifoExchange(){
		
	}
	/**
	 * the following method exchange between pages by LRU strategy 
	 */
	public void LRUExchange(){
		
	}
	private void initSecondMemory(){ // first initialization of second memory array
		for(int i=0;i<secondaryMemory.length;i++){
			secondaryMemory[i]="";
		}
	}
	private void initMainMemory(){ // first initialization of main memory array
		for(int i=0;i<mainMemmory.getCapacity();i++){
			mainMemmory.enqueue(new Page(secondaryMemory[i], i, 0)); 
		}
	}
	
	
}
