public class Courses {
    private String name;
    private String room;
    private Users teacher;

    public Courses(String name, String room, Users teacher) {
        this.name = name;
        this.room = room;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public Users getTeacher() {
        return teacher;
    }
}
