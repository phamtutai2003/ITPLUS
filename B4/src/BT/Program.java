package BT;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog babydog1 = new Babydog();
		babydog1.name = "Cho";
		
		Babycat babycat1 = new Babycat();
		babycat1.name = "Meo";
		
		babydog1.sua();
		babycat1.sua();
		
		babydog1.eat();
		babycat1.eat();
		
		System.out.println(babydog1.name);
		System.out.println(babycat1.name);
	}

}
