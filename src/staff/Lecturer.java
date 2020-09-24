package staff;

public class Lecturer extends StaffMember {


    private String School;
    private String AcademicStatus;

    public Lecturer(String name, double salary, String hireDate, String endDate,String school,String academicStatus) {
        super(name, salary, hireDate, endDate);
        this.School = school;
        this.AcademicStatus =  academicStatus;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "School='" + School + '\'' +
                ", AcademicStatus='" + AcademicStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
        {
            return true;
        }

        // Ill let u figure this out, but u need to check whether it matches with the values in the super class as well as values in the subclass.

        return false;
    }
}
