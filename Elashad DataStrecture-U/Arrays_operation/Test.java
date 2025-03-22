package Arrays_operation;

public class Test {

	public static void main(String[] args) {
		
		// create the values 
		Arrays login = new Arrays(6);
		login.insert(5, 6);
		login.insert(3, 3);
		login.insert(10, 2);
		login.insert(5, 6);
		
		System.out.println(login.getArr()[5]);       
		login.travesing();
		System.out.println(login.binary_search(6));
		
		
		
		

	}

}
