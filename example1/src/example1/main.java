package example1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is better print order
		System.out.println("Hello World1");
		System.out.println("Hello World2");
		System.out.println("Hello World3");
		System.out.println("Hello World4");
		System.out.println("Hello World5");

		String s = "Hello world";

		System.out.println(s);
		
		for(int i=0;i<10;i++) {
			System.out.println("I:" + i);
		}
		
		System.out.println("Hello World Ended");
		Student std = new Student(1,"Aryan","ar@gmaial.com");
		System.out.println("Student Info: ");
		System.out.println("ID: "+ std.getName());
		System.out.println("Email: " + std.getEmail());
		System.out.println("ID: "+std.getId());
		
		System.out.println("--------------");
		
		
	}

}
