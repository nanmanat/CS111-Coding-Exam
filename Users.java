import java.util.ArrayList;

public class Users {

    private String status;
    private String name;
    private String username;
    private String password;
    private ArrayList<Courses> courses;

    public Users(String status, String name, String username, String password) {
        this.status = status;
        this.name = name;
        this.username = username;
        this.password = password;
        courses = new ArrayList<>();
    }

    public boolean login(String username, String password) {
        if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
    
    public void addCourse(Courses course) {
        courses.add(course);
    }

    public boolean removeCourse(String name) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getName().equals(name)) {
                courses.remove(i);
                return true;
            }
        }
        
        return false;
    }

    public ArrayList<Courses> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

