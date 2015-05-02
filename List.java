public class List {
	  public int Data;
	  public List next;
	  public List previous;

	  public List(int id) {
		  Data = id;
	  }
	  public String toString() {
	    return Data + " ";
	  }
}
