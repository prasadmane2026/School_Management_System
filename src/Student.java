public class Student {
    private  int studentID;
    private String studentName;
    private  int studentAge;
   private int studentStd;
   private char studentSection;
    private  String studetAddress;
    private String studentContactNo;

    public  void setStudentID(int studentID){
        this.studentID = studentID;
    }
    public  int getStudentID(){
        return  studentID;
    }
    public  void setStudentName(String studentName){
        this.studentName = studentName;
    }
    public String getStudentName(){
        return studentName;
    }

    public  void setStudentAge(int studentAge){
        this.studentAge = studentAge;
    }

    public  int getStudentAge(){
        return  studentAge;
    }

    public  void setStudentStd(int studentStd){
        this.studentStd = studentStd;
    }

    public  int getStudentStd(){
        return  studentStd;
    }

    public  void setStudentSection(char studentSection){
        this.studentSection = studentSection;
    }

    public char getStudentSection(){
        return studentSection;
    }

    public  void setStudentAddress(String studetAddress){
        this.studetAddress = studetAddress;
    }

    public  String getStudetnAddress(){
        return  studetAddress;
    }

    public  void setStudentContactNo(String studentContactNo){
        this.studentContactNo = studentContactNo;
    }

    public  String getStudentContactNo(){
        return  studentContactNo;
    }
    public Student(int studentID, String studentName, int studentAge, int studentStd, char studentSection, String studetAddress, String studentContactNo){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentStd = studentStd;
        this.studentSection = studentSection;
        this.studetAddress = studetAddress;
        this.studentContactNo = studentContactNo;
    }


    @Override
    public String toString() {
        return "----------------------------------------\n" +
                "             STUDENT DETAILS            \n" +
                "----------------------------------------\n" +
                " ID          : " + studentID + "\n" +
                " Name        : " + studentName + "\n" +
                " Age         : " + studentAge + "\n" +
                " Class & Sec : " + studentStd + " - " + studentSection + "\n" +
                " Address     : " + studetAddress + "\n" +
                " Contact No  : " + studentContactNo + "\n" +
                "----------------------------------------";
    }
}
