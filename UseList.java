public class UseList {

	public static void main(String[] args) {
		SimpleList sList = new SimpleList();

		sList.ADD(1);
		sList.ADD(2);
		sList.ADD(3);
		sList.ADD(4);
		sList.ADD(5);

	    System.out.println(sList);

	    sList.DELETE(3);

	    System.out.println(sList);

	    sList.ADDINTO(1, 6);
	    sList.ADDINTO(5, 7);

	    System.out.println(sList);
	  }

}
