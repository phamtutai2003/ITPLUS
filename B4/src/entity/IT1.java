package entity;

public class IT1 implements IStudy{
	public int id ;
	public String name;
	public String email;
	public String clazz;
	
	public  void lamduan() {
		System.out.println("lam du an");
	}
	@Override
	public void hoc() {
		System.out.println("hoc Java");
	}
	public void lambaitap() {
		System.out.println("Lam bai tap tren may");
	}
	public void thi() {
		System.out.println("thi van dap");
	}
}
