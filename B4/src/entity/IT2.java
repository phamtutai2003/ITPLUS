package entity;

public class IT2  implements IStudy, IPlay{
	public int id ;
	public String name;
	public String email;
	public String clazz;
	
	@Override
	public void hoc() {
		System.out.println("hoc web");
	}
	public void lambaitap() {
		System.out.println("lam tren giay");
	}
	public void thi() {
		System.out.println("thi hoi dap");
	}
	
	@Override
	public void game() {
		System.out.println("espost");
	}
}
