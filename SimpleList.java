public class SimpleList {
	 private List first;
	 private List last;

	  public SimpleList() {
	    first = null;
	    last = null;
	  }
	  public boolean isEmpty() {
	    return first == null;
	  }

	  public void ADD(int dd) {
	    List newLink = new List(dd);
	    if (isEmpty()){
	      first = newLink;
	    }else {
	      last.next = newLink;
	      newLink.previous = last;
	    }
	    last = newLink;
	  }

	  public boolean ADDINTO(int key, int dd) {
	    List current = first;
	    while (current.Data != key) {
	      current = current.next;
	      if (current == null){
	        return false;
	      }
	    }
	    List newLink = new List(dd);

	    if (current == last) {
	      newLink.next = null;
	      last = newLink;
	    } else {
	      newLink.next = current.next;

	      current.next.previous = newLink;
	    }
	    newLink.previous = current;
	    current.next = newLink;
	    return true;
	  }



	  public List DELETE(int key) {
	    List current = first;
	    while (current.Data != key) {
	      current = current.next;
	      if (current == null)
	        return null;
	    }
	    if (current == first){
	      first = current.next;
	    }else{
	      current.previous.next = current.next;
	    }
	    
	    if (current == last){
	      last = current.previous;
	    }else{
	      current.next.previous = current.previous;
	    }
	    return current;
	  }

	  public String toString() {
	    String str = "";
	    
	    List current = first;
	    while (current != null) {
	      str += current.toString();
	      current = current.next;
	    }

	    return str;
	  } 

} 
