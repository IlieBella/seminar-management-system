package seminar.model;

public class Submission {
    private String studentName;
    private String title;

    public Submission(String studentName, String title) {
        this.studentName = studentName;
        this.title = title;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTitle() {
        return title;
    }
}

