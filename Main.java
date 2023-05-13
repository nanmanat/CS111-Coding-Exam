import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Users> Student = new ArrayList<>();
        ArrayList<Users> Teacher = new ArrayList<>();
        ArrayList<Courses> courses = new ArrayList<>();

        // Add User
        Student.add(new Users("Student", "Ham", "h", "H"));
        Student.add(new Users("Student", "Bunlun", "b", "B"));
        Student.add(new Users("Student", "Nut", "n", "N"));
        Teacher.add(new Users("Teacher", "Krittakom", "k", "k"));
        Teacher.add(new Users("Teacher", "Worawan", "p", "p"));

        //Add Courses
        courses.add(new Courses("CS111", "7202", Teacher.get(0)));
        courses.add(new Courses("CS450", "7314", Teacher.get(0)));
        courses.add(new Courses("CS368", "7310", Teacher.get(1)));
        courses.add(new Courses("CS265", "7303", Teacher.get(1)));

        String answer;
        String username;
        String password;

        while (true) {

            boolean login = false;

            answer = UI.start();

            if (answer.equals("S") || answer.equals("s")) {
                username = UI.getUsername();
                password = UI.getPassword();
                for (Users i : Student) {
                    if (i.login(username, password)) {

                        login = true;

                        while (true) {
                            String option = UI.studentMenu();

                            switch (option) {
                                case "list course":
                                    UI.courseList(courses);
                                    break;
                                case "show listroom":
                                    UI.roomList(i.getCourses());
                                    break;
                                case "enroll":
                                    System.out.print("Course name: ");
                                    String name = UI.Scan();
                                    boolean success = false;
                                    for (Courses course : courses) {
                                        if (course.getName().equals(name)) {
                                            i.addCourse(course);
                                            System.out.println("Enroll successful");
                                            success = true;
                                            break;
                                        }
                                    }
                                    if (!success) {
                                        System.out.println("Enroll failed");
                                    }
                                    break;
                                case "show registcourse":
                                    UI.registcourseList(i.getCourses());
                                    break;
                                case "drop":
                                    System.out.print("Course name: ");
                                    String name1 = UI.Scan();
                                    boolean drop = i.removeCourse(name1);
                                    if (!drop) {
                                        System.out.println("Drop failed");
                                    }
                                    else {
                                        System.out.println("Drop successful");
                                    }
                                    break;
                                case "logout":
                                    System.out.println("Bye! see you again later");
                                    break;
                            }
                            if (option.equals("logout")) {
                                break;
                            }
                        }
                    }
                }
                if (!login) {
                    UI.loginFailed();
                }
            }
            else if (answer.equals("T") || answer.equals("t")) {
                username = UI.getUsername();
                password = UI.getPassword();
                for (Users i : Teacher) {
                    if (i.login(username, password)) {

                        login = true;

                        while (true) {
                            String option = UI.teacherMenu();

                            switch (option) {
                                case "list course":
                                    UI.courseList(courses);
                                    break;
                                case "new course":
                                    System.out.print("Course name: ");
                                    String name = UI.Scan();
                                    System.out.print("Room: ");
                                    String room = UI.Scan();
                                    courses.add(new Courses(name, room, i));
                                    System.out.println("Add course succesful");
                                    break;
                                case "logout":
                                    System.out.println("Bye! see you again later");
                                    break;
                            }
                            if (option.equals("logout")) {
                                break;
                            }
                        }

                        break;
                    }
                }
                if (!login) {
                    UI.loginFailed();
                }
            }
            else if (answer.equals("Q") || answer.equals("q")) {
                UI.quit();
                break;
            }
        }
    }
}
