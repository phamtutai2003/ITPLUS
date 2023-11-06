package entity;

public class Student {
	private static int count = 0;
	private int id;
	private String name;
	private String hometown;
	private float mark;
	
	public Student(String name, String hometown) {
		//id tu dong tang
		count ++;
		this.id = count;
		this.name = name;
		this.hometown = hometown;
		this.mark = 0;
	}
	
	public void diemthuong(float diem) {
		this.mark += diem;
		
		//mark = mark + diem
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		String hienthi = id + " - " + name + " - " + hometown + " - " + mark + " - ";
		if (this.mark < 4.0) {
			hienthi = hienthi + "Yeu";
		} 
		else if (this.mark > 4.0 && this.mark < 6.0) {
			hienthi = hienthi + "Trung binh";
		}
		else if (this.mark > 6.0 && this.mark < 8.0) {
			hienthi = hienthi + "Kha";
		}
		else {
			hienthi = hienthi + "Gioi";
		}
		return hienthi;
	}
	
}