import  java.util.*;
import java.io.*;
public class StudentService {


    private  ArrayList<Student> students = new ArrayList<>();

    StudentService(){
        loadStudentsFromFile();
    }

    public void loadStudentsFromFile() {

        try {

            FileReader fileReader = new FileReader("src/students.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);

                String name = parts[1];

                int age = Integer.parseInt(parts[2]);

                int std = Integer.parseInt(parts[3]);

                char section = parts[4].charAt(0);

                String address = parts[5];

                String contact = parts[6];

                Student student = new Student(
                        id,
                        name,
                        age,
                        std,
                        section,
                        address,
                        contact
                );

                students.add(student);
            }

            bufferedReader.close();

        } catch (Exception e) {

            System.out.println("Error while loading student data");
        }
    }
    public  void addStudent(Student student){
        boolean isIDExists = false;
        for(int i = 0; i<students.size(); i++){
           if(students.get(i).getStudentID() == student.getStudentID()){
                isIDExists = true;
                break;
           }
        }

        if (isIDExists){
            System.out.println("Student with this ID already exists ");
        }
        else {
            students.add(student);
            try {
                FileWriter fileWriter =  new FileWriter("src/students.txt",true);

                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                String data =
                        student.getStudentID() + " , " +
                        student.getStudentName() + " , " +
                        student.getStudentAge() + " , " +
                        student.getStudentStd() + " , " +
                        student.getStudentSection() + " , " +
                        student.getStudetnAddress() + " , " +
                        student.getStudentContactNo();

                bufferedWriter.write(data);
                bufferedWriter.newLine();
                bufferedWriter.close();
                System.out.println("Student Added successfully");
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("Error while Writing data");
            }
        }

    }
    public  void viewAllStudents(){
        if (students.size() == 0){
            System.out.println("No Students Present");
        }
        else {
            System.out.println("All Students in School : => ");
            for (Student s : students) {

                System.out.println(s );
            }
        }
    }
    public  void searchStudentById(int id){
        boolean isfound = false;
        for (Student s : students){
            if (s.getStudentID() == id){
                System.out.println("Student Found Successfully");
                System.out.println(s);
                isfound = true;
                break;
            }
        }
        if (!isfound) System.out.println("Student Not Found or incorrect Student id");
    }

    public  void deleteById(int id){
        boolean isfound = false;
        for(int i = 0; i < students.size(); i++){
            if (students.get(i).getStudentID() == id){
                System.out.println("Student deleted successfully");
                students.remove(i);
                isfound = true;
                break;
            }
        }

        if (!isfound)  System.out.println("Student not found or incorrect Student ID");

    }
    public  void updateStudentSchoolDetails(int id,int newStandard, char newSection){
        boolean isfound = false;
        for(int i = 0; i < students.size(); i++){
            if (students.get(i).getStudentID() == id){
                students.get(i).setStudentStd(newStandard);
                students.get(i).setStudentSection(newSection);
                isfound = true;
                break;
            }
        }

        if (isfound){
            System.out.println("Student School details updated successfully");
        }
        else {
            System.out.println("Student Not found or Incorrect student Id");
        }
    }

    public  void updateStudentPersonalDetails(int id,String name,int age, String contactno, String address){
        boolean isfound = false;
        for(int i = 0; i<students.size(); i++){

            if (students.get(i).getStudentID() == id){
                students.get(i).setStudentName(name);
                students.get(i).setStudentAge(age);
                students.get(i).setStudentContactNo(contactno);
                students.get(i).setStudentAddress(address);
                isfound = true;
                break;
            }
        }

        if (isfound){
            System.out.println("Student Personal details updated successfully");
        }
        else {
            System.out.println("Student Not found or Incorrect student Id");
        }
    }
    public  void countTotalStudentCount(){
        System.out.println("Total No of Student in School is: " + students.size());
    }
}
