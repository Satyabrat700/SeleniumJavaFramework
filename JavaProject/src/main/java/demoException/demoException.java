package demoException;

public class demoException{

	public static void main(String[] args) {
		
		try {
			operation();
		} catch (Exception e) {
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
					e.printStackTrace();
		}
		
		finally {
			System.out.println("Completed");
		}
	}
		

	private static void operation() throws Exception {
		
		
		System.out.println("Started");
		int i=10/0;
		
		
		
	}

}

	

