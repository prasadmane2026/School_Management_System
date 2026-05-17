import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentServices = new StudentService();
        TeacherServices teacherServices = new TeacherServices();

        while (true) {
            System.out.println("==================================================================");
            System.out.println("                    Welcome School Management System              ");
            System.out.println("==================================================================");

            System.out.println("1. Navigate To Student Management ");
            System.out.println("2. Navigate To Teacher Management");
            System.out.println("3. EXIT");

            System.out.println("==================================================================");
            System.out.println("            Thank You For Using School Management System          ");
            System.out.println("==================================================================");

            System.out.print("Enter your choice:  ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Label the loop so we can break out of it from inside the switch
                    studentLoop: while (true) {
                        System.out.println("==================================================================");
                        System.out.println("                    Welcome Student  Management Section              ");
                        System.out.println("==================================================================");

                        System.out.println("1. Add Student\n");
                        System.out.println("2. View Student\n");
                        System.out.println("3. Search Student\n");
                        System.out.println("4. Update Student School Information \n");
                        System.out.println("5. Update Student Personal Information");
                        System.out.println("6. Delete Student\n");
                        System.out.println("7. EXIT\n");

                        System.out.println("==================================================================");
                        System.out.println("            Thank You For Using Student  Management Section       ");
                        System.out.println("==================================================================");

                        System.out.print("Enter your choice: ");
                        int stdchoice = sc.nextInt();

                        switch (stdchoice) {

                            case 1:
                                System.out.print("Student ID: ");
                                int stdID = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Student Name: ");
                                String stdName = sc.nextLine();

                                System.out.print("Student Age: ");
                                int stdAge = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Student Learning Standard:  ");
                                int stdStandard = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Student Current Section: ");
                                char stdsection = sc.next().charAt(0);
                                sc.nextLine();

                                System.out.print("Student Address: ");
                                String stdAddress = sc.nextLine();

                                System.out.print("Student Contact No: ");
                                String stdContact = sc.nextLine();

                                Student student = new Student(stdID, stdName, stdAge, stdStandard, stdsection, stdAddress, stdContact);
                                studentServices.addStudent(student);
                                break;

                            case 2:
                                studentServices.viewAllStudents();
                                break;
                            case 3:
                                System.out.print("Student Id for Search: ");
                                int findStd = sc.nextInt();
                                sc.nextLine();
                                studentServices.searchStudentById(findStd);
                                break;
                            case 4:
                                System.out.println("Enter Student School information");
                                System.out.print("Student Id: ");
                                int updatedId = sc.nextInt();

                                System.out.print("Student updated Standard: ");
                                int updatedStd = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Student Updated Section: ");
                                char updatedSection = sc.next().charAt(0);
                                sc.nextLine();

                                studentServices.updateStudentSchoolDetails(updatedId, updatedStd, updatedSection);
                                break;

                            case 5:
                                System.out.println("Enter Student Personal Information");

                                System.out.print("Student Id: ");
                                int stdid = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Student Updated Name: ");
                                String updatedName = sc.nextLine();

                                System.out.print("Student updated Age: ");
                                int updatedAge = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Student updated Contact Number: ");
                                String updatedContactNo = sc.nextLine();

                                System.out.print("Student updated Address: ");
                                String updatedaddress = sc.nextLine();
                                studentServices.updateStudentPersonalDetails(stdid, updatedName, updatedAge, updatedContactNo, updatedaddress);
                                break;
                            case 6:
                                System.out.print("Student Id: ");
                                int fordeleteStd = sc.nextInt();
                                sc.nextLine();
                                studentServices.deleteById(fordeleteStd);
                                break;

                            case 7:
                                System.out.println("Exiting Student Section...");
                                break studentLoop; // Breaks out of the entire studentLoop
                            default:
                                System.out.println("Invalid choice: " + stdchoice);
                                System.out.println("Make choice between 1 to 7 ");
                                break;
                        }
                    }
                    break;

                case 2:
                    // Added a matching loop for the Teacher section so it doesn't close immediately
                    teacherLoop: while (true) {
                        System.out.println("==================================================================");
                        System.out.println("                    Welcome Teacher  Management Section              ");
                        System.out.println("==================================================================");

                        System.out.println("1. Add Teacher\n");
                        System.out.println("2. View Teacher\n");
                        System.out.println("3. Search Teacher\n");
                        System.out.println("4. Update Teacher Office Information \n");
                        System.out.println("5. Update Teacher Personal Information");
                        System.out.println("6. Delete Teacher\n");
                        System.out.println("7. EXIT\n");

                        System.out.println("==================================================================");
                        System.out.println("            Thank You For Using Teacher Management Section        ");
                        System.out.println("==================================================================");

                        System.out.print("Enter Choice: ");
                        int teacherchoice = sc.nextInt();
                        sc.nextLine();

                        switch (teacherchoice) {
                            case 1:
                                System.out.print("Teacher ID: ");
                                int tid = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Teacher Name: ");
                                String tname = sc.nextLine();

                                System.out.print("Subject Name: ");
                                String tsubject = sc.nextLine();

                                System.out.print("Teacher Contact No: ");
                                String tcontactNo = sc.nextLine();

                                System.out.print("Teacher Address: ");
                                String tAddress = sc.nextLine();

                                Teacher teacher = new Teacher(tid, tname, tsubject, tcontactNo, tAddress);
                                teacherServices.addTeacher(teacher);
                                break;

                            case 2:
                                teacherServices.viewAllTeachers();
                                break;

                            case 3:
                                System.out.print("Teacher Id for Search: ");
                                int findTeacher = sc.nextInt();
                                sc.nextLine();
                                teacherServices.findTeacher(findTeacher);
                                break;

                            case 4:
                                System.out.println("Enter Teacher Office Information");
                                System.out.print("Teacher Id: ");
                                int updatedTId = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Teacher Updated Subject: ");
                                String updatedTSubject = sc.nextLine();

                                teacherServices.updateTeacherOfficeDetails(updatedTId, updatedTSubject);
                                break;

                            case 5:
                                System.out.println("Enter Teacher Personal Information");
                                System.out.print("Teacher Id: ");
                                int tIdPersonal = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Teacher Updated Name: ");
                                String updatedTName = sc.nextLine();

                                System.out.print("Teacher Updated Contact Number: ");
                                String updatedTContact = sc.nextLine();

                                System.out.print("Teacher Updated Address: ");
                                String updatedTAddress = sc.nextLine();

                                teacherServices.updateTeacherPersonalDetails(tIdPersonal, updatedTName, updatedTContact, updatedTAddress);
                                break;

                            case 6:
                                System.out.print("Teacher Id for Deletion: ");
                                int fordeleteTeacher = sc.nextInt();
                                sc.nextLine();
                                teacherServices.deleteTeacherById(fordeleteTeacher);
                                break;

                            case 7:
                                System.out.println("Exiting Teacher Section...");
                                break teacherLoop; // Breaks out of the entire teacherLoop

                            default:
                                System.out.println("Invalid choice: " + teacherchoice);
                                System.out.println("Make choice between 1 to 7 ");
                                break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting School Management System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice: " + choice);
                    System.out.println("Make choice between 1 to 3 ");
                    break;
            }
        }
    }
}