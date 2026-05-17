import java.util.ArrayList;

public class TeacherServices {

    private ArrayList<Teacher> teachers = new ArrayList<>();

    public  void addTeacher(Teacher teacher){
        boolean isIdExists = false;

        for(int i = 0; i<teachers.size(); i++){
            if (teachers.get(i).getTeacherID() == teacher.getTeacherID()){
                isIdExists = true;
                break;
            }
        }
        if (isIdExists){
            System.out.println("Teacher with this Id already Exists....!");
        }
        else {
            teachers.add(teacher);
            System.out.println("Teacher Data Added successfully....!");


        }
    }

    public void findTeacher(int tid){
        boolean isIdExists = false;

        for(Teacher t : teachers){

            if (t.getTeacherID() == tid){
                System.out.println(t);
                isIdExists = true;
                System.out.println("Teacher data found Successfully...!");
                break;
            }
        }
        if (!isIdExists) System.out.println("Teacher Data Not found Or invalid Teacher ID");
    }


    public  void updateTeacherOfficeDetails(int id, String subject){
        boolean isupdated = false;
        for(int i = 0; i<teachers.size(); i++){
            if(teachers.get(i).getTeacherID() == id){
                teachers.get(i).setSubject(subject);
                isupdated = true;
            }
        }
        if (isupdated){
            System.out.println("Teacher Office Details update Successfully");
        }
        else{
            System.out.println("Teacher Data not found or Invalid teacher id ");
        }
    }

    public void updateTeacherPersonalDetails(int id, String name, String contactNo, String address){
        boolean isupdated = false;

        for(int i = 0; i <teachers.size(); i++){

            if (teachers.get(i).getTeacherID() == id){
                teachers.get(i).setTeacherName(name);
                teachers.get(i).setTeacherContactNo(contactNo);
                teachers.get(i).setTeacherAddress(address);
                isupdated = true;
            }
        }

        if (isupdated){
            System.out.println("Teacher Personal Details update Successfully");
        }
        else{
            System.out.println("Teacher Data not found or Invalid teacher id ");
        }
    }

    public  void deleteTeacherById(int id){
        boolean isdeleted = false;

        for(int i = 0; i<teachers.size(); i++){
            if (teachers.get(i).getTeacherID() == id){
                teachers.remove(i);
                isdeleted = true;
                break;
            }
        }

        if (isdeleted){
            System.out.println("Teacher Data Deleted successfully");
        }
        else {
            System.out.println("Teacher Data not found or invalid teacher ID");
        }
    }
    public void  viewAllTeachers(){
        int count = 0;

        if (teachers.size() == 0){
            System.out.println("No Teacher Data Found...!");
        }
        else {
            for(Teacher t : teachers){
                System.out.println(t);
                count++;
            }
        }
        System.out.println("Total Teacher Count: " + count);
    }
}
