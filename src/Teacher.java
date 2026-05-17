public class Teacher {

    private  int teacherID;
    private  String teacherName;

    private  String subject;

    private  String teacherContactNo;
    private  String teacherAddress;

    public Teacher(int teacherID, String teacherName, String subject, String teacherContactNo, String teacherAddress) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherContactNo = teacherContactNo;
        this.teacherAddress = teacherAddress;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherContactNo() {
        return teacherContactNo;
    }

    public void setTeacherContactNo(String teacherContactNo) {
        this.teacherContactNo = teacherContactNo;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    @Override
    public String toString() {
        return "----------------------------------------\n" +
                "             TEACHER DETAILS            \n" +
                "----------------------------------------\n" +
                " ID          : " + teacherID + "\n" +
                " Name        : " + teacherName + "\n" +
                " Subject     : " + subject + "\n" +
                " Contact No  : " + teacherContactNo + "\n" +
                " Address     : " + teacherAddress + "\n" +
                "----------------------------------------";
    }
}
