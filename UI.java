import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    public static String Scan() {
        Scanner scan = new Scanner(System.in);

        String answer = scan.nextLine();

        return answer;
    }
    
    public static String start() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please choose user type, (T)eacher, (S)tudent or (Q)uit: ");
        String answer = scan.nextLine();

        return answer;
    }

    public static String getUsername() {
        Scanner scan = new Scanner(System.in);

        System.out.print("username: ");
        String username = scan.nextLine();

        return username;
    }

    public static String getPassword() {
        Scanner scan = new Scanner(System.in);

        System.out.print("password: ");
        String password = scan.nextLine();

        return password;
    }

    public static String studentMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please type in command below");
        System.out.println("(enroll,drop,list course,show registcourse,show listroom,logout)");
        System.out.print(">> ");
        String answer = scan.nextLine();
        
        return answer;
    }

    public static String teacherMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please type in command below");
        System.out.println("(new course,list course,logout)");
        System.out.print(">> ");
        String answer = scan.nextLine();

        return answer;
    }
    
    public static void courseList(ArrayList<Courses> courses) {
        System.out.println("Coursename\tRoom\tTeacher");
        System.out.println("--------------------------------");
        for (int j = 0; j < courses.size(); j++) {
            System.out.println((j + 1) + ". " + courses.get(j).getName() + "\t" + courses.get(j).getRoom() + "\t"
                    + courses.get(j).getTeacher().getName());
        }
    }
    
    public static void roomList(ArrayList<Courses> courses) {
        System.out.println("List Room");
        System.out.println("--------------------------------");
        for (int j = 0; j < courses.size(); j++) {
            System.out.println((j + 1) + ". " + courses.get(j).getRoom());
        }
    }

    public static void registcourseList(ArrayList<Courses> courses) {
        System.out.println("Coursename\tRoom\tTeacher");
        System.out.println("--------------------------------");
        for (int j = 0; j < courses.size(); j++) {
            System.out.println((j + 1) + ". " + courses.get(j).getName() + "\t" + courses.get(j).getRoom() + "\t"
                    + courses.get(j).getTeacher().getName());
        }
    }

    public static void loginFailed() {
        System.out.println("Login incorrect, please try again");
    }

    public static void quit() {
        System.out.println("System shutdown!");
    }
}
