public class Employee {

    private int id;
    private String name;
    private String location;
    private String dept;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    Employee(int id, String name, String location, String dept) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.dept = dept;
    }





    public void work() {
        System.out.println("Working hours : 8");
    }

    public void rules() {

    }
}
