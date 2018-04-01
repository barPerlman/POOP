package hw2;

/**
 * 
* @author Bar Perlman 305026882
 * 		   Ron Ohana 203314604
 */
public class Page {
	
	private String content;//string content of a certain page
	private int key;//the key= index of the page in the array of the second memory
	private int lastModified;//this value tells when about in the queue this page has been modified by a read or write
	
	/**
	 * constructor
	 * @param content
	 * @param key
	 */
	public Page(String content,int key,int lastModified){
		this.content=content;
		this.key=key;
		this.lastModified=lastModified;
	}
	/**
	 * getters
	 */
	public int getKey(){
		return key;
	}
	public String getContent(){
		return content;
	}
	/**
	 * setters
	 */
	public void setKey(int key){
		this.key=key;
	}
	public void setContent(String content){
	this.content=content;

	}
}