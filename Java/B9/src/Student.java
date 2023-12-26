public class Student<T> {
    private T id;
    private String name;
    private T score;

    public Student(T id, String name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }
    public void setId(T id) {
    	this.id = id;
    }

    public static void main(String[] args) {
        Student<Integer> std1 = new Student<>(1, "Van A");
        Student <Integer>  std2 = new Student<Integer>(1,"Quang");
    }
}
 