package staff;

public class StaffMember {

    private String name;
    private double salary;
    private String hireDate;
    private String endDate;

    public StaffMember(String name, double salary, String hireDate, String endDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) {return true;}
        if(obj == null){return false;}
        StaffMember staffMember = (StaffMember) obj;
        if(this.salary == staffMember.salary && this.name.equals(staffMember.name) && this.hireDate.equals(staffMember.hireDate) && this.endDate.equals(staffMember.endDate))
        {
            return true;
        }
        return true;
    }

    @Override
    public String toString() {
        return "The name of this staff is" + name + "The Salary of this staff is " + " " + salary + "Ill let you do the rest azzam";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
