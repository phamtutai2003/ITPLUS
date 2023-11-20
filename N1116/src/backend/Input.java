package backend;

public interface Input {

	  java.util.Scanner scanner = new java.util.Scanner(System.in);

	    static int inputScannerInt() {
	        while (true) {
	            try {
	                return Integer.parseInt(scanner.nextLine());
	            } catch (NumberFormatException e) {
	                System.out.println("Vui lòng nhập số nguyên. Hãy thử lại.");
	            }
	        }
	    }

	    static String inputScannerString() {
	        return scanner.nextLine();
	    }

}
