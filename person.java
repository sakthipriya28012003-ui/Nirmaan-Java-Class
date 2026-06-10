package bank;

public class person {
	String name;
	int age;
	int mark;
	int id;
	static class professor{
		String name;
		int age;
		int id;
		int salary;
		String subject;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person s= new person();
		s.name="sakthi";
		s.age=23;
		s.mark=56;
		s.id=1411;
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.mark);
		System.out.println(s.id);
		//create professor object
		professor p=new professor();
		p.name="priya";
		p.age=25;
		p.id=141;
		p.salary=12000;
		p.subject="computer";
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.id);
		System.out.println(p.salary);
		System.out.println(p.subject);
		
		
		

	}

}
