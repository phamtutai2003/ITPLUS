import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {
	static final String duongdan1 = "D:\\ITPLUS";
	static final String duongdan2 = "D:\\ITPLUS\\student.ser";
	static final String duongdan3 = "D:\\ITPLUS\\demo2.txt";
	public static void main(String[] args) throws IOException {
		//kiemtrafile();
		//taofile();
		//kiemtra();
		//danhsachfile();
		docfile();
		//ghifile();
	}
	public static void kiemtrafilecosan() {
		File file = new File(duongdan2);
		if (file.exists()) {
			System.out.println("File co san");
		}
		else {
			System.out.println("File khong co san");
		}
	}
	public static void taofile() throws IOException {
		File file = new File(duongdan2);
		if (file.createNewFile()) {
			System.out.println("Da tao file");
		}
		else {
			System.out.println("Chua tao duoc file");
		}
	}
	public static void kiemtra() {
		File file = new File(duongdan3);
		if(file.isFile()) {
			System.out.println("Day la 1 file");
		}else {
			System.out.println("Day khong phai la 1 file");
		}
	}
	public static void kiemtrathumuc() {
		File file = new File(duongdan3);
		if(file.isDirectory()) {
			System.out.println("Day la thu muc");
		}else {
			System.out.println("Day khong la thu muc");
		}
	}
	public static void danhsachfile() {
		File file = new File(duongdan3);
		for (String fileName : file.list()) {
			System.out.println(fileName);
		}
	}
	public static void docfile() throws IOException {
		FileInputStream fileinput = new FileInputStream(duongdan2);
		byte[] b = new byte[1024];
		int length = fileinput.read(b);
		while(length>0) {
			String content = new String(b,0,length);
			System.out.println(content);
			//System.out.println("--------------------");
			length = fileinput.read(b);
		}
		fileinput.close();
	}
	public static void ghifile() throws IOException {
		String content = "Hello IT Plus";
		FileOutputStream fileoutput = new FileOutputStream(duongdan1,true);
		// true: ghi them vao
		// false: xoa het di moi ghi them vao
		fileoutput.write(content.getBytes()); // Xuong dong
		fileoutput.write(System.lineSeparator().getBytes());
		System.out.println("Da ghi file");
		fileoutput.close();	
	}
// Tao 1 class Student -> Tao 3 ong student
// Ghi ra 1 file student.txt
	}